/*----------------------------------------------------
                        Завдання 1
-----------------------------------------------------*/
public class Ex_1
{
    public static void main(String[] args)
    {
        int [] arr = new int[100] ;
        for ( int i = 0 ; i < arr.length; i+=2 )
        {
            arr[i] = i + 1 ;
            System.out.print (arr[i] +" ");
        }
        System.out.println (" ");

        int [] arr1 = new int[100] ;
        for ( int i = 1 ; i < arr1.length; i+=2 )
        {
            arr1[i] = i + 1 ;
            System.out.print (arr1[i] +" ");
        }
    }
}