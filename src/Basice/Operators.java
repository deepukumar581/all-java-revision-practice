package Basice;

public class Operators {
    public static void main(String[] args) {
       // Arithmetic Operators — Q21–Q35

        //Q21. Addition
        //दो numbers 25 और 15 लो और उनका addition print करो।
        System.out.println("Q.21");
        int a = 25 , b = 15 , add = a + b ;
        System.out.println("Answer is = " +  add);

        //Q22. Subtraction
        //दो numbers 50 और 18 लो और उनका subtraction print करो।
        System.out.println("Q.22");
        int aa = 50 , bb = 18 ,  sub = aa - bb;
        System.out.println("Answer is = " +  sub);

        //Q23. Multiplication
        //दो numbers 12 और 8 लो और उनका multiplication print करो।
        System.out.println("Q.23");
        int mula = 12 , mulb = 8 , multi = mula * mulb;
        System.out.println("Answer is = " +  multi);

        //Q24. Division
        //दो int numbers 100 और 5 लो और उनका division print करो।
        System.out.println("Q.24");
        int diva = 100 , divb = 5 , divide = diva / divb;
        System.out.println("Answer is = " +  divide);

        //Q25. Remainder
        //दो numbers 27 और 4 लो और उनका remainder print करो।
        System.out.println("Q.25");
        int rema = 27 , remb = 4 , remainder = rema % remb;
        System.out.println("Answer is = " +  remainder);

        //Q26. All Arithmetic Operators
        //दो numbers 20 और 6 लो और +, -, *, /, % सभी का result print करो।
        System.out.println("Q.26");
        int y = 20 , h = 6 ;
        int adision = y + h;
        int subtr = y - h ;
        int mult = y * h ;
        int did = y / h ;
        int remai = y % h;
        System.out.println(" Aduson = " +  adision);
        System.out.println("Subtaction = " + subtr);
        System.out.println("Multiplication = " + mult);
        System.out.println("Division = " + did);
        System.out.println("Remainder = " + remai);


        //Q27. Average
        //तीन numbers 20, 30, 40 लो और उनका average निकालकर print करो।
        System.out.println("Q.27");
        int av = 20 , ava = 30 , avb = 40 ;
        double addi =( av + ava + avb) / 3.0 ;
        System.out.println("Answer is = " +  addi);

        //Q28. Total Price
        //एक item की price 150 और quantity 4 है। Total cost निकालो।
        System.out.println("Q.28");
        int item = 150 ;
        int quantity = 4 ;
        double mul =  item * quantity ;
        System.out.println("Total cost  = " +  mul);

        //Q29. Simple Calculation
        //a = 20 और b = 5 लो।
        //a + b, a - b, a * b, a / b, a % b print करो।
        System.out.println("Q.29");
        int ai = 20 , bn = 5;
        int plu = ai + bn;
        int min = ai - bn;
        int multip = ai * bn;
        int di = ai / bn;
        int ri = ai % bn;
        System.out.println("Adison answer is = " +  plu);
        System.out.println("Subtraction answer is = " +  min);
        System.out.println("Multiplication answer is = " +  multip);
        System.out.println("Division answer is = " +  di);
        System.out.println("Remainder answer is = " +  ri);


        //Q30. Temperature Conversion
        //Celsius temperature 30 दिया है। उसे Fahrenheit में convert करके print करो।
        //Formula: F = (C × 9/5) + 32
        System.out.println("Q.30");
        int celsius = 30;
        int fahrenheit =(celsius * 9/5) + 32;
        System.out.println("Fahrenheit  = " +  fahrenheit);

        //Q31. Rectangle
        //Length 15 और breadth 8 दी है। Area और perimeter दोनों निकालो।
        System.out.println("Q.31");
        int length = 15 , breadth = 8;
        int area = length * breadth;
        int perimeter = 2 * (length + breadth);
        System.out.println("Area is = " +  area);
        System.out.println("Perimeter is = " +  perimeter);

        //Q32. Circle
        //Radius 7 दिया है। Circle का area निकालो।
        //π = 3.14
        int radius = 7 ;
        float pi = (3.14f);
        double multipli = (pi * radius * radius);
        System.out.println("Area  = " +  multipli);


        //Q33. Salary Calculation
        //Salary 30000 है। उसमें 10% bonus जोड़कर final salary निकालो।
        System.out.println("Q.33");
        int salary = 30000;
        int bonus = 10;
        double finalprice = (salary * bonus) / 100.0;
        double price =  (finalprice + salary);
        System.out.println("Final Salary  = " + price);


        //Q34. Discount Calculation
        //Price 1000 है और discount 15% है। Discount amount और final price निकालो।
        System.out.println("Q.34");
        int pri = 1000 ;
        int dis = 15;
        double  disam = pri * dis / 100;
        double finaldis = pri - disam;
        System.out.println("Discount amount   = " + disam);
        System.out.println("Final price  = " + finaldis);

        //Q35. Arithmetic Expression
        //a = 20, b = 5, c = 2 दिए हैं। Calculate करो:
        //a + b * c
        //(a + b) * c
        //a / b + c
        //a % b + c
        System.out.println("Q.35");
        int  ac = 20 , ba = 5 , ca = 2;
        int addm = ac + ba * ca;
        System.out.println(" a + b * c Answer is = " +  addm);
        int amm = (ac + ba) * ca;
        System.out.println("(a + b) * c Answer is = " +  amm);
        int divd = ac / ba + ca;
        System.out.println(" a / b + c Answer is = " +  divd);
        int dism = ac % ba + ca;
        System.out.println(" a % b + c Answer is = " +  dism);







      //  Relational Operators — Q36–Q50

        //Q36. Greater Than
        //int a = 20;
        //int b = 10;
        //Print करो:
        //a > b
        System.out.println("Q.36");
        int at = 20;
        int btb = 10;
        System.out.println(at > btb);



        //Q37. Less Than
        //int r = 15;
        //int i = 25;
        //Print करो:
        //a < b
        System.out.println("Q.37");
        int r = 15;
        int i = 25;
        System.out.println(r < i);

        //Q38. Greater Than or Equal
        //int age = 18;
        //Print करो:
        //age >= 18
        System.out.println("Q.38");
        int ager = 18;
        System.out.println(ager >= 18);


        //Q39. Less Than or Equal
        //int marks = 40;
        //Print करो:
        //marks <= 40
        System.out.println("Q.39");
        int marks = 40;
        System.out.println(marks <= 40);


        //Q40. Equal To
        //int a = 50;
        //int b = 50;
        //Print करो:
        //a == b
        System.out.println("Q.40");
        int az = 50;
        int bm = 50;
        System.out.println(az == bm);

        //Q41. Not Equal
        //int a = 20;
        //int b = 30;
        //Print करो:
        //a != b
        System.out.println("Q.41");
        int not = 20;
        int notb = 30;
        System.out.println(not != notb);

        //Q42. Two Ages Compare
        //int fatherAge = 45;
        //int sonAge = 20;
        //Print करो:
        //fatherAge > sonAge
        //fatherAge == sonAge
        //fatherAge < sonAge
        System.out.println("Q.42");
        int fatherae = 45;
        int sonage = 20;
        System.out.println(fatherae > sonage);
        System.out.println(fatherae == sonage);
        System.out.println(fatherae < sonage);

        //Q43. Marks Check
        //int marks = 75;
        //Print करो:
        //marks >= 40
        //marks < 40
        System.out.println("Q.43");
        int markss = 75;
        System.out.println(markss >= 40);
        System.out.println(markss < 40);

        //Q44. Salary Check
        //double salary = 25000;
        //Print करो:
        //salary > 20000
        //salary < 20000
        //salary == 25000
        System.out.println("Q.44");
        double salaryy = 25000;
        System.out.println(salaryy > 20000);
        System.out.println(salaryy < 20000);
        System.out.println(salaryy == 25000);

        //Q45. Temperature Check
        //int temperature = 35;
        //Print करो:
        //temperature > 30
        //temperature <= 35
        //temperature == 40
        System.out.println("Q.45");
        int tempe = 35;
        System.out.println(tempe > 30);
        System.out.println(tempe <= 35);
        System.out.println(tempe == 40);

        //Q46. Character Compare
        //char ch1 = 'A';
        //char ch2 = 'B';
        //Print करो:
        //ch1 == ch2
        //ch1 != ch2
        System.out.println("Q.46");
        char ch1 = 'A';
        char ch2 = 'B';
        System.out.println(ch1 == ch2);
        System.out.println(ch1 != ch2);

        //Q47. Two Numbers — All Comparisons
        //int a = 25;
        //int b = 20;
        //Print करो:
        //a > b
        //a < b
        //a >= b
        //a <= b
        //a == b
        //a != b
        System.out.println("Q.47");
        int ha = 25;
        int hb = 20;
        System.out.println(ha > hb);
        System.out.println(ha < hb);
        System.out.println(ha >= hb);
        System.out.println(ha <= hb);
        System.out.println(ha == hb);
        System.out.println(ha != hb);


        //Q48. Age Eligibility Check
        //int age = 18;
        //Print करो:
        //age >= 18
        //age > 18
        //age <= 18
        //age != 18
        System.out.println("Q.48");
        int agee = 18;
        System.out.println(agee >= 18);
        System.out.println(agee > 18);
        System.out.println(agee <= 18);
        System.out.println(agee != 18);

        //Q49. Compare Two Salaries
        //double salary1 = 30000;
        //double salary2 = 25000;
        //Print करो:
        //salary1 > salary2
        //salary1 < salary2
        //salary1 == salary2
        //salary1 != salary2
        System.out.println("Q.49");
        double salry1 = 30000;
        double salry2 = 25000;
        System.out.println(salry1 > salry2);
        System.out.println(salry1 < salry2);
        System.out.println(salry1 == salry2);
        System.out.println(salry1 != salry2);


        //Q50. Interview Practice
        //int a = 10;
        //int b = 20;
        //एक ही program में ये सभी print करो:
        //a > b
        //a < b
        //a >= b
        //a <= b
        //a == b
        //a != b
        System.out.println("Q.50");
        int aj = 10;
        int bj = 20;
        System.out.println(aj > bj);
        System.out.println(aj < bj);
        System.out.println(aj >= bj);
        System.out.println(aj <= bj);
        System.out.println(aj == bj);
        System.out.println(aj != bj);





        //Logical Operators — Q51–Q65

        //Q51. AND (&&)
        //int k = 20;
        //int kq = 10;
        //Check करो:
        //a > 10 && b > 5
        System.out.println("Q.51");
        int k = 20;
        int kq = 10;
        System.out.println(k > 10 && kq > 5);

        //Q52. AND (&&)
        // int age = 20;
        //Check करो:
        //age >= 18 && age <= 60
        System.out.println("Q.52");
        int ag = 20;
        System.out.println(ag >= 18 && ag <= 60 );

        //Q53. AND — एक condition false
        //int a = 20;
        //int b = 5;
        //Check करो:
        //a > 10 && b > 10
        System.out.println("Q.53");
        int ao =20;
        int bo = 5;
        System.out.println(ao > 10 && bo > 10);


        //Q54. OR (||)
        //int a = 20;
        //int b = 5;
        //Check करो:
        //a > 10 || b > 10
        System.out.println("Q.54");
        int aja = 20;
        int ajb = 5;
        System.out.println(aja > 10 || ajb > 10);

        //Q55. OR — दोनों false
        //int a = 5;
        //int b = 8;
        //Check करो:
        //a > 10 || b > 10
        System.out.println("Q.55");
        int art = 5;
        int brt = 8;
        System.out.println(art > 10 || brt > 10);

        //Q56. NOT (!)
        //int age = 20;
        //Check करो:
        //!(age > 18)
        System.out.println("Q.56");
        int agh = 20;
        System.out.println(!(agh > 18));


        //Q57. NOT
        //int marks = 30;
        //Check करो:
        //!(marks >= 40)
        System.out.println("Q.57");
        int marksss = 40;
        System.out.println(!(marksss >= 40));

        //Q58. Age Eligibility
        //int age = 25;
        //Check करो:
        //age >= 18 && age <= 60
        System.out.println("Q.58");
        int agei = 25;
        System.out.println(agei >= 18 && agei <= 60);

       // Q59. Marks Range
        //int marks = 75;
        //Check करो:
        //marks >= 40 && marks <= 100
        System.out.println("Q.59");
        int marke = 75;
        System.out.println(marke >= 40 && marke <=100);

        //Q60. Login Logic
        //String username = "admin";
        //String password = "1234";
        //Check करो कि दोनों सही हैं:
        //username == "admin" && password == "1234"
        System.out.println("Q.60");
        String username = "admin";
        String password = "1234";
        System.out.println(username == "admin" && password == "1234");

        //Q61. OR Logic
        //int day = 7;
        //Check करो:
        //day == 6 || day == 7
        System.out.println("Q.61");
        int day = 7;
        System.out.println(day == 6 || day == 7);

        //Q62. Multiple AND Conditions
        //int age = 25;
        //int salary = 30000;
        //Check करो:
        //age >= 18 && salary >= 25000
        System.out.println("Q.62");
        int agge = 25;
        int ssalary = 30000;
        System.out.println(agge >= 18 && ssalary >= 25000);

        //Q63. AND + OR
        //int age = 20;
        //int marks = 75;
        //Check करो:
        //age >= 18 && marks >= 60
        //और:
        //age < 18 || marks < 60
        System.out.println("Q.63");
        int ageer = 20;
        int mmark = 75;
        System.out.println(ageer >= 18 && mmark >= 60);

        System.out.println(ageer < 18 || mmark < 60);

        //Q64. Brackets के साथ Logic
        //int a = 10;
        //int b = 20;
        //int c = 30;
        //Calculate करो:
        //(a < b && b < c)
        //और:
        //(a > b || b < c)
        System.out.println("Q.64");
        int aw = 10;
        int bw = 20;
        int cw = 30;
        System.out.println(aw < bw && bw < cw);
        System.out.println(aw > bw || bw < cw);

        //Q65. Logic Building Challenge
        //int age = 22;
        //int marks = 72;
        //boolean hasCertificate = true;
        //Check करो:
        //age >= 18 && marks >= 60 && hasCertificate
        //और:
        //age < 18 || marks < 60 || !hasCertificate
        System.out.println("Q.65");
        int gg = 22;
        int marksk = 72;
        boolean has = true;
        System.out.println(gg >= 18 && marksk >= 60 && has);

        System.out.println(gg < 18 || marksk < 60 || !has);




        // Assignment Operators — Q66–Q75
        //Q66. एक variable au में 50 store करो और उसकी value print करो।
        System.out.println("Q.66");
        int au = 50;
        System.out.println("Value = " + au);

        //Q67. u की value 20 है। उसमें 10 बढ़ाओ और नई value print करो।
        System.out.println("Q.67");
        int u = 20;
         u +=  10;
        System.out.println("Value = " + u);

        //Q68. p की value 50 है। उसमें से 15 कम करो और नई value print करो।
        System.out.println("Q68");
        int p = 50;
        p -= 15;
        System.out.println("Value = " + p);


        //Q69. m की value 10 है। उसकी value को 5 गुना करो और print करो।
        System.out.println("Q.69");
        int m = 10;
        m *= 5;
        System.out.println("Value = " + m);

        //Q70. mc की value 100 है। उसे 4 से divide करो और नई value print करो।
        System.out.println("Q.70");
        int mc = 100;
        mc /= 4 ;
        System.out.println("Value = " + mc);


        //Q71. aq की value 17 है। उसे 5 से divide करने पर बचने वाला remainder a में store करो और print करो।
        System.out.println("Q.71");
        int aq = 17;
        aq %= 5;
        System.out.println("Value = " + aq);

        //Q72. ty = 10 है। पहले उसमें 5 जोड़ो, फिर जो value आए उसे 2 गुना करो। Final value print करो।
        System.out.println("Q.72");
        int ty =  10;
        ty += 5;
        ty *= 2;
        System.out.println("Value = " + ty);



        //Q73. mn = 20 है।
        //पहले 10 जोड़ो, फिर 5 घटाओ, फिर 2 गुना करो। Final value print करो।
        System.out.println("Q.73");
        int mn = 20;
        mn += 10;
        mn -= 5;
        mn *= 2;
        System.out.println("Value = " + mn);


        //Q74. ayy = 30 और bnnn = 10 हैं। bnnn की value को ayy में जोड़ो। फिर bnnn में 5 जोड़ो। दोनों की final values print करो।
        System.out.println("Q.74");
        int ayy =30 ;
        int byy = 10;
        ayy += byy;
        byy += 5;
        System.out.println(" B Value = " + ayy);
        System.out.println(" A Value = " + byy);


        //Q75. x = 100 है।
        //20 कम → 4 से divide → 15 जोड़ → 2 गुना। Final x print करो।
        System.out.println("Q.75");
        int x = 100;
        x -= 20;
        x /= 4;
        x += 15;
        x *= 2 ;
        System.out.println(" X Value = " + x);







        //Unary Operators — Q76–Q85
        //Q76
        //An integer variable a has the value 10.
        //Use the increment operator to increase its value by 1 and print it.
        System.out.println("Q.76");
        int v = 10;
        v++;
        System.out.println(" Variable  Value = " + v);


        //Q77
        //An integer variable a has the value 10.
        //Use the decrement operator to decrease its value by 1 and print it.
        System.out.println("Q.77");
        int d = 10;
        d--;
        System.out.println(" Variable Value = " + d);


        //Q78
        //An integer variable a has the value 20.
        //Increase a by 1 twice using the increment operator. Print the final value.
        System.out.println("Q.78");
        int pm = 20;
        pm++;
        pm++;
        System.out.println(" Variable  Value = " + pm);


        //Q79
        //An integer variable a has the value 15.
        //Decrease a by 1 twice using the decrement operator. Print the final value.
        System.out.println("Q.79");
        int hp = 15;
        --hp;
        --hp;
        System.out.println(" Variable  Value = " + hp);


        //Q80
        //An integer variable a has the value 10.
        //Print ++a, then print the final value of a.
        System.out.println("Q.80");
        int hk = 10;
        System.out.println( ++hk);
        System.out.println(hk);


        //Q81
        //An integer variable a has the value 10.
        //Print a++, then print the final value of a.
        System.out.println("Q.81");
        int gl = 10;
        gl++;
        System.out.println(" Variable  Value = " + gl);


        //Q82
        //An integer variable a has the value 10.
        //Print --a, then print the final value of a.
        System.out.println("Q.82");
        int ff = 10;
        --ff;
        System.out.println(" Variable  Value = " + ff);


        //Q83
        //An integer variable a has the value 10.
        //Print a--, then print the final value of a.
        System.out.println("Q.83");
        int hg = 10;

        System.out.println(hg--);
        System.out.println(hg);

        //Q84
        //Two integer variables are given:
        //hh = 5
        //nml = 10
        //Increment hh by 1 and decrement nml by 1. Print both final values.
        System.out.println("Q.84");
        int hh = 5;
        int nml = 10;
        hh++;
        nml--;
        System.out.println(" Variable  Value = " + hh);
        System.out.println("Variable Value = " + nml);



        //Q85 — Dry Run Challenge
        //Without running the code, find the final values of a, b, and c:
        //int a = 10;
        //int b = a++;
        //int c = ++a;
        System.out.println("Q.85");
        int aaaaa = 10;
        int bbbbb = aaaaa++;
        int ccccc = ++aaaaa;
        System.out.println(" Variable  Value = " + aaaaa);
        System.out.println("Variable Value = " + bbbbb);
        System.out.println("Variable Value = " + ccccc);





        //Ternary Operator — Q86–Q95
        //Q86.
        //An integer variable a has the value 20.
        //Use the ternary operator to check whether a is greater than 10.
        //Print "Yes" if true, otherwise print "No".\
        System.out.println("Q.86");
        int xx = 20;
        String rusult = ( xx > 10 )? "yes" : "no";
        System.out.println("Variable Value = " + rusult);

        //Q87.
        //An integer variable age has the value 20.
        //Check whether the person is eligible (age >= 18).
        //Print "Eligible" or "Not Eligible".
        System.out.println("Q.87");
        int uu = 20;
        String ageu = (uu >= 18)? "Eligible" : "Not Eligible";
        System.out.println("Variable Value = " + ageu);

        //Q88.
        //Two integers a = 25 and b = 40 are given.
        //Use the ternary operator to find the greater number.
        //Print the greater number.
        System.out.println("Q.88");
        int ax = 25;
        int ay = 40;
        int greater = (ax >= ay)? ax : ay ;
        System.out.println("Variable Value = " + greater);

        //Q89.
        //Two integers a = 50 and b = 30 are given.
        //Use the ternary operator to find the smaller number.
        //Print the smaller number.
        System.out.println("Q.89");
        int kk = 50;
        int mo = 30;
        int hug = (kk <= mo) ? kk : mo ;
        System.out.println("Variable Value = " + hug);

        //Q90.
        //An integer number = 15 is given.
        //Use the ternary operator to check whether the number is even or odd.
        //Print "Even" or "Odd".
        System.out.println("Q.90");
        int od = 15;
        String po =(od % 2 == 0) ? "Even" : "Odd";
        System.out.println("Variable Value = " + po);

        //Q91.
        //An integer marks = 75 is given.
        //Use the ternary operator to check whether marks are >= 40.
        //Print "Pass" or "Fail".
        System.out.println("Q.91");
        int mark = 75;
        String markresult = (mark >= 40) ? "pass" : "fail";
        System.out.println("Variable Value = " + markresult);

        //Q92.
        //An integer number = -5 is given.
        //Use the ternary operator to check whether the number is positive or negative.
        //Print "Positive" or "Negative".
        System.out.println("Q.92");
        int num = -5;
        String numresult = (num >= 0) ? "Positive" : "Negative";
        System.out.println("Variable Value = " + numresult);

        //Q93.
        //Two integers a = 20 and b = 20 are given.
        //Use the ternary operator to check whether they are equal.
        //Print "Equal" or "Not Equal".
        System.out.println("Q.93");
        int gx = 20;
        int gf = 20;
        String equal = (gx == gf) ? "Equal" : "Not Equal" ;
        System.out.println("Variable Value = " + equal);

        //Q94.
        //An integer age = 17 is given.
        //Use the ternary operator to check whether the person is a minor or an adult.
        //Print "Minor" or "Adult".
        System.out.println("Q.94");
        int AGe = 17;
        String ageruslt = (AGe >= 18)? "Adult" : "Minor";
        System.out.println(" Person = " + ageruslt);

        //Q95 — Dry Run Challenge
        //int a = 10;
        //int b = 20;
        //int result = (a > b) ? a : b;
        //Without running the code, find the value of result.
        System.out.println("Q.95");
        System.out.println("The answer is B = 20");






       // Q96–Q105
        //Q96. Bitwise AND
        //int a = 5;
        //int b = 3;
        //Use & and print the result.
        System.out.println("Q.96");
        int I = 5;
        int B = 3;
        int Ru = I & B;
        System.out.println(Ru);

        //Q97. Bitwise OR
        //int a = 5;
        //int b = 3;
        //Use | and print the result.
        System.out.println("Q.97");
        int A = 5;
        int Bb = 3;
        int C = A | Bb;
        System.out.println(C);

        //Q98. Bitwise XOR
        //int a = 5;
        //int b = 3;
        //Use ^ and print the result.
        System.out.println("Q.98");
        int AA = 5;
        int BB = 3;
        int Cc = AA ^ BB;
        System.out.println(Cc);

        //Q99. Bitwise NOT
        //int a = 5;
        //Use ~ and print the result.
        System.out.println("Q.99");
        int no = 5;
        int rusultnot = ~no;
        System.out.println("Variable Value = " + rusultnot);

        //Q100. Left Shift
        //int a = 5;
        //Use << to shift a left by 1 position.
        //Print the result.
        System.out.println("Q.100");
        int usa = 5;
        int resultusa = usa << 1;
        System.out.println("Variable Value = " + resultusa);

        //Q101. Right Shift
        //int a = 20;
        //Use >> to shift a right by 2 positions.
        //Print the result.
        System.out.println("Q.101");
        int right = 20;
        int rusultright = right >> 2;
        System.out.println("Variable Value = " + rusultright);

        //Q102. AND Practice
        //int a = 10;
        //int b = 6;
        //Use & and print the result.
        System.out.println("Q.102");
        int gr = 10;
        int gb = 6;
        int ruseultgr = gr & gb;
        System.out.println("Variable Value = " + ruseultgr);

        //Q103. OR Practice
        //int a = 10;
        //int b = 6;
        //Use | and print the result.
        System.out.println("Q.103");
        int Ag = 10;
        int Br = 6;
        int rusultBr = Ag | Br;
        System.out.println("Variable Value = " + rusultBr);


        //Q104. XOR Practice
        //int a = 10;
        //int b = 6;
        //Use ^ and print the result.
        System.out.println("Q.104");
        int AAt = 10;
        int BBt = 6;
        int rusultAAt = AAt ^ BBt;
        System.out.println("Variable Value = " + rusultAAt);

        //Q105 — Dry Run Challenge
        //int a = 8;
        //int result = a << 2;
        //Without running the code, find the value of result.
        System.out.println("Q.105");
        System.out.println(" Answer is = 32");





        //instanceof Operator — Q106–Q115

        //Q106. String Check
        //A String object "Java" is given. Use the instanceof operator to check whether it is a String.

        System.out.println("Q.106");
        String nma = "java";
        System.out.println(nma instanceof String);


        //Q107. Integer Check
        //An Integer object 100 is given. Check whether it is an Integer.
        System.out.println("Q.107" );
         Object integer = 100;
        System.out.println(integer instanceof Integer);

        //Q108. Object Reference
        //Store a String object "Hello" in an Object reference. Check whether the object is a String.
        Object object = "Hello";
        System.out.println(object instanceof String);

        //Q109. Wrong Type Check
        //A String object "Java" is given. Check whether it is an Integer.
        System.out.println("Q.109");
        Object ob = "Hello";
        System.out.println(ob instanceof Integer);

        //Q110. Two Type Checks
        //A String object "Programming" is given. Check whether it is:
        //a String
        //an Objectin
        System.out.println("Q.110");
        Object aoa = "Programming";
        System.out.println(aoa instanceof String);
        System.out.println(aoa instanceof Object);


        //Q111. Multiple Checks
        //An Integer object 50 is given. Check whether it is:
        //an Integer
        //a String
        System.out.println("Q.111");
        Object aob = 50;
        System.out.println(aob instanceof Integer);
        System.out.println(aob instanceof String);

        //Q112. Object Reference Check
        //Store "Hello" in an Object variable. Check whether the object is:
        //a String
        //an Integer
        System.out.println("Q.112");
        Object mp = "Hello";
        System.out.println(mp instanceof Integer);
        System.out.println(mp instanceof String);

        //Q113. Character Check
        //A Character object 'A' is given. Check whether it is a Character.
        System.out.println("Q.113");
        Object o = 'A';
        System.out.println(o instanceof Character);

        //Q114. Multiple Type Check
        //A String object "Java" is given. Check whether it is:
        //a String
        //an Object
        //an Integer
        System.out.println("Q.114");
        Object oa = "Java";
        System.out.println(oa instanceof String);
        System.out.println(oa instanceof Object);
        System.out.println(oa instanceof Integer);

        //Q115. Dry Run Challenge
        //Without running the code, determine the output:
        //String name = "Java";
        //System.out.println(name instanceof String);
        //System.out.println(name instanceof Object);
        System.out.println("Q.115");
        System.out.println("The String ans is = True");
        System.out.println("The Object ans is = True");


    }
}
