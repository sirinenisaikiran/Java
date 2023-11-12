class Sample
{
    public static void main(String arg[])
    {
        int a = 5, b=2, res;
        res = a + b;
        System.out.println(res);

        res = a - b;
        System.out.println(res);

        res  = a * b;
        System.out.println(res);

        float res1 = (float) a / b;
        System.out.println(res1);

        res = a % b;
        System.out.println(res);

        a = 5;
        int result;

        a++; // post - increament 
        ++a; // pre - increament
        System.out.println(a);

        a = 5;
        result = a++; // assign value first and then do increament.
        System.out.println(result);

        a = 5;
        result = ++a; // increament and then assign value.
        System.out.println(result);        

    }
}