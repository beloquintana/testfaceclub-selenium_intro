package zoo;

public class Dog extends Animal{

    public Dog(String color, int age){
        super(color, age);
    }

    //ladrar
    public String bark(){
        return "jau";
    }
}
