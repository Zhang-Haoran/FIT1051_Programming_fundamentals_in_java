package week11;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        ArrayList<String> myArray= new ArrayList<String>();
        Scanner reader = new Scanner(System.in);
        String userInput = reader.next();
        while(!userInput.equals("done")){
            myArray.add(userInput);
            userInput = reader.next();
        }
        System.out.println(myArray);







    }
}
