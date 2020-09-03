package week08;

/**
 * Created by shuxford on 25/12/2015.
 */
public class DoingIt {
    Window myWindow;

    //IMPORTANT - Window class refactored to instantiate 1 DoingIt object for all Do It button clicks
    //IMPORTANT - not instantiating 1 DoingIt object per Do It button click
    //IMPORTANT - This allows the class level variable "step" to persist between Do It button clicks

    int step = 2; //for method hierarchy example
    int goodCounter = 0; //for countExecutions example


    public void doIt(Window win){
        myWindow = win;

        //caller();
        //AnotherCaller();
        //orchestratingMethod();
        //ex11calling();
        //ex13calling();
        ex14calling();
        //ex21calling();

        //EXERCISE 3.3 CALLER
        //timesTable(32, 3, 5, ":");
        //labExn();

        //I'm leaving you to code and organise your Lab Exercise methods from now on
    }

    //LAB EXERCISES for you to code ============================================
    private void ex11calling() {
        int[] intArray = {1, 5, 8, 184, 123123};
        int num = 56;

        myWindow.clearOut();

        myWindow.writeOutLine("Before calling ex11Called(): ");
        myWindow.writeOutLine("Variable 'num' = " + num);
        myWindow.writeOutLine("First element in intArray = " + intArray[0]);
        myWindow.writeOutLine("Second element in intArray = " + intArray[1]);
        myWindow.writeOutLine("The reference of array is "+intArray);
        ex11called(intArray, num);

        myWindow.writeOutLine("After calling ex11Called(): ");
        myWindow.writeOutLine("Variable 'num' = " + num);
        myWindow.writeOutLine("First element in intArray = " + intArray[0]);
        myWindow.writeOutLine("Second element in intArray = " + intArray[1]);
    }

    private void ex11called(int[] array, int someNum) {
        myWindow.writeOutLine("");

        someNum = 57; //Value type value is only copied; no change is made to num.

        myWindow.writeOutLine("The reference of array is "+array);
        int[] x = array;
        myWindow.writeOutLine("The reference of x is "+x);


        array[0]+= 1;
        //Reference type is passed as an address to the function
        // so changes are made to intArray[].
        array[1] = array[2];
    }

    //END EXERCISE 1.1 CODE

    //EXERCISE 1.3 CODE
    private void ex13calling() {
        int n1, n2;
        n1 = 50;
        n2 = 40;

        myWindow.clearOut();

        myWindow.writeOutLine("Before calling, n1 = " + n1 + ", n2 = " + n2);
        ex13called(n1, n2);
        myWindow.writeOutLine("after formal parameter die, n1: "+n1 +"n2:" + n2);
    }

    private void ex13called(int n2, int n1) {
        myWindow.writeOutLine("After calling, n2 = " + n2 + ", n1 = " + n1);
    }

    //END EXERCISE 1.3 CODE

    //EXERCISE 1.4 CODE
    private void ex14calling() {
        myWindow.clearOut();

        for (int i = 0; i <= 35; i++) {
            myWindow.writeOutLine(daySuffix(i + ""));
        }

        //Assorted tests to check everything else.
        daySuffix("Potato");
        daySuffix("1223.3");
        daySuffix("-421312");
    }

    private String daySuffix(String date) {
        double dateInDouble = 0.0;
        int rounded = 0;
        String output = null;

        if (isNumeric(date)) {
            dateInDouble = Double.parseDouble(date);
            rounded = (int) Math.round(dateInDouble);

            if (rounded >= 1 && rounded <= 31) {
                if (rounded >= 4 && rounded <= 20 || rounded >= 24 && rounded <= 30) {
                    output = rounded + "th";
                }
                else if (rounded == 1 || rounded == 21 || rounded == 31) {
                    output = rounded + "st";
                }
                else if (rounded == 2 || rounded == 22) {
                    output = rounded + "nd";
                }
                else if (rounded == 3 || rounded == 23) {
                    output = rounded + "rd";
                }
            }
            else{
                output = "error";
            }
        }
        return output;
    }

    //END EXERCISE 1.4 CODE

