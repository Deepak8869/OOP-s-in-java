
class shape{
    public void area(){
        System.out.println("Displays area");
    }
}
class Triangle extends shape{
    public void area(int length , int height){
        System.out.println(1/2*length*height);
    }
} 
class circle extends shape{
    public void area(int r){
        System.out.println((3.14)*r*r);
    }
}

public class hierarchialinheritance {
    
}
