

public class Demo {
    public static void main(String[] args) {
        
        //String name = new String("Krishna"); // String is a class in Java.
        // But you can create String object as below instead above.
        String name = "Krishna";
        
        System.out.println(name);
        
        // String variable/object has many methods. below are few examples.
        System.out.println(name.hashCode());
        System.out.println("Hello " + name);

        System.out.println(name.charAt(2));
        System.out.println(name.concat(" Sai"));

        System.out.println(name.contains("xy")); // this returns boolean value: true or false.

    }
}