    //EXERCISE 2.1 CODE
    private void ex21calling() {
        myWindow.clearOut();

        for (int i = 0; i < 5; i++) {
            ex21CalledLocal(goodCounter);
        }
    }

    private void ex21CalledLocal(int count) {
        count++;
        myWindow.writeOutLine("Method called " + count + " times.");
        goodCounter++;
        myWindow.writeOutLine("Method called " + goodCounter + " times.");
    }


    //I'm leaving you to code and organise your Lab Exercise methods from now on



    //WORKSHOP CODE for you to play with =======================================
    private void caller(){
        double number1 = 7.0;

        myWindow.clearOut();
        myWindow.writeOutLine("Before call to calledNoReturn()");
        calledNoReturn(number1 + 10.0, Math.pow(number1, 2));
        myWindow.writeOutLine("After call to calledNoReturn()");
    }

    private void calledNoReturn(double n1, double n2){
        double sum = 0;
        sum = n1 + n2;
        myWindow.writeOutLine("calledNoReturn begins executing");
        myWindow.writeOutLine("sum of formal parameters is: " + sum);
        myWindow.writeOutLine("calledNoReturn finishes executing");
    }

    private void AnotherCaller(){
        double number1 = 7.0;

        myWindow.clearOut();
        myWindow.writeOutLine("Before call to calledReturn()");
        myWindow.writeOutLine(100.0 + calledReturn(number1 + 10.0, Math.pow(number1, 2)));
        myWindow.writeOutLine("After call to calledReturn()");
    }

    private double calledReturn(double n1, double n2){
        double sum = 0;
        sum = n1 + n2;
        myWindow.writeOutLine("calledReturn begins executing");
        myWindow.writeOutLine("about to execute return statement");
        return sum;
        //myWindow.writeOutLine("calledReturn finishes executing"); unreachable statement
    }


    //==========================================================================
    //METHOD HIERARCHY - EXAMPLE
    private void orchestratingMethod(){ //no display dependency
        String instructions = "";
        instructions += "Enter a comma separated list like: \n";
        instructions += "start table, end table, start range, end range, multiplication symbol.\n";
        instructions += "Then click the Do It! button again.";


        if (step == 1) {
            prompt(instructions);
            step = 2;
        }
        else if (step == 2) {
            displayOutput(process(getInput()));
            step = -1; //end step sequence
        }
        else{
            //do nothing step sequence has finished
        }
    }

    private void prompt(String promptToDisplay){
        myWindow.clearOut();
        myWindow.clearIn();

        myWindow.writeOutLine(promptToDisplay);
    }

    private String[] getInput(){
        return myWindow.readIn().split("\\s*,\\s*"); //splits into tokens
    }

    private String process(String[] splitInput){ //no display dependency
        int startTable, stopTable, from, to;
        String symbol;
        String result = "";

        //exception handling should start here
        startTable = Integer.parseInt(splitInput[0]);
        stopTable = Integer.parseInt(splitInput[1]);
        from = Integer.parseInt(splitInput[2]);
        to = Integer.parseInt(splitInput[3]);
        //exception handling should stop here

        symbol = splitInput[4];


        for (int i = startTable; i <= stopTable; i++){
            result += ">>>" + i + " times table\n";
            result += timesTable(i, from, to, symbol) + "\n";
        }

        return result;
    }

    private void displayOutput(String toDisplay){
        myWindow.clearOut();
        myWindow.writeOutLine(toDisplay);
    }

    private String timesTable(int tableNumber, int from, int to, String timesSymbol){
  /*    String table = "";

        for (int i = from; i <= to; i++){
            table += String.format("%3d %s %3d = %3d\n", i, timesSymbol, tableNumber, i * tableNumber);
        }

        return table;*/


       return "timesTables() method ran. \n tableNumber = " + tableNumber + "\n" + "Starting point (from) = " + from + "\n" + "Ending point (to) = " + to + "\n" + "timesSymbol = " + "'" + timesSymbol + "'";
    }
    //==========================================================================


    // =========================================================================
    // UTILITIES ===============================================================
    // =========================================================================
    private boolean isNumeric(String str){
        return str.matches("-?\\d+(\\.\\d+)?");  //match a number with optional '-' and decimal.
    }

}
