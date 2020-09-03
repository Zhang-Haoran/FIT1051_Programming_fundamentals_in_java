package week04;

/**
 * Created by shuxford on 25/12/2015.
 */
public class DoingIt {
    Window myWindow;

    public void doIt(Window win){
        myWindow = win;
        //ex13();
        //ex14();
        //ex22();
        //ex23();
        //ex24();
        //ex25();
        //ex26();
        //ex28();

        //assignmentIsAnOperator();
        //arithmeticOperations();
        //equalityRelationalOperators();
        //equalityRelationalOperators2();
        //logicalOperators();
        //redundantSyntax();
        //blockScopeTest();
    }

    //LAB EXERCISES for you to code
    private void ex13(){
        int a = 10;
        int b = 20;
        int temp = 0;
        temp = a;
        a = b;
        b =temp;
        System.out.println("a:"+a+","+"b:"+b);

        boolean j = true;
        boolean k = false;
        boolean swap = true;
        swap = j;
        j = k;
        k = swap;
        System.out.println("j:"+j+", k:"+k);
    }

    private void ex14()
    {
        int a = 3;
        int b = 4;
        int c = 5;
        boolean haveRoot;
        haveRoot = (Math.pow(b, 2) - 4 * a * c)>=0;
        if(haveRoot){
            double root1 = (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
            double root2 = (-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
            myWindow.writeOutLine("root 1 is x = " + root1);
            myWindow.writeOutLine("root 2 is x = " + root2);
        }

    }

    private void ex22(){
        int n = 2 ;
        boolean isEven;
        isEven = (n % 2 ==0);
        myWindow.clearOut();
        myWindow.writeOutLine("2 is perfectly divisible and should return true = " + isEven);
        n = -4;
        isEven = (n % 2 == 0);
        myWindow.writeOutLine("-4 is perfectly divisible and should return true = " + isEven);
        n = 3;
        isEven = (n % 2 == 0);
        myWindow.writeOutLine("3 is NOT perfectly divisible and should NOT return true = " + isEven);
        n = -436;
        isEven = (n % 2 == 0);
        myWindow.writeOutLine("-436 is perfectly divisible and should return true = " + isEven);
        n = 40037;
        isEven = (n % 2 == 0);
        myWindow.writeOutLine("40037 is NOT perfectly divisible and should NOT return true = " + isEven);
    }

    private void ex23(){
        int n = -3;
        boolean isOddAndNegative;
        isOddAndNegative = (n % 2 != 0 && n < 0);
        myWindow.clearOut();
        myWindow.writeOutLine("-3 is odd and negative and should return true = " + isOddAndNegative);

        n = 4;
        isOddAndNegative = (n % 2 != 0 && n < 0);
        myWindow.writeOutLine("4 is NOT odd and NOT negative and should NOT return true = " + isOddAndNegative);

        n = 0;
        isOddAndNegative = (n % 2 != 0 && n < 0);
        myWindow.writeOutLine("0 is NOT odd and NOT negative and should NOT return true = " + isOddAndNegative);

        n = -437;
        isOddAndNegative = (n % 2 != 0 && n < 0);
        myWindow.writeOutLine("-437 is odd and negative and should return true = " + isOddAndNegative);

        n = 452;
        isOddAndNegative = (n % 2 != 0 && n < 0);
        myWindow.writeOutLine("452 is NOT odd and NOT negative and should NOT return true = " + isOddAndNegative);
    }

    private void ex24(){
        boolean isInRange;
        int n = 41;
        isInRange = (n >=1 && n <= 100) && ((n % 2 != 0) && (n <40 && n > 50));
        myWindow.clearOut();
        myWindow.writeOutLine("41 should return true = " + isInRange);

        n = 50;
        isInRange = (n >=1 && n <= 100) && ((n % 2 != 0) && (n <40 && n > 50));
        myWindow.writeOutLine("50 should NOT return true = " + isInRange);

        n = 0;
        isInRange = (n >=1 && n <= 100) && ((n % 2 != 0) && (n <40 && n > 50));
        myWindow.writeOutLine("0 should NOT return true = " + isInRange);

        n = 150;
        isInRange = (n >=1 && n <= 100) && ((n % 2 != 0) && (n <40 && n > 50));
        myWindow.writeOutLine("150 should NOT return true = " + isInRange);

        n = 30;
        isInRange = (n >=1 && n <= 100) && ((n % 2 != 0) && (n <40 && n > 50));
        myWindow.writeOutLine("30 should return true = " + isInRange);

        n = 2;
        isInRange = (n >=1 && n <= 100) && ((n % 2 != 0) && (n <40 && n > 50));
        myWindow.writeOutLine("2 should return true = " + isInRange);
    }

    private void ex25(){
        String userInput;
        boolean doesContain;
        userInput ="y";
        myWindow.clearOut();
        doesContain = (userInput.equals("y") || userInput.equals("Y") || userInput.equals("n") || userInput.equals("N"));
        myWindow.writeOutLine("'" + userInput + "'" + " is either Y, y, N or n. The statement should return true. Actual result is "+doesContain);
        userInput ="Y";
        myWindow.clearOut();
        doesContain = (userInput.equals("y") || userInput.equals("Y") || userInput.equals("n") || userInput.equals("N"));
        myWindow.writeOutLine("'" + userInput + "'" + " is either Y, y, N or n. The statement should return true. Actual result is "+doesContain);
        userInput ="n";
        myWindow.clearOut();
        doesContain = (userInput.equals("y") || userInput.equals("Y") || userInput.equals("n") || userInput.equals("N"));
        myWindow.writeOutLine("'" + userInput + "'" + " is either Y, y, N or n. The statement should return true. Actual result is "+doesContain);
        userInput ="N";
        myWindow.clearOut();
        doesContain = (userInput.equals("y") || userInput.equals("Y") || userInput.equals("n") || userInput.equals("N"));
        myWindow.writeOutLine("'" + userInput + "'" + " is either Y, y, N or n. The statement should return true. Actual result is "+doesContain);
    }

    private void ex26(){
        String userInput;
        userInput = "done";
        boolean inputIsDone;
        myWindow.clearOut();
        inputIsDone = !userInput.equals("done");
        myWindow.writeOutLine(userInput + " contains 'done'. The statement should return true. Actual result is "+inputIsDone);

    }

    private void ex28(){
        int year = 2000;
        myWindow.clearOut();
        boolean isLeapYear = ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));
        myWindow.writeOutLine("2000 is a leap year = " + isLeapYear);

        year = 2100;
        isLeapYear = ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));
        myWindow.writeOutLine("2100 is NOT a leap year = " + isLeapYear);

        year = 2012;
        isLeapYear = ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));
        myWindow.writeOutLine("2012 is a leap year = " + isLeapYear);

        year = 1066;
        isLeapYear = ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));
        myWindow.writeOutLine("1066 is  NOT a leap year = " + isLeapYear);

        year = 1700;
        isLeapYear = ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));
        myWindow.writeOutLine("1700 is NOT a leap year = " + isLeapYear);

        year = 0;
        isLeapYear = ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));
        myWindow.writeOutLine("0 is a leap year = " + isLeapYear);
    }


    //WORKSHOP CODE for you to play with
    private void assignmentIsAnOperator(){
        int testInt;
        myWindow.clearOut();
        myWindow.writeOutLine(testInt = 123);
    }

    private void arithmeticOperations(){
        //using literals to keep things clear but could have used variables
        int i1, i2, i3; //these are reused multiple times for multiple uses in this method which is poor style in real code

        myWindow.clearOut();

        myWindow.writeOutLine(1.0 / 2.0);
        myWindow.writeOutLine(1 / 2);
        myWindow.writeOutLine((double) 1 / 2);

        myWindow.writeOutLine(7 % 3);
        myWindow.writeOutLine(7 % 8);

//        int counter = 0;
//        counter = counter + 1;
//        ++counter; //pre increment
//        counter++; //post increment
//
//        counter = counter - 1;
//        --counter; //pre decrement
//        counter--; //post decrement

        myWindow.writeOutLine("");
        i1 = 1; i2 = 2;
        myWindow.writeOutLine(i1 + ++i2);
        i1 = 1; i2 = 2;
        myWindow.writeOutLine(i1 + i2++);
        i1 = 1; i2 = 2;
        myWindow.writeOutLine(i1 + --i2);
        i1 = 1; i2 = 2;
        myWindow.writeOutLine(i1 + i2--);

        double totalSales = 0, thisSale;
        thisSale = 5.50;
        totalSales += thisSale;
        myWindow.writeOutLine(totalSales);
        thisSale = 7.50;
        totalSales += thisSale;
        myWindow.writeOutLine(totalSales);

//        totalSales = totalSales + thisSale;
//        totalSales += thisSale;

        myWindow.writeOutLine("");
        double pi = Math.PI;                        //no parenthesis after PI ???
        myWindow.writeOutLine(Math.floor(pi));
        myWindow.writeOutLine(Math.pow(2.0, 20));   //1MByte
        //double calculations are inaccurate
        myWindow.writeOutLine(Math.sin(2.0 * pi));
        myWindow.writeOutLine(Math.abs(-pi));

        myWindow.writeOutLine("");

        i1 = 1; i2 = 2; i3 = 3;

        myWindow.writeOutLine(i1 + i2 * i3);
        myWindow.writeOutLine((i1 + i2) * i3);
    }

    private void equalityRelationalOperators(){
        double d1 = 1.23, d2 = 3.45;
        double delta = 0.00000001;
        String s1 = "dog", s2;

        s2 = myWindow.readIn(); //assume the string dog is input

        myWindow.clearOut();
        //remember floating points are stored inaccurately
        myWindow.writeOutLine("d1 == d2: " + (d1 == d2));   //false, maybe
        myWindow.writeOutLine("d1 != d2: " + (d1 != d2));   //true, maybe
        //inner parentheses essential in the next statement. Why?
        myWindow.writeOutLine("d1 < d2: " + (d1 < d2));     //true, maybe
        myWindow.writeOutLine("d1 <= d1: " + (d1 <= d1));   //true, maybe

        //allowing for floating point inaccuracy
        myWindow.writeOutLine((d2 - d1) < delta);

        myWindow.writeOutLine("s1 == s2: " + (s1 == s2));   //false, huh!!!


    }

    private void equalityRelationalOperators2(){

        String s1 = "dog", s2, s3 = "dOg", s4 = "dogs)";

        s2 = myWindow.readIn(); //the string dog is input

        myWindow.clearOut();
        myWindow.writeOutLine("s1.equals(s2): " + s1.equals(s2));   //hooray!
        myWindow.writeOutLine("!s1.equals(s2): " + !s1.equals(s2)); //
        myWindow.writeOutLine("s1.equals(s3): " + s1.equals(s3));   //case sensitive
        //next statement: true, case insensitive
        myWindow.writeOutLine("s1.equalsIgnoreCase(s3): " + s1.equalsIgnoreCase(s3));

        myWindow.writeOutLine("s1.compareTo(s4): " + s1.compareTo(s4));  // -ve
        myWindow.writeOutLine("s4.compareTo(s1): " + s4.compareTo(s1));  // +ve
        myWindow.writeOutLine("s1.compareTo(s2): " + s1.compareTo(s2));  // 0

        myWindow.writeOutLine("s1.compareTo(s3): " + s1.compareTo(s3));  // +ve
        //next statement: 0 i.e. s1 = s2
        myWindow.writeOutLine("s1.compareToIgnoreCase(s3): " + s1.compareToIgnoreCase(s3));

    }

    private void logicalOperators(){

        int low = 50, high = 100; //inclusive
        int testValue1 = 99, testValue2 = 101;
        boolean firstTest, secondTest;

        myWindow.clearOut();

        firstTest = testValue1 >= low && testValue1 <= high; //in test
        secondTest = testValue1 < low || testValue1 > high; //out test
        myWindow.writeOutLine("testValue1 in range: " + firstTest);
        myWindow.writeOutLine("testValue1 out of range: " + secondTest);

        myWindow.writeOutLine("");
        firstTest = testValue2 >= low && testValue2 <= high; //in test
        secondTest = testValue2 < low || testValue2 > high; //out test
        myWindow.writeOutLine("testValue2 in range: " + firstTest);
        myWindow.writeOutLine("testValue2 out of range: " + secondTest);
    }

    private void redundantSyntax(){
        boolean myBoolean = true;
        boolean result;

        result = myBoolean = true;
        result = myBoolean != true;
    }

    private void blockScopeTest(){
        int outer = 1;

        myWindow.clearOut();

        myWindow.writeOutLine("outer: " + outer);
        //myWindow.writeOutLine("inner1: " + inner1); //inner1 not in scope
        //myWindow.writeOutLine("inner2: " + inner2); //inner2 not in scope
        {
            int inner1 = 2;
            myWindow.writeOutLine("outer: " + outer);
            myWindow.writeOutLine("inner1: " + inner1);
            //myWindow.writeOutLine("inner2: " + inner2); //inner2 not in scope

        }

        {
            int inner2 =3;
            myWindow.writeOutLine("outer: " + outer);
            //myWindow.writeOutLine("inner1: " + inner1); //inner1 not in scope
            myWindow.writeOutLine("inner2: " + inner2);
        }
    }



    // =========================================================================
    // UTILITIES ===============================================================
    // =========================================================================
    private static boolean isNumeric(String str){
        return str.matches("-?\\d+(\\.\\d+)?");  //match a number with optional '-' and decimal.
    }

    private static int getRandom(int n1, int n2){
        int retVal = 0;

        retVal = n1 + (int) Math.floor(Math.random() * (n2 - n1 + 1));

        return retVal;
    }

}

