public class DataTypes {

    public static void main(String a[])
    {

        byte by = 127; // 1 byte. from -128 to 127 
        System.out.println(by);

        short sh = 558; // 2 byes
        System.out.println(sh);

        int i = 99; // 4 bytes
        System.out.println(i);
       
        long l = 99999l; // 8 bytes. Here you need to provide 'l' after number.
        System.out.println(l);

        float percentage = 88.13f; // 4 bytes
        double average = 72.56; // 8 bytes
        System.out.println(percentage);
        System.out.println(average);
        
        char c = '@'; // 2 bytes. characters should have single quotes only. where as sting should have double quotes.
        System.out.println(c);

        boolean b1 = true;
        boolean b2 = false;
        System.out.println(b1);
        System.out.println(b2);


    }
    
}
