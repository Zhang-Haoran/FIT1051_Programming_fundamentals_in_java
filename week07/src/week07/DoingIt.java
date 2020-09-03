package week07;

/**
 * Created by shuxford on 25/12/2015.
 */
public class DoingIt {
    Window myWindow;

    //class level variables here

    public void doIt(Window win){
        myWindow = win;

        //whileForPaste01();
        //whileForPaste02();
        //whileForPaste03();
        //whileForPaste04();

        //forForPaste01();
        //enhancedForForPaste01();
        //videoWhileLoopInfiniteLoop01();

        //I'm leaving you to code and organise your Lab Exercise methods from now on


        //whileEx12();
        //whileEx21();
        //whileEx32();
        //whileEx42();
        //whileEx51();

        //forEx12();
        //forEx22();
        //forEx32();
       // forEx42();

        //enhancedForEx61();
        enhancedForEx62();
    }

    //LAB EXERCISES for you to code ===========================================

    private void whileEx12(){
        int num1, num2, count;

        num1 = getRandom(1, 6);
        num2 = getRandom(1, 6);
        count = 1;

        myWindow.clearOut();

        while (num1 != num2) {
            myWindow.writeOutLine("Value 1 = " + num1 + " Value 2 = " + num2);

            num1 = getRandom(1, 6);
            num2 = getRandom(1, 6);
            count++;
        }

        myWindow.writeOutLine("It took " + count + " rolls to get equal numbers.");
    }

    private void whileEx21() {
        int counter = 0;
        int total = 0;
        int[] array = {1, 4, 5, 9};

        myWindow.clearOut();
        if (array.length == 0) {
            myWindow.writeOutLine("The array is empty.");
        } else {
            while (counter < array.length) {
                total += array[counter];

                counter++;
            }

            myWindow.writeOutLine("Sum of array is " + total);
        }
    }

    private void whileEx32() {
        int counter = 0;
        double average = 0.0;
        int[] array = {145676, 231234, 312312, 4};

        myWindow.clearOut();
        if (array.length == 0) {
            myWindow.writeOutLine("The array is empty.");
        } else {
            while (counter < array.length) {
                average += array[counter];
                counter++;
            }

            average = (average / counter);

            myWindow.writeOutLine("The average of the array is " + average);
        }
    }
    private void whileEx42() {
        String[] array = {"1", "2", "3", "done", "4"};
        //String[] array = {};
        int total, counter, temp;
        total = counter = temp = 0;

        myWindow.clearOut();

        if (!(array.length == 0)) {
            while (!(array[counter].equals("done"))) {
                while (counter < array.length - 1) {
                    if (isNumeric(array[counter])) {
                        temp = Integer.parseInt(array[counter]);
                        total += temp;
                    }
                    counter++;
                }
                myWindow.writeOutLine(total);
                break;
            }
        }
        else {
            myWindow.writeOutLine("The array is empty.");
        }
    }

    private void whileEx51() {
        int num1, num2, count, testCounter;
        double longTermAverage = 0.0;

        num1 = getRandom(1, 6);
        num2 = getRandom(1, 6);
        count = testCounter = 0;

        myWindow.clearOut();

        while (testCounter < 50) {

            count = 1;
            num1 = getRandom(1, 6);
            num2 = getRandom(1, 6);

            while (num1 != num2) {
                num1 = getRandom(1, 6);
                num2 = getRandom(1, 6);
                count++;

                myWindow.writeOutLine("Value 1 = " + num1 + " Value 2 = " + num2);
            }
            longTermAverage += count;
            testCounter++;

        }

        longTermAverage = (longTermAverage / 50);

        myWindow.writeOutLine("\nThe average amount of rolls to get two equal numbers after \n50 successful rolls is " + longTermAverage);
    }

    //FOR LOOP TASKS
    private void forEx12() {
        final int MULTIPLIER = 7;
        String resultStorage = "";
        int result;

        myWindow.clearOut();

        for (int i = 100; i >= 1; i--) {
            result = i * MULTIPLIER;

            resultStorage += ("7 X " + i + " = " + result + "\n");
        }

        myWindow.writeOutLine(resultStorage);
    }

    private void forEx22() {
        int counter, count;
        counter = count = 0;
        int[] years = new int[304];

        myWindow.clearOut();

        for (int year = 1752; year <= 3000; year++) {
            if (((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0))) {
                years[counter] = year;
                counter++;
            }
        }
        for (int i = 0; i < years.length - 1; i++) {
            myWindow.writeOut(years[i] + ", ");
            count++;
            if (count == 9) {
                myWindow.writeOutLine(years[i] + "\n");
                count = 0;
            }
        }
        myWindow.writeOutLine("\nTotal number of leap years between 1752 and 3000 = " + (years.length - 1));
    }

