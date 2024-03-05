/*----------------------------------------------------
                        Завдання 2
-----------------------------------------------------*/
public class Ex_2 {
    public static void main(String[] args){
        int[] arr ={2,17,13,6,22,31,45,66,100,18};
        int ind = 0;
        System.out.print("Вивід масиву через цикл While : ");
        while( ind < arr.length){
            System.out.print(arr[ind] + " ");
            ind++;
        }
        System.out.println(" ");

        System.out.print("Вивід масиву через цикл For : ");
        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");

        System.out.print("Вивід масиву значень з не парним індексом через цикл While : ");

        for(int j = 0; j < arr.length; j ++){
            if(arr[j] % 2 == 0)
                System.out.print(arr[j] + " ");
        }
        System.out.println(" ");

        System.out.print ("Вивід масиву не парних значень через цикл While : ");
        int index = 0;
        while(index < arr.length){
            if(arr[index] % 2 != 0)
                System.out.print(arr[index] + " ");
            index++;
        }
        System.out.println(" ");

        System.out.print("Вивід масиву в зворотньому порядку : ");
        for (int k = arr.length - 1; k >= 0; k--) {
            System.out.print(arr[k] + " ");
        }
    }
}