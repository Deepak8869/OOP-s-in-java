public class studentclass {
    //creating new datatype 
   static class student{
        String name;
        int rollno;
        double percent;
    }
    public static void main(String[] args) {
        student x = new student();//declaration     
        x.name = "Deepak";
        x.rollno = 104;
        x.percent = 83.2;
        System.out.println(x.name);
    }
}
