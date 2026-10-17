package Basice;

public class Variables {
 public static void main(String[] args) {

 } {
        //Q1. एक int variable में अपनी age store करो और उसे print करो।

        System.out.println("Q,1");
        int age = 20;
        System.out.println("your  Age is = " + age);

       // Q2. दो int variables में दो numbers store करो और उनका sum print करो।

        System.out.println("Q.2");
        int a = 40, b = 20 , sum = a + b;
        System.out.println("Sum is = " + sum);

       //Q3. दो numbers store करके उनका addition, subtraction और multiplication print करो।

       System.out.println("Q.3 ");
       int aa = 55 , bb = 33 , summ = aa + bb , subtraction = aa - bb , multiplication = aa * bb ;
        System.out.println("Sum = " + summ);
        System.out.println("Subtraction = " + subtraction);
        System.out.println("Multiplication = " + multiplication);

       // Q4. तीन numbers store करके उनका total और average print करो।
        System.out.println("Q.4");
        int aaa =44 , bbb = 55 , c = 33 ,sumf = aaa + bbb + c;
        double average = (aaa + bbb + c) / 3.0 ;
        System.out.println("Total = " + sumf);
        System.out.println("Average = " + average);



        //Q5. एक student के name, age और marks variables बनाकर तीनों को print करो।
        System.out.println("Q.5");
        String neme = "Deepu";
        int agee = 44 ;
        int marks = 99 ;
        System.out.println("Age is " + agee);
        System.out.println(" neme is = " + neme);
        System.out.println("Marks = " + marks);

       // Q6. तीन subjects के marks store करके total marks print करो।
        System.out.println("Q.6");
        int phy = 77  , chem = 44 , math = 88 , add = phy + chem + math ;
        System.out.println("Total marks of subject = " + add);

       // Q7. तीन subjects के marks से total और average दोनों calculate करके print करो।
        System.out.println("Q .7");
        int phyy =98 , chemm = 89 , matth = 44 , addd = phyy + chemm + matth;
        double avrag = addd / 3.0;
        System.out.println("Total marks of subject = " + addd);
        System.out.println("Average of total markes = " + avrag);

       // Q8. price और quantity variables लेकर total cost calculate करके print करो।
        System.out.println("Q.8");
        int price = 98 , quantity = 500 , mul = price * quantity ;
        System.out.println("Total cost is  = " + mul);

        //Q9. length और breadth लेकर rectangle का area और perimeter दोनों print करो।
        System.out.println("Q.9");
        int length = 20 , breadth = 44 , area = length * breadth , perimeter = 2 * (length + breadth) ;
        System.out.println("Area is = " + area);
        System.out.println("Perimeter is = " + perimeter);

       // Q10. rupees में दी गई value को paise में convert करके print करो।
        System.out.println("Q.10");
        int rupees = 100  , mult = rupees * 100 ;
        System.out.println("Total paise is = " + mult);

       // Q11. kilometer में दी गई दूरी को meter में convert करके print करो।
        System.out.println("Q.11");
        int km = 74 , meter = 1000 , coverr = km * meter;
        System.out.println("So meter  is = " + coverr);

       // Q12. दो numbers को third variable का use करके swap करो।
        System.out.println("Q.12");
        int sa = 20;
        int sb = 10;
        int temp = sa;
        sa = sb;
        sb = temp;
        System.out.println("A = " + sa );
        System.out.println("B = " + sb);

       // Q13. दो numbers को third variable के बिना swap करो।
        System.out.println("Q.13");
        int d = 20 ;
        int f = 10;
        d = d + f ;
        f = d - f ;
        d = d - f ;
        System.out.println("D = " + d);
        System.out.println("F = " + f);



       // Q14. currentAge दिया है। 5 साल बाद की age calculate करके print करो।
        System.out.println("Q.14");
        int ageo = 30 ;
        int suo = ageo + 5;
        System.out.println("Age is = " + suo);

        //Q15. एक circle का radius दिया है। उसका area calculate करके print करो।
        System.out.println("Q.15");
        int radius = 5;
        float  areaa = (float) (3.14 * radius * radius) ;
        System.out.println("Area is = " + areaa);


      //  Q16. एक student के 5 subjects के marks लेकर total और percentage calculate करके print करो।
        System.out.println("Q.16");
        int phyyy = 77 , mathp = 33 ,  scince = 59 , coumpture = 70, english = 59;
        int total = phyyy + mathp + scince + coumpture  + english;
        System.out.println("Total number is  = " + total);
        double percentage = total / 500.0 * 100;
        System.out.println("Percentage is  = " + percentage);

        //Q17. totalSeconds दिया है। उसे minutes और remaining seconds में convert करके print करो।
         System.out.println("Q.17");
         int minutes = 190 / 60 , remaining = 190 % 60 ;
         System.out.println("Total sec is  = " + minutes);
         System.out.println("Total remaining is  = " + remaining);


       // Q18. एक item की price और discount percentage दी है। discount amount और final price calculate करके print करो।
     System.out.println("Q.18");
    double  discount = 20;
    double finalprice = 399;
    discount = 399 * 20 / 100;
    System.out.println("Discount is  = " + discount);
    finalprice = 399 - discount;
     System.out.println("Final price is  = " + finalprice);

        ///Q19. एक व्यक्ति की salary दी है। उसमें 10% bonus जोड़कर final salary print करो।
     double  salary = 25000 , bonus = 10;
     bonus = salary * bonus / 100 ;
     double finalsalary = salary + bonus;
     System.out.println("Final salary is  = " + finalsalary);



       // Q20. एक number दिया है। उसका square और cube calculate करके दोनों print करो।
     System.out.println("Q20");
     int number = 5 ;
     int square = number * number ;
     int cube = number * number * number ;
     System.out.println("Square  is  = " + square);
     System.out.println("Cube  is  = " + cube);








    }
}
