import java.util.HashMap;

class DateClass {
    private int date;
    private int month;
    private int year;

    public DateClass(int date, int month, int year) {
        this.date = date;
        this.month = month;
        this.year = year;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + date;
        result = prime * result + month;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        DateClass other = (DateClass) obj;
        if (date != other.date)
            return false;
        if (month != other.month)
            return false;
        return true;
    }

    public int getYear() {
        return year;
    }
}

public class Assignment3Q4 {

    public static void main(String[] args) {
        HashMap<DateClass, String> dob = new HashMap<>();
        dob.put(new DateClass(15, 2, 1990), "Gaurav");
        dob.put(new DateClass(15, 2, 1992), "Rahul");
        dob.put(new DateClass(16, 2, 1990), "Nishant");
        dob.put(new DateClass(15, 3, 1990), "Anand");

        System.out.println(getEmployee(dob, "Gaurav"));
        System.out.println(getEmployee(dob, "Anand"));
    }

    public static String getEmployee(HashMap<DateClass, String> dob, String employeeName) {
        for (DateClass key : dob.keySet()) {
            if (dob.get(key).equals(employeeName)) {
                int count = 0;
                int year = 0;
                for (DateClass key2 : dob.keySet()) {
                    if (key.equals(key2)) {
                        count++;
                        year = key2.getYear();
                    }
                }
                if (count == 1) {
                    return employeeName;
                } else if (count > 1) {
                    for (DateClass key2 : dob.keySet()) {
                        if (key.equals(key2) && key.getYear() != year) {
                            return null;
                        }
                    }
                    return employeeName;
                }
            }
        }
        return null;
    }
}
