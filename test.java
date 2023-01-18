package Parcial1;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Inserte el tamaño del lado del cuadrado y el circulo.");
            double ID = scan.nextDouble();
            Cuadrado test= new Cuadrado(ID);
            Circulo test2 = new Circulo(ID);
            System.out.println("Cuadrado:");
            test.GetCaracteristicas();
            System.out.println("Circulo:");
            test2.GetCaracteristicas();
        }
    }
}
