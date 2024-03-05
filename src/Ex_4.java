/*----------------------------------------------------
                        Завдання 4
-----------------------------------------------------*/
public class Ex_4
{
    public static void main(String[] args)
    {
        int[] arr ={2,17,13,6,22,31,45,66,100,18};

        for (int i = 0 ; i < arr.length ; i++)
        {
            if (arr[i] % 2 != 0)
            {
                arr[i] = -arr[i];
            }
        }

        System.out.println(" Значення непарних чисел масиву змінено на відємний ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
