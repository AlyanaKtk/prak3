package circle;

public class tester {
    circle [] mass =  new circle[10];
    int a = mass.length;
    public circle max()
    {

        int max = 0;
        circle maxx = null;
        for (int i = 0; i < a; i++)
        {
            if(mass[i].length > max)
            {
                maxx = mass[i];
            }
        }
        return maxx;
    }
    public circle min()
    {

        int min = 0;
        circle minn = null;
        for (int i = 0; i < a; i++)
        {
            if(mass[i].length > min)
            {
                minn = mass[i];
            }
        }
        return minn;
    }
    public void sortmas()
    {
        circle tmp;
        for (int i = 0; i <a; i++)
        {
            for (int j = a; j > 0 ; j--)
            {
                if (mass[j-1].length>mass[j].length)
                {
                    tmp = mass[j-1];
                    mass[j-1] = mass[j];
                    mass[j] = tmp;
                }


            }
        }
    }
}
