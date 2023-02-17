import java.util.Comparator;
import java.util.TreeSet;

class Person{

    private String name;
    private int height;
    private double weight;
    public Person(String name, int height, double weight) {
        this.name=name;
        this.height= height;
        this.weight=weight;

    }
    public double getWeight() {
        return weight;
    }
    public  void setWeight(double weight){
        this.weight=weight;
    }
    public int getHeight() {
        return height;
    }
    public void setHeight(int height){
        this.height= height;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name= name;
    }
}
class heightComparator implements Comparator<Person> {
    public int compare(Person p1, Person p2) {
        if (p1.getWeight() == p2.getWeight()) {
            int compared = Integer.compare(p1.getHeight(), p2.getHeight());
            return compared;
        } else {
            int compared = Double.compare(p1.getWeight(), p2.getWeight());
            return compared;
        }
    }
}
public class Assignment3Q1 {
    public static void main(String[] args) {
         TreeSet<Person> set2= new TreeSet<>(new heightComparator());
         set2.add(new Person("Gourav" , 5, 67));
         set2.add(new Person("Rahul" , 5, 55));
        set2.add(new Person("Nishant" , 5, 62));
        set2.add(new Person("Pusphak" , 5, 59));
        set2.add(new Person("Anand" , 5, 61));
        set2.add(new Person("Aditya" , 6, 75));
        System.out.println("Arrange in weight first if the weight are equal then based upon height");
        for (Person e : set2){
            System.out.println(e.getName() + " " + e.getHeight() + " " + e.getWeight());

        }

    }

}
