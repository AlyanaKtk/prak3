package Report;
import java.text.*;
import java.util.*;
public class Report
{
    public static Employee[] arr = new Employee[10];
    public static void generateReport()
    {

        Formatter fr = new Formatter();
        for (int i = 0; i < 10; i++)
        {
            fr.format("Employee name is %s, his salary is %.2f%n", arr[i].fullname, arr[i].salary);

        }
    }
}
