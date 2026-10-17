package Arrayanmore;

public class Arraybasice {
    public static void main(String[] args) {

        //one d array
        //declaration
        int arr[];
        int []brr;

        //allocation
        arr = new int[8];

        //initialisation
        int marks[] = {100 ,99 ,88 ,55 ,44};
        //using for loop to print entire array
        int n = marks.length;
        System.out.println("For normal loop");
        for(int index = 0; index <= n -1; index++){
            System.out.println(marks[index]);
        }
        System.out.println("For each loop :");
        for(int number : marks){
            System.out.println(number);
        }

       // System.out.println(marks.length);
        //System.out.println("Fist elemenmt " + marks[0]);
        //System.out.println("Second elemenmt " + marks[1]);
        //System.out.println("Third element "  + marks[2]);
        //System.out.println("Fourth element " + marks[3]);
        //System.out.println("Fifth element " + mark*/s[4]);


    }
}
