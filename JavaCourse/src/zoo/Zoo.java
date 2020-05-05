package zoo;

public class Zoo {
    public static void main(String[] args) {
        Animal dog = new Dog("negro", 1);
        Animal cat = new Cat("amarillo", 10);

        System.out.println("Caracteristicas del perro");
        System.out.println(dog.getAge());
        System.out.println(dog.getColor());
        System.out.println(((Dog)dog).bark());
        dog.run(500);

        System.out.println("Caracteristicas del gato");
        System.out.println(cat.getAge());
        System.out.println(cat.getColor());
        System.out.println(((Cat)cat).meow());
        cat.run(500);
    }
}
