package person;

public class PersonProgram {
    public static void main(String arg[]){
        Person person = new Person("Juan","12236547",50);
        person.addCompanyName("X");
        person.addCompanyName("Y");
        person.addCompanyName("Company1");

        System.out.println("Informe sobre la persona " + person.getName());
        person.showWorkingAge();
        System.out.println("Cantidad de empresas donde ha trabajado " + person.getCompanyListCount());
        person.showCompanyList();
    }
}
