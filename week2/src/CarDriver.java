public class CarDriver {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.setDoor(2);
        c1.setIsElectric(true);

        System.out.println("the car has "+c1.getDoor()+" doors");
        if(c1.getIsElectric() == true){
            System.out.println("the car is electric");
        }
        else{
            System.out.println("the car is not electric");
        }
    }
}