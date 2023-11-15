public class Demo {
    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer();
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        sb.append("naveen reddy 12345678901234567890");
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        System.out.println(sb);

        //you can delete data b/w to posions.
        sb.delete(0, 53);
        System.out.println(sb);
        System.out.println(sb.length());
        sb.append("naveen reddy");
        System.out.println(sb);

        // converStringBuffer data to string.
        String str = sb.toString();
        System.out.println(str);

        // insert also
        sb.insert(0,"Java ");
        System.out.println(sb);

        // add certain # of spaces.
        sb.setLength(20);
        System.out.println(sb);

        // set minimum capacity.
        sb.ensureCapacity(100);


        // StringBuffer is thread safe and StringBuilder is not. where as methods are same for both.
        

        
    }
    
}
