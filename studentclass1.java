public class studentclass1 {
   static class student{
        String name;
        int  rolno;
        float marks;

       // we need the way to add the values of the above peoperties object by object
        student(){
           this.name = "Deepak";
           this.rolno = 12;
           this.marks = 123.3f;
        }
    }
    public static void main(String[] args) {
        student x = new student();
       
        System.out.println(x.name);
        System.out.println(x.rolno);
        System.out.println(x.marks);
    }
}
