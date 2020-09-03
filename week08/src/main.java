public class main {
    public static void main(String[] args) {

        String inString ="Haoran zhang";
        numOfString(inString);
    }
    private static int numOfString(String aString){
        int num = 0;
        for(int i = 0; i<=aString.length()-1;i++){
            String bString = aString.substring(i,i+1);
            if(bString.equals(" "))
                num++;
        }
        return num;
    }


}
