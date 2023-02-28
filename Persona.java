package parcial_2;

public class Persona extends Humano {

    public Persona(String name, boolean male, boolean adult, boolean alive, boolean illness)    {
        super(name, male, adult, alive, illness);
    }

    public void get_Information()   {
        String name = get_Name();
        System.out.println("Nombre: " + name);
        System.out.print("Genero: ");
        get_Gender();
        System.out.print("Edad: ");
        get_Age();
        System.out.print("Estado: ");
        get_State();
        System.out.print("Salud: ");
        get_Health();
    }
}
