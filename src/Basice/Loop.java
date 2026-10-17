package Basice;

import javax.crypto.spec.PSource;

public class Loop {
    static void main(String[] args) {
        for(int count = 1; count <=10 ; count++){
            System.out.println("Count is " + count);
        }
      /// 2 ka table
        for(int table = 1; table <= 10; table++){
            System.out.println(2*table);
        }
        // H.W.
        //Q.1 print counting form 1 to n;
        System.out.println("Q.1");
         int n = 44;
        for(int count = 1; count <= n ; count++)
            System.out.println("Count is " + count);
        //Q.2 print counting form n to 1;
        System.out.println("Q.2");
       int k = 1;
       for(int count = 44; count >= k ; count--)
           System.out.println("Count is " + count);

        //Q.3 print the 10 multiples of n;
            System.out.println("Q.3");
            int num = 7;
            for(int i = 1; i <= 10; i++){
                System.out.println("Answer  is " + num * i);
            }
        //Q.4 print your name 100 times;
        System.out.println("Q.4");
            String name ="Deepu kumar";
            for(int i = 1; i <= 100; i++){
                System.out.println("Name is " + name  + i);
            }

        //Q.5 print all prime numbers from 1 to 100;


        //Q.6 print all even numbers form 1 to 100;

        //Q.7 print the sum of all the number from 1 t n;

        //Q.8 print all integers in range from 50 to 100 , that are perfectly divisible by 7;












       // FOR LOOP — Practice Questions
       // Q1. Counting
       // for loop से 1 से 10 तक print करो।
        System.out.println("Q.1");
            for(int i = 1; i <= 10; i++){
                System.out.println(i);
            }



       // Q2. Reverse Counting
       // for loop से 10 से 1 तक print करो।
        System.out.println("Q.2");
            for(int i = 10; i >= 1; i--){
                System.out.println(i);
            }

       // Q3. Even Numbers
        //for loop से 1 से 20 तक सभी even numbers print करो।
        System.out.println("Q.3");
            for(int i = 1; i <= 20; i++){
                if(i % 2 == 0){
                    System.out.println("Even number is " + i);
                }
            }

        //Q4. Odd Numbers
        //for loop से 1 से 20 तक सभी odd numbers print करो।
        System.out.println("Q.4");
            for(int i = 1; i <= 20; i++){
                if(i % 2 != 0){
                    System.out.println("Odd number is " + i);
                }
            }

        //Q5. Sum of Numbers
        //for loop से 1 से 10 तक का sum निकालो।
        System.out.println("Q.5");
            int i;
            int sum =0;
            for( i = 1; i <= 10; i++){
                sum += i;
            }
            System.out.println(sum);

        //Q6. Multiplication Table
        //int n = 5 दिया है। for loop से 5 का table 1–10 print करो।
        System.out.println("Q.6");
        int nj = 5;
        int multi = 0;
        for(int l = 1; l <= 10; l++){
           multi = nj * l;
            System.out.println(+ multi);

        }

        //Q7. Count Digits
        //int num = 12345 दिया है। for loop से number में कितने digits हैं, find करो।
        System.out.println("Q.7");
        int numm = 12345;
        int count = 0;
        for(count = 0; numm > 0; count++){
            numm = numm / 10;
        }
        System.out.println(count);

       //Q8. Reverse Number
        //int num = 1234 दिया है। for loop से number को reverse करो।
        //Expected: 4321
        System.out.println("Q.8");
        int Num = 1234;
        int rev =0;
        int digits = 0;
        for(rev = 0; Num > 0; ){
            digits = Num % 10;
            rev = rev * 10 + digits ;
            Num = Num / 10;
        }
        System.out.println(rev);



        //Q9. Sum of Digits
        //int num = 1234 दिया है। for loop से digits का sum निकालो।
        //Expected: 10
        System.out.println("Q.9");
        int nUm = 1234;
        int dived;
        int add = 0;
        for (int u = 0; u <= nUm; u++){
            dived = nUm %  10;
            add = nUm + dived;
        }
        System.out.println(add);

        //Q10. Factorial
        //int n = 5 दिया है। for loop से factorial निकालो।
        //Expected: 120
    }
}