    private void forEx32() {
        int[] array = {-1, 1, 2, 3, 4, 5, 6, 1055761, 7};
        int min, max;
        min = max = array[0];

        myWindow.clearOut();

        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
        }
        myWindow.writeOutLine("Minimum value = " + min + ", Maximum Value = " + max);
    }

    private void forEx42() {
        final String SEARCH_VALUE = "Dane";
        String[] arrayOfNames = {"Matt","Bill", "Tanya", "Chloe", "Joseph", "Mary","Dane"};
        int counter = 0;

        myWindow.clearOut();

        while (!arrayOfNames[counter].equals(SEARCH_VALUE)) {
            myWindow.writeOutLine(arrayOfNames[counter] + " does not equal 'Dane'." );
            counter++;
        }
        myWindow.writeOutLine("Dane first found at index " + counter + ".");

    }

    //ENHANCED FOR LOOP TASKS
    private void enhancedForEx61() {
        int[] bigScreenTVMonthlyUnitsSold = {435, 151, 120, 134, 199, 201, 312, 147, 107, 127, 115, 258};
        int monthCount = 0, counter = 0;

        //With a normal for loop
        for (int i = 0; i < bigScreenTVMonthlyUnitsSold.length; i++) {
            if (bigScreenTVMonthlyUnitsSold[i] > 200) {
                monthCount++;
            }
        }

        myWindow.clearOut();
        myWindow.writeOutLine("Number of months: " + monthCount);

        monthCount = 0;
        //With a while loop

        while (counter < bigScreenTVMonthlyUnitsSold.length) {
            if (bigScreenTVMonthlyUnitsSold[counter] > 200) {
                monthCount++;
            }
            counter++;
        }
        myWindow.writeOutLine("Number of months: " + monthCount);
    }

    private void enhancedForEx62() {
        int[] integerArray = {1, 4, 6, 8, 10};

        myWindow.clearOut();
        for (int elem : integerArray) {
            elem += 1;
        }

        for (int i = 0; i < integerArray.length; i++) {
            myWindow.writeOutLine(integerArray[i]);
        }

    }

    //I'm leaving you to code and organise your Lab Exercise methods from now on



    //WORKSHOP CODE for you to play with ======================================
    private void whileForPaste01(){
        int count = 0, total = 0;

        while (total < 1000){
            total += getRandom(1, 6); //see utility methods below
            count++;
        }

        myWindow.clearOut();
        myWindow.writeOutLine("Count: " + count);
    }

    private void whileForPaste02(){
        int counter;
        int limit = 100;
        final int SENTINEL = -1 + (int) (Math.random() * 12); //[-1 .. 10]
        int  value = 0;
        boolean condition = false;

        //use a for loop for best style
        counter = 0; // or 1 depending on statements in loop block
        while (counter <= limit){ //or < or >= or > (== and != are risky, they could be skipped over)

            //process

            counter++; //or some other incrementing/decrementing
        }

        //get initial value from source
        while(value != SENTINEL){ //!value.equals(SENTINEL) for Strings

            //process input

            //get next value from source
        }

        //perform potential condition changing calculations with initial values
        while (condition){

            //process

            //perform potential condition changing calculations with updated values
        }
    }

    private void whileForPaste03(){
        final int SENTINEL = -1;
        int input = -1 + (int) (Math.random() * 12);
        myWindow.clearOut();

        while (input != SENTINEL)
            myWindow.writeOutLine(input);
            input = -1 + (int) (Math.random() * 12);

        while (input != SENTINEL)
            myWindow.writeOutLine(input);
        input = -1 + (int) (Math.random() * 12);

        while (input != SENTINEL) {
            myWindow.writeOutLine(input);
            input = -1 + (int) (Math.random() * 12);
        };

        while (input != SENTINEL); {
            myWindow.writeOutLine(input);
            input = -1 + (int) (Math.random() * 12);
        }
    }

    private void whileForPaste04(){
        int[] someArray = {1, 2, 3, 4, 5};
        int i;

        i = 0;
        while (i < someArray.length){   // takes care of an empty array
                                        //but not a null array
            // process the ith element using someArray[i] to access its value

            i++;
        }
    }


    private void forForPaste01(){
        final int MULTIPLIER = 7;
        int result;

        myWindow.clearOut();
        for (int i = 10; i >= 1; i--){
            result = i * MULTIPLIER;
            myWindow.writeOutLine("7 X " + i + " = " + result);
        }
    }

    private void enhancedForForPaste01(){
        int [] bigScreenTVMonthlyUnitsSold = {435, 151, 120, 134, 199, 201, 312, 147, 107, 127, 115, 258};
        int monthCount = 0;

        for (int elem : bigScreenTVMonthlyUnitsSold){
            if (elem >= 200)
                monthCount++;

        }

        myWindow.clearOut();
        myWindow.writeOutLine("Number of months: " + monthCount);
    }

    private void videoWhileLoopInfiniteLoop01(){

        int i = 1;

        while (i != 10){
            //process

            i = i + 2;
        }

    }


    //==========================================================================
    // UTILITIES ===============================================================
    //==========================================================================
    private static boolean isNumeric(String str){
        return str.matches("-?\\d+(\\.\\d+)?");  //match a number with optional '-' and decimal.
    }

    private static int getRandom(int n1, int n2){
        int retVal = 0;

        retVal = n1 + (int) Math.floor(Math.random() * (n2 - n1 + 1));

        return retVal;
    }

}
