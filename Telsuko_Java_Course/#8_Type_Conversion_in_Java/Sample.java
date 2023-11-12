class Sample
{
    public static void main(String arg[])
    {
        // Type conversion or Type casting.
        // int types - byte, short, int, long
        // float types - float, double
        // char type char
        // boolean type boolean

        byte a = 4;
        int b = 5;

        b = a; // inplicit type conversion 
        a = (byte) b; // explicit type converstion

        float f = 5.6f;
        int x = (int) f;
        System.out.println(x);

        byte by = 127;
        int n = by;
        System.out.println(by);
        System.out.println(n);

        int num1 = 257;
        byte b1 = (byte) num1; // 257%256 = 1
        System.out.println(b1);

        float f1 = 5.6f;
        int t = (int) f;
        System.out.println(t);

        // type promotion

        byte by1 = 10;
        byte by2 = 30;

        int result = by1 * by2; // --> This is type promotion. 300 is outside byte rage so automatically type is promoted for product of two bytes
        System.out.println(result);


    }
}