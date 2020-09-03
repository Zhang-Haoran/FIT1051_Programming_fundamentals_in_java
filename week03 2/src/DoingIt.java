/**
 * Created by shuxford on 25/12/2015.
 */
public class DoingIt {
    Window myWindow;

    public void doIt(Window win){
        myWindow = win;

        //ex01();
        //ex02();
        ex03();
        //ex04();

        //firstExample();
        //secondExample();
        //constants();
        //workshop();
        //dataTypesExamples();
        //dataTypesConversions();
    }

    private void workshop(){
        System.out.println(123+"");

    }
    private void ex01(){
        //<<<Documentation for methods of the Window class>>>
        //that can be applied to the instance of Window referenced by the variable myWindow
        //myWindow.clearOut()               clears all text from the output text area
        //myWindow.readIn()                 returns as a String whatever text is in the input text area
        //myWindow.writeOut(someExp)        displays its expression parameter but does NOT throw a line
        //myWindow.writeOutLine(someExp)    displays its expression parameter but does throw a line

        //the two write methods will except any value of a primitive type and display the String version of the value
        //how this kind of flexibility is implemented and what is the String version of a non-String value
        //are topics for much later
        //<<<end>>>

        //YOUR CODE BELOW HERE
        myWindow.clearOut();
        myWindow.writeOutLine("ex01 here");
        String input = myWindow.readIn();
        myWindow.writeOut(input);
        myWindow.writeOut("I use writeout method,therefore, do not have line");
        //YOUR CODE ABOVE HERE
    }

    private void ex02(){
        //YOUR CODE BELOW HERE
        myWindow.clearOut();
        myWindow.writeOutLine("ex02 here");
        System.out.println("first:"+1+2+3);

        int num1 =1;
        int num2 =2;
        int num3 =3;
        int sum = num1+num2+num3;
        System.out.println("second:"+sum);

        int totalSum = 0;
        for(int i=0;i<4;i++){
            totalSum = totalSum+i;
        }
        System.out.println("third:"+totalSum);



        //YOUR CODE ABOVE HERE
    }

    private void ex03(){
        //YOUR CODE BELOW HERE
        myWindow.clearOut();
        myWindow.writeOutLine("ex03 here");
        //Variable Declarations (including assignment of initial value)
        final int NUMBER_OF_FLOORS = 52, WATER_WEIGHT = 1;
        int numberOfFloorsInConstruction = 12, numStudentsEnrolled = 451, stockMarketStatus = 1;
        boolean isDoorLocked = true;
        double userWeightKilos = 75.0;
        String COMPANY_POST_CODE = "3172";
        String userInputtedName = "John", userInputtedInteger = "0";


        myWindow.writeOutLine("The number of floors in the complete building is(int constant): " + NUMBER_OF_FLOORS);
        myWindow.writeOutLine("The number of floors in the incomplete building is(int variable): " + numberOfFloorsInConstruction);

        userInputtedInteger = myWindow.readIn();
        myWindow.writeOutLine("The number you inputted is(int variable): " + userInputtedInteger);
        myWindow.clearIn();

        myWindow.writeOutLine("Is the door locked? (boolean)" + isDoorLocked);

        //best way to do this?
        //userInputtedName = myWindow.readIn();

        myWindow.writeOutLine("The name you inputted is(string variable): " + userInputtedName);
        myWindow.clearIn();

        myWindow.writeOutLine("The number of students enrolled in FIT1051 is:(int variable) " + numStudentsEnrolled);
        myWindow.writeOutLine("My weight, in kilograms, is:(double variable) " + userWeightKilos);
        myWindow.writeOutLine("The weight of the water bottle is:(int constants) " + WATER_WEIGHT);
        myWindow.writeOutLine("The company's postcode is:(string constants) " + COMPANY_POST_CODE);

        String actualStockMarketStatus = "Flat";

        switch (stockMarketStatus) {
            case 1:
                actualStockMarketStatus = "Bear";
                break;

            case 2:
                actualStockMarketStatus = "Bull";
                break;

            default:
            case 3:
                actualStockMarketStatus = "Flat";
                break;
        }

        myWindow.writeOutLine("The stock market was(i use switch case!) " + actualStockMarketStatus+ " today!");
        //YOUR CODE ABOVE HERE
    }

