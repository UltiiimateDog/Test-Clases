package Parcial1;

public class Circulo {
    public double radio;

    public Circulo(double radio)    {
        this.radio = radio;
    }
    public Circulo()    {
        this(177730);
    }
    public double Perimetro()   {
        return radio*2*Math.PI;
    }
    public double Area()   {
        return radio*radio*Math.PI;
    }
}
