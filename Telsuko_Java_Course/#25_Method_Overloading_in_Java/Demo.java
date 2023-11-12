class Calculator
{
    /*  Method overloading. 
        
        This about number of and type of parameters.
        Method's return type doesn't matter.
    */
    public int add(int n1, int n2)
    {
        return n1 + n2;
    }

    public int add(int n1, int n2, int n3)
    {
        return n1 + n2 + n3;
    }

    public double add(double n1, int n2, int n3)
    {
        return n1 + n2 + n3;
    }
}

public class Demo
{
    public static void main(String[] args) 
    {
        Calculator obj = new Calculator();
        int r1 = obj.add(4,5);
        System.out.println("r1: " + r1);

        int r2 = obj.add(4,5,6);
        System.out.println("r2: " + r2);

        double r3 = obj.add(43345,5,6);
        System.out.println("r3: " + r3);
    }
}