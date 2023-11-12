public class Sample2
{
    public static void main(String[] args) 
    {
        for(int i=1;i<=7;i++)
        {
            System.out.println("DAY " + i);

            // for(int j=1;j<=9;j++)
            // {
            //     System.out.println(" " + (j+8) + " - " + (j+9));
            // }
        }   
        
        // with out increament in for loop.
        for(int j=1;j<=5;)
        {
            System.out.println(j);
            j++;
        }
    
        // without intialization in for loop.
        int k = 1;
        for(;k<=5;)
        {

            System.out.println("Hello " + k);
            k++;
        }

        // without condition in for loop.
        for(int l=1;;l++)
        {
            if(l>5) break;
            System.out.println("Say Hello" + l);
        }
    }
}