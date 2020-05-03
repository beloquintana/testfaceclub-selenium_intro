package zoo;

public class Cat extends Animal {

    public Cat(String color, int age){
        super(color, age);
    }

    //maullar
    public String meow(){
        return "miau";
    }

    @Override
    public void run(int meters){
        int maxMeters = 100;
        if(meters < maxMeters)
            System.out.println("OK");
        else
            System.out.println("El gato no tiene suficiente resistencia para correr mas de "
                    + maxMeters + " metros");
    }


}
