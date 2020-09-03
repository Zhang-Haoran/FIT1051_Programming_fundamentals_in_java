public class main {
    public static void main(String[] args) {
        System.out.println(isADigitString("8889"));
    }

    public static boolean isADigitString(String myString) {
        boolean b = true;

        for (int i = 0; i < myString.length(); i++) {
            int a = 0;

            a = myString.codePointAt(i);
            if (a <= 57 && a >= 48) {
                b = true;
            } else{
                b = false;
            }

        }
        return b;
    }
}
