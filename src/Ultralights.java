public class Ultralights
{
    public static void main(String[] args)
    {
        Simulation_56567 s = new Simulation_56567();
        for (int i = 0; i < 6; i++)
        {
            System.out.println(s);
            s.ChangeColor_56567();
        }
    }
}

enum Lights
{Black, Brown, Blue}

class Simulation_56567
{
    Lights Ls = Lights.Black;
    void ChangeColor_56567()
    {
        switch (Ls)
        {
            case Black :
                Ls=Lights.Brown;
                break;

            case Brown :
                Ls=Lights.Blue;
                break;

            case Blue :
                Ls=Lights.Black;
                break;
        }
    }

    public String toString()
    {return " "+Ls;}
}
