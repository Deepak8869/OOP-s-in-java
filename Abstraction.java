abstract class animal{
    abstract void walk();
}
class Horse extends animal{
    public void walk(){
        System.out.println("Walk on 4 legs");
    }
}
class Chicken extends animal{
    public void walk(){
        System.out.println("Wals on  2 leg");
    }
}

public class Abstraction {
      public static void main(String[] args) {
        Horse horse = new Horse();
        horse.walk();
      }
}
