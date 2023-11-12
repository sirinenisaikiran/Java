class Computer
{
    public void playMusic()
    {
        System.out.println("Playing Music...");
    }

    public String getMeAPen(int cost)
    {
        if(cost >= 10)
            return "Pen";
        
        return "Nothing";
    }
}

public class Demo
{
    // Main is a method. Start of exexution.
    public static void main(String args[])
    {
        Computer comp = new Computer();

        comp.playMusic();

        String str = comp.getMeAPen(20);
        System.out.println(str);
    }
}

