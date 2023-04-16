class pen{
    String color;
    String type;


    public void write(){
        System.out.println("Writing Something");
    }
    public void printcolor(){
        System.out.println(this.color);
    }
}
class Student{
    String name;
    int age;

    public void printname(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
    Student(String name , int age){
        this.name = name;
        this.age = age;
    }
}


public class OOPs {
    public static void main(String[] args) {
        pen pen1 = new pen();
        pen1.color = "blue";
        pen1.type = "gel";

        pen1.printcolor();


        Student s1 = new Student("Aman" , 24);
        s1.printname();
    }
}
