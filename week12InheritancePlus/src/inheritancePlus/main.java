package inheritancePlus;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int[] a = {1, 3, 5, 7};
        int[] b = {1, 3, 6, 7, 9};
        int[] c = {};
        int[] d = {2, 3, 4, 5, 6, 7};
        System.out.println(oddAndEvens(b));
    }

    public static int checkArrays(int[] arrayA, int[] arrayB) {
        int smallerLength = 0;
        int retval = 0;
        if(arrayA.length ==0 || arrayB.length ==0){
            return retval;
        }
        if (arrayA.length > arrayB.length) {
            smallerLength = arrayB.length;
        } else {
            smallerLength = arrayA.length;
        }
        int i = 0;
        while (arrayA[i] == arrayB[i]) {
            retval++;
            i++;
        }
        return retval;
    }

    public static int oddAndEvens(int[] myArray){
        int sum = 0;
        if(myArray[0]%2==0){
            int j = 0;
            while (j<myArray.length && myArray[j]%2 ==0 ){
                sum += myArray[j];
                j++;
            }
        }else {
            int k = 0;
            while (k<myArray.length && myArray[k]%2 !=0 ){
                sum += myArray[k];
                k++;
            }
        }
        return sum;
    }
    
}
