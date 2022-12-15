package internetshop;
import java.text.*;
import java.util.*;
public class internetshop
{
    public static void main(String[] args)
    {
        double price = 46.78;
        NumberFormat nf = NumberFormat.getCurrencyInstance();
        System.out.println("Choose format: ruble - 1, dollar - 2, euro - 3");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println("Price is: ");
        switch (x)
        {
            case 1:
            {
                nf.setCurrency(Currency.getInstance("RUB"));
                System.out.println(nf.format(price));
                break;
            }
            case 2:
            {
                nf.setCurrency(Currency.getInstance(Locale.US));
                price *= 0.016;
                System.out.println(nf.format(price));
                break;
            }
            case 3:
            {
                nf.setCurrency(Currency.getInstance(Locale.FRANCE));
                price *= 0.017;
                System.out.println(nf.format(price));
                break;
            }
        }

    }


}
