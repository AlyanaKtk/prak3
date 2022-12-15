package format;
import java.text.*;
import java.util.*;
public class convert
{
    double val;
    public void rubtodol()
    {
        NumberFormat nf = NumberFormat.getCurrencyInstance();
        val *= 0.016;
        nf.setCurrency(Currency.getInstance(Locale.US));
        System.out.println(nf.format(val));
    }

    public void rubtoeuro()
    {
        NumberFormat nf = NumberFormat.getCurrencyInstance();
        val *= 0.017;
        nf.setCurrency(Currency.getInstance(Locale.GERMANY));
        System.out.println(nf.format(val));
    }
}
