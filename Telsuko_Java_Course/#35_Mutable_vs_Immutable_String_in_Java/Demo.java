public class Demo {
   public static void main(String[] args) {
    
    String name = "Krishna";
    System.out.println(name + " : " + name.hashCode());
    name = name + " Sai";
    System.out.println(name + " : " + name.hashCode());
    System.out.println("hello " + name);

    String s1 = "naveen";
    String s2 = "naveen";
    String s3 = "sai";

    System.out.println(s1 + " : " + s1.hashCode());
    System.out.println(s2 + " : " + s2.hashCode());
    System.out.println(s3 + " : " + s3.hashCode());

    // Mutable String --> can be changed.
    // Immutable String --> unchanged.
    // By default String is immutable.

    /*  String Buffer
        String Builder
        These two provide a way to implement mutable String.
    */

   } 
}
