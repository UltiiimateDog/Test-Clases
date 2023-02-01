package Parcial1;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
            try (Scanner scan = new Scanner(System.in)) {
                int select,select2;
                examen test = new examen();
                String frase;
                String ID;
                double id;
                while (true) {
                    System.out.println("Seleccione que quiere crear:");
                    System.out.println("1::Cuadrado");
                    System.out.println("2::Circulo");
                    System.out.println("3::Examen");
                    System.out.println("4::Salir");
                    select = scan.nextInt();
                switch (select) {
                    case 1:
                        scan.nextLine();
                        System.out.println("Inserte el ID de su objeto");
                        ID = scan.nextLine();
                        id = Double.parseDouble(ID);
                        Cuadrado object = new Cuadrado(id);
                        do {
                            System.out.println("Seleccione que quiere calcular");
                            System.out.println("1::Perimetro");
                            System.out.println("2::Area");
                            System.out.println("3::Diagonal");
                            select2 = scan.nextInt();
                        } while (select2 < 1 || select2 > 3);
                        switch (select2) {
                            case 1:
                                System.out.println("Perimetro = " + object.Perimetro());
                                break;
                            case 2:
                                System.out.println("Area = " + object.Area());
                                break;
                            case 3:
                                System.out.println("Diagonal = " + object.Diagonal());
                                break;
                        }
                        break;
                    case 2:
                        scan.nextLine();
                        System.out.println("Inserte el ID de su objeto");
                        ID = scan.nextLine();
                        id = Double.parseDouble(ID);
                        Circulo object2 = new Circulo(id);
                        do {
                            System.out.println("Seleccione que quiere calcular");
                            System.out.println("1::Perimetro");
                            System.out.println("2::Area");
                            select2 = scan.nextInt();
                        } while (select2 < 1 || select2 > 2);
                        switch (select2) {
                            case 1:
                                System.out.println("Perimetro = " + object2.Perimetro());
                                break;
                            case 2:
                                System.out.println("Area = " + object2.Area());
                                break;
                        }
                        break;
                    case 3:
                        scan.nextLine();
                        System.out.println("Inserte la frase a trabajar.");
                        frase = scan.nextLine();
                        do {
                        System.out.println("Seleccione que quiere hacer");
                        System.out.println("1::Primera Mayuscula");
                        System.out.println("2::Invertir Cadena");
                        System.out.println("3::Vocales con mayuscula");
                        System.out.println("4::FizzBuzz");
                        System.out.println("5::Palindromo");
                        select2 = scan.nextInt();
                        } while (select2 < 1 || select2 > 5);
                        switch (select2) {
                            case 1:
                                System.out.printf(test.primerMayuscula(frase) + "\n");
                                break;
                            case 2:
                                System.out.printf(test.invertirCadena(frase) + "\n");
                                break;
                            case 3:
                                System.out.printf(test.vocalesMayuscula(frase) + "\n");
                                break;
                            case 4:
                                test.FizzBuzz();
                                break;
                            case 5:
                                if (test.Palindromo(frase) == true)  {
                                    System.out.println("Es polindromo");
                                }
                                else {
                                    System.out.println("No es polindromo");
                                }
                                break;
                            }   
                        break;
                    case 4:
                        System.out.println("Saliendo...");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Opcion no valida.");
                        break;
                }
            }
            }
    }
}
