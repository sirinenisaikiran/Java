public class Demo {
    public static void main(String[] args) {
        
        int num[] = {5,6,7,8};
        int num1[] = new int[4];

        for(int i=0;i<=3;i++)
            System.out.println(num[i]);

        System.out.println(""); 
        System.out.println(""); 
        num[3] = 99;
        for(int i=0;i<=3;i++)
        {
            System.out.println(num[i]);        
            num1[i] = num[i];
        }
        
        System.out.println(""); 
        System.out.println(""); 

        for(int i=0;i<=3;i++)
            System.out.println(num1[i]);        
    }
}
