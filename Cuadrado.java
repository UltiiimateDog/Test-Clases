package Parcial1;

public class Cuadrado {
    public double lado;
    public double perimetro;
    public double diagonal;
    public double area;

    public Cuadrado(double ID)    {
        this.lado = ID;
    }
    public double GetPerimetro()    {
        this.perimetro = 4 * lado;
        return perimetro;
    }
    public double GetArea()    {
        this.area = lado * lado;
        return area;
    }
    public double GetDiagonal()    {
        this.diagonal = Math.sqrt(lado * lado * 2);
        return diagonal;
    }
    public void GetCaracteristicas()    {
        this.perimetro = GetPerimetro();
        this.area = GetArea();
        this.diagonal = GetDiagonal();
        System.out.println("ID: " + lado);
        System.out.println("Lado: " + lado);
        System.out.println("Perimetro: " + perimetro);
        System.out.println("Area: " + area);
        System.out.println("Diagonal: " + diagonal);
    }
}

