/*----------------------------------------------------
                        Завдання 3
-----------------------------------------------------*/
public class Ex_3
{
    public static void main(String[] args)
    {
        int [] arr = {1,2,3,4,5,6,7,8,9,10};

        int res = 0 ;

        for (int i = 0 ; i < arr.length ;  i++  )
        {
            res += arr[i] ;
        }
        System.out.println(res);
    }
}
