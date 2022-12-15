package circle;
import java.util.Random;
public class circle
{
    public Point dot;
    public void setdot(double x, double y)
    {
        dot = new Point(x, y);
    }
    public int radius;
    public int length;
    Random rand = new Random();
    public circle()
    {
        radius = rand.nextInt(100);
        length = rand.nextInt(1000);
    }

}
