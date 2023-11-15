class Calculator
{
    int num = 5;

    public int add(int n1, int n2)
    {
        return n1 + n2;
    }
}
public class Demo {
    public static void main(String[] args) {
        
        Calculator obj1 = new Calculator();
        Calculator obj2 = new Calculator();

        obj1.num=8;
        System.out.println(obj1.num);
        obj2.num=10;
        System.out.println(obj2.num);
    }
}
