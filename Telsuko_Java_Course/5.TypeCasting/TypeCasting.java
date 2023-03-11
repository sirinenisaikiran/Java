// Type conversion and Casting.
// conversion -- autmatic conversion.
// Casting -- explict conversion.

public class TypeCasting {
    public static void main(String args[])
    {
        byte b = 127;
        int a = b; // type conversion and it is implicit. small to big.
        System.out.println(b);
        System.out.println(a);

        int c = 257;
        byte k = (byte) c; // casting ; big to small.
        System.out.println(k);

        float f = 5.7f;
        int i = (int) f; // casting ; big to small.
        System.out.println(i); 

        // Type promotion.

        byte b1 = 10;
        byte b2 = 30;
        int i1 = b1 * b2; // multiplication of two byte numbers is crossing byte capacity so type promotion happend automatically. so it is called type promotion.
        System.out.println(i1);

    }
}
