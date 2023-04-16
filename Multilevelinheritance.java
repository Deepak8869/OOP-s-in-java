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
class Equilateraltriangle extends Triangle{
    public void area(int length , int height){
        System.out.println(1/2*length*height);
    }
}


public class Multilevelinheritance {
    
}
