package arr4;
import java.util.*;
import java.lang.*;
public class massiv
{
    public static void main(String[] args)
    {
        int n = -1;
        Scanner sc = new Scanner(System.in);
        while ( n <0 )
        {
            System.out.println("Введите натуральное число");
            n = sc.nextInt();
        }
        int[] arr = new int[n];
        Random rand = new Random();
        for (int i = 0; i <n; i++)
        {
            arr[i] = rand.nextInt();
        }
        int[] arr2 = new int[n];
        int count = 0;
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < n; i++)
        {
            if (arr[i]%2 == 0 )
            {
                arr2[count] = arr[i];
                count++;
            }
        }
        for (int i = 0; i < n; i++) {
            if(arr2[i] != 0)
            {
                System.out.print(arr2[i] + " ");
            }
        }
    }
}
