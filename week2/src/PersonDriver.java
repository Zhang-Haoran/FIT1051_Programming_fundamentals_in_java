public class PersonDriver {
    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person();
        p1.setAge(11);
        p2.setAge(22);

        System.out.println("the age of p1 is "+ p1.getAge());
    }
}
