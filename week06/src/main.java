public class main {
    public static void main(String[] args) {
        int sum = 0;
        int count = 0;
        while(sum<1000){
            count++;
            sum += count;


            System.out.println(count);
            System.out.println(sum);
        }
        System.out.println(count);
    }
}
