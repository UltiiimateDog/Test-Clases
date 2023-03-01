package parcial_2;

import java.util.Random;
import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
        Random rand = new Random();
        String[] nombres = {"Jose", "Marco", "Alan", "Ian", "Maria", "Elizabeth", "Casie", "Juan", "Pedro", "Natalia", "Camila", "Concepcion"};
        Persona[] people = new Persona[10];
        people[0] = new Persona(null, false, false, false, false,0);
        people[1] = new Persona(null, false, false, false, false,1);
        people[2] = new Persona(null, false, false, false, false,2);
        people[3] = new Persona(null, false, false, false, false,3);
        people[4] = new Persona(null, false, false, false, false,4);
        people[5] = new Persona(null, false, false, false, false,5);
        people[6] = new Persona(null, false, false, false, false,6);
        people[7] = new Persona(null, false, false, false, false,7);
        people[8] = new Persona(null, false, false, false, false,8);
        people[9] = new Persona(null, false, false, false, false,9);
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
        int cont = 0;
        boolean all_different = false;
        while(all_different == false && cont < 5)   {
            for (int i = 0; i < 10; i++)    {
                all_different = true;
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
                        else {
                            people[i].set_Gender(false);
                        }
                        if (rand.nextInt(2)==0) {
                            people[i].set_Age(true);
                        }
                        else {
                            people[i].set_Age(false);
                        }
                        if (rand.nextInt(2)==0) {
                            people[i].set_State(true);
                        }
                        else {
                            people[i].set_State(false);
                        }
                        if (rand.nextInt(2)==0) {
                            people[i].set_Health(true);
                        }
                        else {
                            people[i].set_Health(false);
                        }
                        all_different = false;
                        cont++;
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

        int elegido = rand.nextInt(10);
        int select;
        int preguntas = 0;
        boolean[] pool = {true,true,true,true,true,true,true,true,true,true};
        Scanner scan = new Scanner(System.in);
        boolean uno=true;
        boolean dos=true;
        boolean tres=true;
        boolean cuatro=true;

        while(preguntas < 3)  {
            do  {
                System.out.println("\nSeleccione su pregunta.");
                if(uno) {
                    System.out.println("1) Es hombre");
                }
                if(dos) {
                    System.out.println("2) Es mayor de edad");
                }
                if(tres) {
                    System.out.println("3) Esta vivo");
                }
                if(cuatro) {
                    System.out.println("4) Esta enfermo");
                }
                select = scan.nextInt();
                } while(select < 1 || select > 4);
            switch (select) {
                case 1:
                    uno = false;
                    preguntas++;
                    for(int i = 0; i < 10; i++) {
                        if(people[elegido].get_GenderN() != people[i].get_GenderN())    {
                            pool[i] = false;
                        }
                    }
                    people[elegido].get_Gender();
                    break;
                case 2:
                    dos = false;
                    preguntas++;
                    for(int i = 0; i < 10; i++) {
                        if(people[elegido].get_AgeN() != people[i].get_AgeN())    {
                            pool[i] = false;
                        }
                    }
                    people[elegido].get_Age();
                    break;
                case 3:
                    tres = false;
                    preguntas++;
                    for(int i = 0; i < 10; i++) {
                        if(people[elegido].get_StateN() != people[i].get_StateN())    {
                            pool[i] = false;
                        }
                    }
                    people[elegido].get_State();
                    break;
                case 4:
                    cuatro = false;
                    preguntas++;
                    for(int i = 0; i < 10; i++) {
                        if(people[elegido].get_HealthN() != people[i].get_HealthN())    {
                            pool[i] = false;
                        }
                    }
                    people[elegido].get_Health();
                    break;
                default:
                    break;
            }
        }
        for(int i = 0; i < 10; i++) {
            if(pool[i]) {
                people[i].get_Information();
            }
        }
        System.out.println("Seleccione al sujeto");
        for (int i = 0; i < 10; i++)    {
            if(pool[i]) {
                System.out.println(i);
            }
        }
        select = scan.nextInt();  
        if(people[elegido].get_number() == people[select].get_number())   {
            System.out.println("Ganaste");
        }
        else {
            System.out.println("Perdiste");
        }
    }
}
