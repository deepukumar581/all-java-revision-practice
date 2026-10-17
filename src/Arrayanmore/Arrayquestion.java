package Arrayanmore;

import java.util.Scanner;

public class Arrayquestion {
    static void main(String[] args) {
        int arr[] = {10,20,30,40,50,};
       /* int size;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        size = input.nextInt();

        int arr[] = new int[size] ;

        for (int count = 1; count <= size; count++){
            int index = count - 1;
            System.out.println("Enter the value for index " + index);
            arr[index] = input.nextInt();
        }
        //printing the array
        for(int n: arr )  {
            System.out.println(n);
        }*/
        int sum = 0;
        for (int num: arr) {
            sum = sum + num;
        }
        System.out.println("The sum is " + sum);






    }
}
