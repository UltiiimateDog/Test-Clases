package Parcial1;

public class Circulo {
    public double radio;
    public double diametro;
    public double perimetro;
    public double area;

    public Circulo(double ID)    {
        this.radio = ID;
    }
    public double GetDiametro() {
        this.diametro = 2 * radio;
        return diametro;
    }
    public double GetPerimetro() {
        this.diametro = GetDiametro();
        this.perimetro = diametro * 3.1416;;
        return perimetro;
    }
    public double GetArea() {
        this.area = radio * radio * 3.1416;
        return area;
    }
    public void GetCaracteristicas()    {
        this.perimetro = GetPerimetro();
        this.area = GetArea();
        System.out.println("ID: " + radio);
        System.out.println("Radio: " + radio);
        System.out.println("Diametro: " + diametro);
        System.out.println("Perimetro: " + perimetro);
        System.out.println("Area: " + area);
    }
}
