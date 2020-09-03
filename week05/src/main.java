public class main {
    public static void main(String[] args) {
        Person[] people = new Person[3];
        people[0] = new Person();
        people[1] = new Person();
        people[2] = new Person();
        people[1].setName("JJJJ");
        System.out.println(people[1].getName());
    }
}
