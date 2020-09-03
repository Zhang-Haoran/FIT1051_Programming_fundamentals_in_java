package inheritancePlus;

public class notes {
    Window myWindow;
    //B1
    public void B1() {
        int decisionCode = 1;
        String decision;
        if (decisionCode == 1) {
            decision = "yes";
        } else if (decisionCode == 2) {
            decision = "no";
        } else if (decisionCode == 3) {
            decision = " undecided";
        } else
            decision = "error";
        myWindow.writeOutLine("decision Code :"+ decisionCode +"\n" +"decision:"+decision);
    }
    //B2
    public void B2(){
        int i=0;
        int val = 0;
        int oddCounter = 0;
        int evenCounter = 0;
        int[] a = {1,2,3,4,5};
        if(a.length != 0){
            i = 0;
            val = a[i];
            while (val >0 && i <=a.length-1){
                if(val % 2 == 0){
                    evenCounter++;
                }
                else if(val%2 ==1){
                    oddCounter++;
                }
                i++;
                if(i<=a.length-1) val = a[i];
            }
            myWindow.writeOutLine("num of even :" +evenCounter);
            myWindow.writeOutLine("num of odd :"+ oddCounter);
        }
        else {
            myWindow.writeOutLine("empty array");

        }
    }
    //B3
    public void B3(){
        String input = "radar";
        String reverse ="";
        for(int i = input.length()-1; i>=0;i--){
            reverse += input.substring(i,i+1);

        }
        if(input.equals(reverse)){
            myWindow.writeOutLine("input is a palindrome");
        }
        else {
            myWindow.writeOutLine("not a palindrome");
        }
    }
    //C1
    private int CharacterOnly(String s){
        int count = 0;
        for(int i = 0; i<=s.length()-1;i++){
            if(!s.substring(i,i+1).equals(" ")){
                count++;
            }
        }
        return count;
    }
    //C2
    private String[] compareStrings(String s1, String s2){
        int max = Math.max(s1.length(),s2.length());
        int min = Math.min(s1.length(),s2.length());
        String[] a = new String[max];
//        for(int i = 0; i<=max-1;i++){
//            a[i] ="!";
//        }
//        for(int i =0; i<=min-1;i++){
//            if(s1.substring(i,i+1).equals(s2.substring(i,i+1))){
//                a[i] = s1.substring(i,i+1);
//            }
//        }
        for(int i =0;i<= a.length-1;i++){
            if (i<= min-1){
                if (s1.substring(i,i+i).equals(s2.substring(i,i+1))){
                    a[i] = s1.substring(i,i+1);
                }
                else {
                    a[i] = "!";
                }
            }

            else {
                a[i] ="!";
            }
        }
        return a;
    }
    //D1
    public class Character{
        public static final int MIN_HEALTH =0, MAX_HEALTH =10;
        private String name;
        private int health;
        private boolean alive;
        private Weapon aWeapon;
    }
    //D2
    public String getName(){
        return name;
    }
    //D3
    public boolean setHealth(int newHealth){
        boolean ok = false;
        if (newHealth >=MIN_HEALTH && newHealth <= MAX_HEALTH){
            health = newHealth;
            ok = true;
        }
        return ok;
    }
    //D4
    public Character(String initName, Weapon initWeapon){
        setName(initName);
        setWeapon(initWeapon);
        setAlive(true);
        setHealth(MAX_HEALTH);

    }
    //D5
    public String toString(){
        String retVal ="";
        retVal +="Name:"+name+"\n";
        retVal +="Health:"+health+"\n";
        retVal +="Alive:"+alive+"\n";
        retVal +="Weapon:"+aWeapon.toString()+"\n";
        retVal +="\n";
        return retVal;
    }
    //D6
    public boolean healthUp(){
        boolean ok = false;
        ok = setHealth(getHealth()+1);
        return ok;
    }
    //D7
    public void Driver(){
        Weapon w = new Weapon();
        Character c = new Character("test",w);
        c.setAlive = true;
        c.setHealth(5);

        c.setHealth(1);
        for(int i =1;i<=5;i++){
            c.healthUp();
        }
        myWindow.writeOutLine(c.toString());
    }
    //E1
    public class CharacterAndAIs extends Character{
        private AI[] ais;
        public CharacterAndAIs(String initName,Weapon initWeapon){
            super(initName,initWeapon);
            setHealth(MAX_HEALTH);
            setAlive(true);
            ais = new AI[5];
            for (int i =0; i<= ais.length-1;i++){
                ais[i] = new AI();
            }
        }
        public void addAI(AI aiToAdd){
            int i = 0;
            ref = ais[i];
            while(ais[i]!=null && i <=ais.length-1){
                i++;
                ref=a[i];
            }
            if(i<ais.length-1){
                ais[i] =aiToAdd;
            }

//            boolean successs = false;
//            int i =0;
//            while(!successs && i<= ais.length-1){
//                if(ais[i]==null){
//                    ais[i]=aiToAdd;
//                    successs =true;
//                }
//                i++;
//            }
//            return;successs

        }
    }
}
/*
A1(a):close off the data, everything can not touch the shell directly
visiablility(private, public), class structure
(b) produce the area programming focus on

A2(a):public static final int NUMBER_OF_FLOORS =32;
(b)at the top of the class and outside any other methods

A3:the scope is entire class
method they are in, execute time when they born
local var has the same name with outside var,so we use .this

A4:in the stack
has a array with 100 member,every single one is null,
but all of them point to the same object

A5:they don't take care of invalid case
and every vaild case should be consider

A6: the first step: inner max(a,b) execute
    the second step: call the outer one

A8:one method while that method is executing , the calling method var is alive, but not access.

A9:

A10:ini the object class

A11:ini object
can never appear with a new word

A12:make a class, grab old class,can add new instance var or method.
maximum reuse
minimum  juplication code

A13:use super keyword to init the super class, otherwise, we use normally calling to make variable
some parameter can be init in the sub class, the other use super class

A14:have no parameter constructor, and can auto created by java

A15:
upcasting
select the method

A16:it's select a class, java do nothing

A17:just got body, and all the sub class should have the variable abstract class

 */
