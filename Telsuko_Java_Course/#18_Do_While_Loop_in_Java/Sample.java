public class Sample
{
    public static void main(String[] args) 
    {
        int i = 5;
        
        // i want to execute the block eventhough condtion is false. for this case we need to use do while loop.
        do
        {
            System.out.println("Hi " + i);
            i++;
        }while(i<=4);
    }
}