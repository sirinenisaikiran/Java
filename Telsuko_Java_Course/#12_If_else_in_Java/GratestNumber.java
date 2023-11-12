public class GratestNumber {

    public static void main(String arg[])
    {
        int x = 5;
        int y = 7;
        int z = 3;

        if(x>y)
        {
            if (x>z)
                System.out.println(x);
            else
                System.out.println(z);
        }
        else
        {
            if (y>z)
                System.out.println(y);
            else
                System.out.println(z);
        }
    }
    
}
