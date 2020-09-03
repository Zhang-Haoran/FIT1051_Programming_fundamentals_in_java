public class ApplicationDriver {
    public static void main(String[] args) {
        Person tania = new Person();
        tania.setName("Haoran Zhang");
        System.out.println(tania.getName());
        tania.setAge(21);
        System.out.println("tania is "+ tania.getAge()+" years old");
    }
}
