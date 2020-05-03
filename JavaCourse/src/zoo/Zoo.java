package zoo;

public class Zoo {
    public static void main(String[] args) {
        Dog dog = new Dog("negro", 1);
        Cat cat = new Cat("amarillo", 10);

        System.out.println("Caracteristicas del perro");
        System.out.println(dog.getAge());
        System.out.println(dog.getColor());
        System.out.println(dog.bark());

        System.out.println("Caracteristicas del gato");
        System.out.println(cat.getAge());
        System.out.println(cat.getColor());
        System.out.println(cat.meow());
    }
}
