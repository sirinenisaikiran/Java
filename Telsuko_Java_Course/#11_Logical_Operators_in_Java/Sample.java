class Sample
{
    public static void main(String args[])
    {
        int x = 5;
        int y = 9;
        int a = 6;
        int b  = 3;

        boolean result = x < y && a < b;
        System.out.println(result);

        result = x < y || a < b;
        System.out.println(result);

        result = ! (a > b);
        System.out.println(result);

        result = x > y;
        System.out.println(!result);
    }
}