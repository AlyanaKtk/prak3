package obol;
import java.util.*;
import java.lang.*;
public class obol
{
    public static void main(String[] args)
    {
        //1
        Double a = Double.valueOf(5);
        System.out.println(a);
        //2
        String b = "100";
        double db = Double.parseDouble(b);
        System.out.println(db);
        //3
        Double c = 2.5;
        System.out.println(c.byteValue());
        System.out.println(c.shortValue());
        System.out.println(c.intValue());
        System.out.println(c.longValue());
        System.out.println(c.floatValue());

        //5
        double f = 100.0;
        String fs = Double.toString(f);
        System.out.println(fs);

    }


}
