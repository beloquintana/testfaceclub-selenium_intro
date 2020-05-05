package zoo;

public class Dog extends Animal{

    public Dog(String color, int age){
        super(color, age);
    }

    @Override
    public void run(int meters) {
        int maxMeters = 1000;
        if(meters < maxMeters)
            System.out.println("OK");
        else
            System.out.println("El perro no tiene suficiente resistencia para correr mas de "
                    + maxMeters + " metros");
    }

    //ladrar
    public String bark(){
        return "jau";
    }
}
