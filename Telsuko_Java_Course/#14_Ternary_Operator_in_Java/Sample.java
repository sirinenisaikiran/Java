public class Sample
{
    public static void main(String[] args) 
    {
        int x = 9;
        int result = 0;

        // if(x%2==0)
        //     result = 10;
        // else
        //     result = 20;

        result = x%2==0 ? 10 : 20; // Ternary operator.
        System.out.println(result);    
    }
}