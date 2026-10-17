package Basice;

import javax.print.attribute.standard.MediaSize;
import java.sql.SQLOutput;

public class IFelse{
    static void main(String[] args) {
        //Practice — Q116–Q125
        //Q116. Basic if
        //An integer age = 20 is given. If the age is greater than or equal to 18, print "Adult".
        System.out.println("Q.116");
        int age = 20;
        if(age >= 18){
            System.out.println("Adult");
        }


        //Q117. Positive Number
        //An integer number = 10 is given. If the number is greater than 0, print "Positive".
        System.out.println("Q.117");
        int num =10;
        if(num > 0) {
            System.out.println("Positive");
        }

        //Q118. Pass Check
        //An integer marks = 75 is given. If marks are greater than or equal to 40, print "Pass".
        System.out.println("Q.118");
        int mar = 75;
        if(mar >= 40){
            System.out.println("Pass");
        }

        //Q119. Even Number
        //An integer number = 12 is given. If the number is even, print "Even".
        System.out.println("Q.119");
        int nu = 12;
        if(nu % 2 == 0){
            System.out.println("Even");
        }
        //Q120. Greater Number
        //Two integers a = 50 and b = 30 are given. If a is greater than b, print "a is greater".
        System.out.println("Q.120");
        int a = 50;
        int b = 30;
        if(a > b){
            System.out.println(" A Great");
        }

        //Q121. Temperature Check
        //An integer temperature = 35 is given. If the temperature is greater than 30, print "Hot".
        System.out.println("Q.121");
        int temperature = 35;
        if (temperature > 30){
            System.out.println("Hot");

        }

        //Q122. Salary Check
        //A double salary = 30000 is given. If salary is greater than or equal to 25000, print "Good Salary".
        System.out.println("Q.122");
        double salary = 30000;
        if (salary >= 25000){
            System.out.println("Good Salary");
        }

        //Q123. Divisible by 5
        //An integer number = 25 is given. If the number is divisible by 5, print "Divisible by 5".
        System.out.println("Q.123");
        int numb = 25;
        if(numb % 5 == 0) {
            System.out.println("Divisible by 5");
        }

        //Q124. Age Check
        //An integer age = 16 is given. If age is less than 18, print "Minor".
        System.out.println("Q.124");
        int agee = 16;
        if(agee < 18){
            System.out.println("Minor");
        }

        //Q125. Dry Run Challenge
        //Without running the code, determine the output:
        //int x = 15;

        //if (x > 10) {
        //System.out.println("A");
        //}
        System.out.println("Q.125");
        System.out.println("x > 10 - 15 > 10 se to yes it is gerater than 10 than print true than answer is coming A");



        //if-else Practice — Q126–Q135

        //Q126. Adult or Minor
        //An integer age = 20 is given.
        //If age >= 18, print "Adult", otherwise print "Minor".
        System.out.println("Q.126");
        int Age = 20;
        if(Age >= 18){
            System.out.println("Adult");
        }else{
            System.out.println("Minoe");
        }

        //Q127. Positive or Negative
        //An integer number = -10 is given.
        //If the number is greater than or equal to 0, print "Positive", otherwise print "Negative".
        System.out.println("Q.127");
        int number = -10;
        if(number >= 0){
            System.out.println("Positive");
        }else{
            System.out.println("Negative");
        }

        //Q128. Pass or Fail
        //An integer marks = 35 is given.
        //If marks >= 40, print "Pass", otherwise print "Fail".
        System.out.println("Q.128");
        int mark = 35;
        if(mark >= 40){
            System.out.println("Pass");
        }else{
            System.out.println("Fail");
        }

        //Q129. Even or Odd
        //An integer number = 17 is given.
        //Check whether the number is even or odd using if-else.
        System.out.println("Q.129");
        int numberr = 17;
        if(numberr % 2 == 0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }

        //Q130. Greater Number
        //Two integers a = 50 and b = 70 are given.
        //If a > b, print "a is greater", otherwise print "b is greater".
        System.out.println("Q.130");
        int aa = 50;
        int bb = 70;
        if(aa > bb){
            System.out.println("A is greater than B");
        }else{
            System.out.println("B is greater than A");
        }

        //Q131. Temperature Check
        //An integer temperature = 25 is given.
        //If temperature > 30, print "Hot", otherwise print "Normal".
        System.out.println("Q.131");
        int temp = 25;
        if(temp > 30){
            System.out.println("Hot");
        }else{
            System.out.println("Normal");
        }

        //Q132. Divisible by 5
        //An integer number = 23 is given.
        //If the number is divisible by 5, print "Divisible", otherwise print "Not Divisible".
        System.out.println("Q.132");
        int numB = 23;
        if(numB % 5 == 0){
            System.out.println("Divisible");
        }else{
            System.out.println("Not Divisible");
        }

        //Q133. Voting Eligibility
        //An integer age = 17 is given.
        //If age >= 18, print "Eligible to Vote", otherwise print "Not Eligible".
        System.out.println("Q.133");
        int AgE = 17;
        if(AgE >= 18){
            System.out.println("Eligible to Vote");
        }else{
            System.out.println("Not Eligible to Vote");
        }

        //Q134. Login Check
        //Two String variables are given:
        //username = "admin"
        //password = "1234"
        //If both are correct, print "Login Successful", otherwise print "Login Failed".
        System.out.println("Q.134");
        String username = "admin";
        String password = "1234";
        if(username .equals ("admin") && password.equals("1234")){
            System.out.println("Login Successful");
        }else{
            System.out.println("Login Failed");
        }

        //Q135. Dry Run Challenge
        //Without running the code, determine the output:
        //int x = 8;
        //if (x > 10) {
        //System.out.println("A");
        //} else {
        //System.out.println("B");
       // }
        System.out.println("Q.135");
        System.out.println("x is greater than 10 than true but hear is not true hear is false then print b so answer is B");




        //else-if Practice — Q136–Q145
        // Q136. Age Category
        // An integer age = 25 is given.
        // If age < 13, print "Child".
        // Else if age < 18, print "Teenager".
        // Otherwise, print "Adult".0
        System.out.println("Q.136");
        int AGe = 25;
        if(AGe < 13){
            System.out.println("Child");
        }else if(AGe < 18){
            System.out.println("Teenager");
        }else{
            System.out.println("Adult");
        }

        //Q137. Marks Grade
        //An integer marks = 75 is given.
        //marks >= 90 → "A"
        //marks >= 75 → "B"
        //marks >= 60 → "C"
        //Otherwise → "Fail"
        System.out.println("Q.137");
        int Mark = 75;
        if(Mark >= 90){
            System.out.println("A");
        }else if (Mark >= 75){
            System.out.println("B");
        }else if (Mark >= 60){
            System.out.println("C");
        }else {
            System.out.println("Fail");
        }

        //Q138. Positive, Negative or Zero
        //An integer number = -5 is given.
        //Greater than 0 → "Positive"
        //Less than 0 → "Negative"
        //Otherwise → "Zero"
        System.out.println("Q.138");
        int numBE = -5;
        if(numBE > 0){
            System.out.println("Positive");
        }else if (numBE < 0){
            System.out.println("Negative");
        }else {
            System.out.println("Zero");
        }

        //Q139. Temperature Category
        //An integer temperature = 35 is given.
        //Greater than 40 → "Very Hot"
        //Greater than 30 → "Hot"
        //Greater than 20 → "Normal"
        //Otherwise → "Cold"
        System.out.println("Q.139");
        int Temp = 35;
        if(Temp > 40){
            System.out.println("Very Hot");
        }else if(Temp > 30){
            System.out.println("Hot");
        }else if(Temp > 20){
            System.out.println("Normal");
        }else {
            System.out.println("Cold");
        }

        //Q140. Salary Category
        //A double salary = 45000 is given.
        //salary >= 50000 → "High Salary"
        //salary >= 30000 → "Good Salary"
        //Otherwise → "Low Salary"
        System.out.println("Q.140");
        double salarY =45000;
        if(salarY >= 50000){
            System.out.println("High Salary");
        }else if(salarY >= 30000){
            System.out.println("Good Salary");
        }else{
            System.out.println("Low Salary");
        }

        //Q141. Number Comparison
        //Two integers a = 20 and b = 20 are given.
        //If a > b, print "A is greater".
        //Else if a < b, print "B is greater".
        //Otherwise, print "Both are equal".
        System.out.println("Q.141");
        int AA = 20;
        int BB = 20;
        if(AA > BB){
            System.out.println("A is greater");
        }else if (AA < BB){
            System.out.println("B is greater");
        }else {
            System.out.println("Both are equal");
        }

        //Q142. Divisibility Check
        //An integer number = 30 is given.
        //If divisible by both 3 and 5, print "Divisible by 3 and 5".
        //Else if divisible by 3, print "Divisible by 3".
        //Else if divisible by 5, print "Divisible by 5".
        //Otherwise, print "Not Divisible".
        System.out.println("Q.142");
        int NUM = 30;
        if(NUM % 3 == 0 && NUM % 5 ==0 ){
            System.out.println("Divisible by 3 and 5");
        }else if (NUM % 3 ==0){
            System.out.println("Divisible by 3");
        }else if (NUM % 5 ==0){
            System.out.println("Divisible by 5");
        }else {
            System.out.println("Not Divisible ");
        }

        //Q143. Electricity Bill Category
        //An integer units = 250 is given.
        //units <= 100 → "Low Usage"
        //units <= 200 → "Medium Usage"
        //Otherwise → "High Usage"
        System.out.println("Q.143");
        int units = 250;
        if(units <= 100){
            System.out.println("Low Usage");
        }else if(units <=200 ){
            System.out.println("Medium Usage");
        }else{
            System.out.println("High Usage");
        }

        //Q144. Age-Based Ticket
        //An integer age = 65 is given.
        //age < 5 → "Free"
        //age <= 18 → "Child Ticket"
        //age >= 60 → "Senior Citizen Ticket"
        //Otherwise → "Regular Ticket"
        System.out.println("Q.144");
        int AGee = 65;
        if(AGee < 5) {
            System.out.println("Free");
        }else if(AGee <= 18){
            System.out.println("Child Ticket");
        }else if (AGee >= 60){
            System.out.println("Senior Citizen Ticket");
        }else{
            System.out.println("Regular Ticket");
        }

       //Q145. Dry Run Challenge
        //Without running the code, determine the output:
        //int marks = 82;
        //if (marks >= 90) {
        //System.out.println("A");
        //} else if (marks >= 75) {
        //System.out.println("B");
        //} else if (marks >= 60) {
        //System.out.println("C");
        //} else {
        //System.out.println("Fail");
        //}
        System.out.println("Q.145");
        System.out.println("So answer is B");



        //Nested if Practice — Q146–Q155

        //Q146. Age and ID Check
        //An integer age = 20 and a boolean hasID = true are given.
        //If age >= 18, check whether the person has an ID.
        //If hasID is true, print "Entry Allowed".
        //Otherwise, print "ID Required".
        System.out.println("Q.146");
        int AGE = 20;
        boolean hasid = true;
        if(AGE >= 18) {

            if(hasid){
                System.out.println("Entry Allowed");
            }else{
                System.out.println("ID Required");
            }
        }else {
            System.out.println("Age is less than 18");
        }

        //Q147. Login Check
        //Two String variables are given:
        //username = "admin"
        //password = "1234"
        //First check whether the username is correct.
        //Inside that if, check whether the password is correct.
        //Print "Login Successful" only when both are correct.
        //Otherwise, print the appropriate failure message.
        System.out.println("Q.147");
        String Username = "admin";
        String Password = "1234";
        if(Username .equals("admin")){
            if(Password.equals("1234")){
                System.out.println("Login Successful");
            }else{
                System.out.println("Failed");
            }
        }else {
            System.out.println("Username Incorrect");
        }

        //Q148. Marks and Attendance
        //marks = 75 and attendance = 80 are given.
        //If marks >= 40, check attendance.
        //If attendance >= 75, print "Eligible".
        //Otherwise, print "Low Attendance".
        //If marks are below 40, print "Fail".
        System.out.println("Q.148");
        int markS = 75;
        int attendance = 80;
        if(markS >= 40){
            if(attendance >= 75){
                System.out.println("Eligible");
            }else {
                System.out.println("Low Attendance");
            }
        }else {
            System.out.println("Fail");
        }

        //Q149. Positive Number Check
        //An integer number = 10 is given.
        //First check whether the number is positive.
        //If positive, check whether it is even.
        //Print "Positive Even" or "Positive Odd".
        //If it is not positive, print "Not Positive".
        System.out.println("Q.149");
        int numBER = 10;
        if(numBER > 0){
            if(numBER % 2 == 0){
                System.out.println("Positive  Even ");
            }else{
                System.out.println("Positive  Odd ");
            }
        }else{
            System.out.println("Not Positive");
        }

        //Q150. Age and Qualification
        //age = 22 and isGraduate = true are given.
        //If age >= 18, check whether the person is a graduate.
        //If graduate, print "Eligible".
        //Otherwise, print "Graduation Required".
        //If age is below 18, print "Underage".
        System.out.println("Q.150");
        int AGEE = 22;
        boolean graduate = true;
        if(AGEE >= 18){
            if(graduate){
                System.out.println("Eligible");
            }else{
                System.out.println("Graduarion Required");
            }
        }else{
            System.out.println("Underage");
        }

        //Q151. Number Range
        //An integer number = 50 is given.
        //If number > 0, check whether it is less than or equal to 100.
        //If yes, print "Number is between 1 and 100".
        //Otherwise, print "Number is greater than 100".
        //If the number is not positive, print "Invalid Number".
        System.out.println("Q.151");
        int NumbeR = 50;
        if(NumbeR > 0){
            if(NumbeR <= 100){
                System.out.println("Number is between 1 and 100");
            }else{
                System.out.println("Number is Greater than 100");
            }
        }else{
            System.out.println("Invalid Number");
        }

        //Q152. Salary and Experience
        //salary = 40000 and experience = 3 are given.
        //If salary >= 30000, check experience.
        //If experience >= 2, print "Eligible for Promotion".
        //Otherwise, print "Experience Too Low".
        //If salary is below 30000, print "Salary Too Low".
        System.out.println("Q.152");
        double salaRY = 40000;
        int exp = 3;
        if(salaRY >= 30000){
            if(exp >= 2){
                System.out.println("Eligible for Promotion");
            }else{
                System.out.println("Experience Too Low");
            }
        }else{
            System.out.println("Salary Too Low");
        }

        //Q153. Even Number and Range
        //An integer number = 24 is given.
        //If the number is even, check whether it is greater than 20.
        //If yes, print "Even and Greater Than 20".
        //Otherwise, print "Even and 20 or Less".
        //If the number is odd, print "Odd Number".
        System.out.println("Q.153");
        int Nu = 24;
        if(Nu % 2 == 0 ){
            if(Nu >= 20){
                System.out.println("Even and Greater Than 20");
            }else{
                System.out.println("Even and  20 or Less");
            }
        }else{
            System.out.println("Odd Number");
        }

        //Q154. Exam Eligibility
        //marks = 65 and attendance = 80 are given.
        //First check whether marks >= 40.
        //Inside it, check whether attendance >= 75.
        //If both conditions are satisfied, print "Eligible for Exam".
        //Otherwise, print the appropriate message.
        System.out.println("Q.154");
        int marks = 65;
        int atten = 80;
        if(marks >= 40){
            if(atten >= 75){
                System.out.println("Eligible for Exam");
            }else{
                System.out.println("Marks Too Low");
            }
        }else{
            System.out.println("Attendance Too Low");
        }

        //Q155. Dry Run Challenge
        //Without running the code, determine the output:
        //int age = 20;
        //boolean hasID = true;
        //if (age >= 18) {
        //if (hasID) {
        //System.out.println("A");
        //} else {
        //System.out.println("B");
        //}
        //} else {
        //System.out.println("C");
        //}
        System.out.println("Q.155");
        System.out.println("So answer is A");





        //Switch Practice — Q156–Q165
        //Q156. Day Number
        //An integer day = 3 is given. Use switch and print the corresponding day name.
        System.out.println("Q.156");
        int day = 3;
        switch (day){
            case 1 : System.out.println("Monday");
            break;
            case 2: System.out.println("Tuesday");
            break;
            case 3: System.out.println("Wednesday");
            break;
            case 4: System.out.println("Thursday");
            break;
            case 5: System.out.println("Friday");
            break;
            case 6: System.out.println("Saturday");
            break;
            case 7: System.out.println("Sunday");
            break;
            default: System.out.println("Invalid Day");
        }

        //Q157. Menu Selection
        //An integer choice = 2 is given. Use switch:
        //- 1 → Start
        //- 2 → Settings
        //- 3 → Exit
        //- Otherwise → Invalid Choice
        System.out.println("Q.157");
        int choice = 2;
        switch (choice){
            case 1 : System.out.println("Start");
            break;
            case 2 :
                System.out.println("Settings");
                break;
            case 3 :
                System.out.println("Exit");
                break;
            default:  System.out.println("Invalid Choice");
            break;
        }


        //Q158. Calculator
        //a = 20, b = 5, and operator = '+' are given. Use switch to perform +, -, *, /.
        System.out.println("Q.158");
        int aA = 20;
        int bB = 5;
        char operator = '+';

        switch (operator){
            case '+' : System.out.println("aA + bB = " + (aA + bB));
            break;
            case '-' : System.out.println("aA - bB = " + ( aA - bB));
            break;
            case '*' : System.out.println("aA * bB = " + ( aA * bB));
            break;
            case '/' : System.out.println("aA / bB = "  + ( aA / bB));
            break;
            default : System.out.println("Invalid Choice");
            break;
        }
        //Q159. Month Number
        //An integer month = 5 is given. Use switch to print the month name.
        System.out.println("Q.159");
        int month = 5;
        switch (month){
            case 1 : System.out.println("January");
            break;
            case 2 : System.out.println("February");
            break;
            case 3 : System.out.println("March");
            break;
            case 4 : System.out.println("April");
            break;
            case 5 : System.out.println("May");
            break;
            case 6 : System.out.println("June");
            break;
            case 7 : System.out.println("July");
            break;
            case 8 : System.out.println("August");
            break;
            case 9 : System.out.println("September");
            break;
            case 10 : System.out.println("October");
            break;
            case 11 : System.out.println("November");
            break;
            case 12 : System.out.println("December");
            break;
            default : System.out.println("Invalid Choice");
        }

        //Q160. Traffic Light
        //A String color = "Red" is given.
        //- Red → Stop
        //- Yellow → Ready
        //- Green → Go
        //- Otherwise → Invalid Color
        System.out.println("Q.158");
        String color ="Red";
        switch (color){
            case "Red":
                System.out.println("Stop");
                break;
            case "Yellow":
                System.out.println("Ready");
                break;
            case "Green":
                System.out.println("Go");
                break;
            default :
                System.out.println("Invalid Color");
                break;
        }

        //Q161. Grade Message
        //A char grade = 'A' is given.
        //- A → Excellent
        //- B → Good
        //- C → Average
        //- D → Poor
        //- Otherwise → Invalid Grade
        System.out.println("Q.159");
        char grade = 'A';
        switch (grade){
            case 'A' : System.out.println("Excellent");
            break;
            case 'B' : System.out.println("Good");
            break;
            case 'C' : System.out.println("Average");
            break;
            case 'D' :
                System.out.println("Poor");
                break;
            default :
                System.out.println("Invalid Grade");
        }

        //Q162. Calculator Result
        //a = 10, b = 5, operator = '*' are given. Use switch and print the calculated result.
        System.out.println("Q.159");
        int aAAa = 10;
        int bBBa = 5;
        char Operator = '*';
        switch (Operator){
            case '*' :  System.out.println("aAAa * bBBa = " + (aAAa * bBBa));
            break;
            default :
                System.out.println("Invalid Operator");
        }

        //Q163. Weekday/Weekend
        //An integer day = 6 is given. Use switch to determine whether it is a weekday or weekend.
        System.out.println("Q.159");
        int daY = 6;
        switch (daY){
            case 1:
                System.out.println("monday");
                break;
            case 2 :  System.out.println("tuesday");
            break;
                case 3 :   System.out.println("wednesday");
                break;
                    case 4 :    System.out.println("thursday");
                    break;
                        case 5 :    System.out.println("friday");
                            System.out.println("Weekday");
                            break;
                            case 6 :
                                case 7 :
                                    System.out.println("Weekend");
                                    break;
            default :
                System.out.println("Invalid Day");
                break;
        }


        //Q164. Vowel Check
        //A char ch = 'a' is given. Use switch to check whether it is a vowel.
        System.out.println("Q.164");
        char ch ='a';
        switch (ch){
            case 'a' , 'e' , 'i' , 'o' , 'u' :
                System.out.println("Vowel");
                break;
            case  'b' , 'c', 'd' ,'f' , 'g' , 'h', 'j' , 'k' ,'l', 'm','n','p' ,'q' ,'r','s' ,'t', 'v','w','x','y', 'z' :
                System.out.println("Consonant");
                break;
                default :
                    System.out.println("Invalid Choice");

        }

        //Q165. Dry Run Challenge
        //Without running the code:
        //choice = 2
        //switch(choice):
        //case 1 → print A
        //case 2 → print B
        //case 3 → print C
        //default → print D
        System.out.println("Q.159");
        System.out.println("Answer is B");




    }
}
