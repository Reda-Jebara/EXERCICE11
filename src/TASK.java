public class TASK
{

    public static void main(String[] args)
    {
        Display m = new Display();

        for (int i = 0; i < 7 ; i++)
        {
            System.out.println(m);
            m.changeShape();
        }
    }

    enum Shapes
    {
        hexagon,
        circle,
        rectangle,
        trapezoid,
        rhombus,
        oval,
        triangle,
        square
    }

    static class Display
    {
        Shapes m1 =  Shapes.square;

        void changeShape()
        {

            switch (m1)
            {
                case hexagon:
                    m1 = TASK.Shapes.circle;
                    break;
                case circle:
                    m1 = TASK.Shapes.rectangle;
                    break;
                case rectangle:
                    m1 = TASK.Shapes.trapezoid;
                    break;
                case trapezoid:
                    m1 = TASK.Shapes.rhombus;
                    break;
                case rhombus:
                    m1 = TASK.Shapes.oval;
                    break;
                case oval:
                    m1 = TASK.Shapes.triangle;
                    break;
                case triangle:
                    m1 = TASK.Shapes.square;
                    break;
                case square:
                    m1 = TASK.Shapes.square;
                    break;
            }

        }

        public String toString()
        {return "" + m1;}
    }
}
