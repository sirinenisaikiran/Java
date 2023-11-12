public class Sample2 
{
    public static void main(String[] args) 
    {
        // switch case without break.
        String day = "Friday";

        // switch(day)
        // {
        //     case "Saturday", "Sunday" -> System.out.println("6am");
        //     case "Monday" -> System.out.println("8am");
        //     default -> System.out.println("7am");
        // }  

        String result = "";

        // result = switch(day) // swicth case as an expression
        // {
        //     case "Saturday", "Sunday" -> "6am";
        //     case "Monday" ->  "8am";
        //     default -> "7am";
        // };

        result = switch(day)
        {
            case "Saturday", "Sunday" : yield "6am";
            case "Monday" : yield "8am";
            default : yield "7am";
        };        

        System.out.println(result);
    }
}
