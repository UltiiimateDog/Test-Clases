package Parcial1;

public class Cuadrado {
    public double lado;

    public Cuadrado(double lado)    {
        this.lado = lado;
    }
    public Cuadrado()  {
        this(177730);
    }
    public double Perimetro()   {
        return lado*4;
    }
    public double Area()   {
        return lado*lado;
    }
    public double Diagonal()   {
        return Math.sqrt(lado*lado*2);
    }
}

