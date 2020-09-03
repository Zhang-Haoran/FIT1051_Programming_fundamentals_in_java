public class Person {
    private int age;
    private double height;
    private boolean isStudent;
    private String name;



    //mutator
    public void setAge(int newAge) {          //header of method
        if (newAge >= 0 && newAge <= 120) {    //body of method
            age = newAge;
        }
    }

    public void setHeight(double newHeight) {
        if (newHeight >= 0.5 && newHeight <= 3.0) {
            height = newHeight;
        }
    }
    public void setIsStudent(boolean newIsStudent){
        isStudent = newIsStudent;
    }



    public void setName(String myString){
        if(myString.length()>=1 && myString.length()<=20)
        name = myString;
    }

    //accessor
    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public String getName(){
        return name;
    }
    //other
    public void birthday(){
        setAge(getAge()+1);
    }
}