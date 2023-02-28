package parcial_2;

import java.util.Random;

public class test3 {
    public static void main(String[] args) {
        Random rand = new Random();
        String[] nombres = {"Jose", "Marco", "Alan", "Ian", "Maria", "Elizabeth", "Casie", "Juan", "Pedro", "Natalia", "Camila", "Concepcion"};
        Humano[] people = new Persona[10];
        people[0] = new Persona(null, false, false, false, false);
        people[1] = new Persona(null, false, false, false, false);
        people[2] = new Persona(null, false, false, false, false);
        people[3] = new Persona(null, false, false, false, false);
        people[4] = new Persona(null, false, false, false, false);
        people[5] = new Persona(null, false, false, false, false);
        people[6] = new Persona(null, false, false, false, false);
        people[7] = new Persona(null, false, false, false, false);
        people[8] = new Persona(null, false, false, false, false);
        people[9] = new Persona(null, false, false, false, false);
        for (int i = 0; i < 10; i++)    {
            people[i].set_Name(nombres[rand.nextInt(12)]);
            if (rand.nextInt(2)==0) {
                people[i].set_Gender(true);
            }
            if (rand.nextInt(2)==0) {
                people[i].set_Age(true);
            }
            if (rand.nextInt(2)==0) {
                people[i].set_State(true);
            }
            if (rand.nextInt(2)==0) {
                people[i].set_Health(true);
            }
        }
        boolean equal = false;
        for (int i = 0; i < 10; i++)    {
            for (int k = 0; k < 10; k++)    {
                equal = true;
                if(people[i].get_AgeN() != people[k].get_AgeN())    {
                    equal = false;
                }
                else if(people[i].get_GenderN() != people[k].get_GenderN())    {
                    equal = false;
                }
                else if(people[i].get_HealthN() != people[k].get_HealthN())    {
                    equal = false;
                }
                else if(people[i].get_StateN() != people[k].get_StateN())    {
                    equal = false;
                }
                if (equal)  {
                    if (rand.nextInt(2)==0) {
                        people[i].set_Gender(true);
                    }
                    if (rand.nextInt(2)==0) {
                        people[i].set_Age(true);
                    }
                    if (rand.nextInt(2)==0) {
                        people[i].set_State(true);
                    }
                    if (rand.nextInt(2)==0) {
                        people[i].set_Health(true);
                    }
                }
            }
        }

        int contHombre = 0;
        int contEdad = 0;
        int contVivo = 0;
        int contEnfermo = 0;

        for(int i = 0; i < 10; i++) {
            if(people[i].get_GenderN()) {
                contHombre++;
            }
            if(people[i].get_AgeN()) {
                contEdad++;
            }
            if(people[i].get_StateN()) {
                contVivo++;
            }
            if(people[i].get_HealthN()) {
                contEnfermo++;
            }
        }

        for (int i = 0; i < 10; i++)    {
            people[i].get_Information();
            System.out.println("");
        }
        System.out.println("Hombres: " + contHombre);
        System.out.println("Mayores de edad: " + contEdad);
        System.out.println("Vivos: " + contVivo);
        System.out.println("Enfermos: " + contEnfermo);
    }
}
