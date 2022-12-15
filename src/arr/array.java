package arr;
import java.util.*;
import java.lang.*;
public class array
{
    public static void main(String[] args)
    {
        int[] arr = new int[4];
        Random rand = new Random();
        for (int i = 0; i <4; i++)
        {
            arr[i] = rand.nextInt(10,99);
        }
        System.out.println(Arrays.toString(arr));
        for (int j = 1; j < 4; j++)
        {
            if (arr[j] < arr[j-1])
            {
                System.out.println("Не строго возрастающая последовательность");
                break;
            }
        }
    }



}
