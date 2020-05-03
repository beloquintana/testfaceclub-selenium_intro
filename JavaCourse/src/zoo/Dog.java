package zoo;

public class Dog extends Animal{

    public Dog(String color, int age){
        super(color, age);
    }

    @Override
    public void run(int meters) {

    }

    //ladrar
    public String bark(){
        return "jau";
    }
}
