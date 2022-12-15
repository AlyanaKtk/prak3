package massiv;
import java.util.*;
import java.util.Arrays;
public class mass
{
    public static void main(String[] args)
    {
        int[] massiv = new int[10];
        double[] array = new double[10];
        Random rand = new Random();
        for(int i = 0; i <10; i++)
        {
            massiv[i] = rand.nextInt();
        }
        for (int i = 0; i<10; i++)
        {
            array[i] = Math.random();
        }
        Arrays.sort(massiv);
        Arrays.sort(array);
        System.out.println(Arrays.toString(massiv));
        System.out.println(Arrays.toString(array));
    }
}