    private void ex04(){
        //YOUR CODE BELOW HERE
        myWindow.clearOut();
        myWindow.writeOutLine("ex04 here");
        String variableString = "123";
        int variableInt = 5;
        double variableDouble = 76.4;
        boolean variableBoolean = true;

        //variableString = variableBoolean; (String containing boolean value is not possible.)
        //variableString = variableInt; (String cannot convert integers.)
        //variableString = variableDouble; (String cannot convert doubles.)

        //variableString = (String) variableBoolean; (String cannot hold boolean value even when casted.)
        //variableString = (String) variableInt; (String cannot hold integers even when casted.)
        //variableString = (String) variableDouble; (String cannot hold doubles even when casted.)

        //variableInt = variableString; (Integer cannot convert strings by default, could be not numeric.)
        //variableInt = variableDouble; (Integer cannot convert doubles, doubles can be out of range of integer.)
        //variableInt = variableBoolean; (Integer cannot convert boolean, as it's either true or false.)

        //variableInt = (int) variableString; (Integer cannot cast Strings.)
        variableInt = (int) variableDouble; // Can force java to store a double in an int.
        //variableInt = (int) variableBoolean; (Integer cannot cast Booleans)

        //variableDouble = variableString; (Double cannot convert strings by default, could be not numeric.)
        variableDouble = variableInt; //Widening of a double to an int is fine, as the largest int would fit easily inside of the range of a double.
        //variableDouble = variableBoolean; (Double cannot convert boolean, as it's either true or false.)

        //variableDouble = (double) variableString; (String can be out of range or non-numeric)
        variableDouble = (double) variableInt; // Can force int to a double because it would fit in range.
        //variableDouble = (double) variableBoolean; (Boolean is true or false, non-numeric.)

        //variableBoolean = variableString; (Boolean cannot convert strings, as strings can be more than true or false.)
        //variableBoolean = variableDouble; (Boolean cannot convert doubles, as doubles are numeric.)
        //variableBoolean = variableInt; (Boolean cannot convert integers, as integers are numeric.)

        //variableBoolean = (boolean) variableString; (String can be wider than true or false.)
        //variableBoolean = (boolean) variableDouble; (Double is numeric, not true or false.)
        //variableBoolean = (boolean) variableInt; (Integer is numeric, not true or false.)

        myWindow.writeOutLine("In conclusion, java can only convert, by itself, from double to int.");
        myWindow.writeOutLine("It can also cast a doubt to an int, and vice versa, even though it's a bad idea.");

        //YOUR CODE ABOVE HERE
    }


    //WORKSHOP CODE
    private void firstExample(){
        String firstName = "Stephen";   //declaration and initial assignment
        String lastName, fullName;      //declaration only

        myWindow.clearOut();            //clear display

        lastName = "Huxford";           //assignment of String literal

        fullName = firstName + " " + lastName;  //assignment of String expression

        myWindow.writeOutLine(fullName); //write to display
    }

    private void secondExample(){
        int number1; //declarations first in a method
        int sum;

        myWindow.clearOut();

        //myWindow.writeOutLine(number); //error
        //myWindow.writeOutLine(number1); //error

        number1 = 7;
        myWindow.writeOutLine(number1);

        number1 = number1 + 1; //mathematical impossibility
        myWindow.writeOutLine(number1);

        myWindow.writeOutLine(number1 + 11); //bad style, calculate then display
        sum = number1 + 11;
        myWindow.writeOutLine(number1 + 11);

        myWindow.writeOutLine(number1); //variable value unchanged
    }

    private void constants(){
        final int NUMBER_OF_DEPARTMENTS = 39;

        //NUMBER_OF_DEPARTMENTS = 40; error
    }

    private void dataTypesExamples(){
        char myChar, firstInitial = 'S', fullStop = '.';
        int enrolledStudents = 100, total = 0;
        double weightInKilos, totalWeightInKilos = 0.0;
        boolean testResult = false;

        myWindow.clearOut();
        myWindow.writeOutLine("First initial is " + firstInitial + fullStop);
        myWindow.writeOutLine("Number of enrolled students: " + enrolledStudents + fullStop);
        myWindow.writeOutLine("Test result was " + testResult + fullStop);
    }

    private void dataTypesConversions(){
        float money;
        int dollars = 3; //IDE tells me this var is redundant

        money = dollars; //widening conversion OK, loss of accuracy

        double sum = 17.0, result;
        int count = 10;

        result = sum / count; //copy of count promoted to double

        double moreMoney = 5.67;
        int moreDollars = 3;

        //moreDollars = moreMoney; //type mismatch compiler error reported
        moreDollars = (int) moreMoney; //cast forces conversion with truncation

        String digitString = "123";
        int intTarget;

        //target = (int) "123"; // error inconvertible types

        boolean found = true;
        float floatTarget;

        //floatTarget = (float) found;

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
