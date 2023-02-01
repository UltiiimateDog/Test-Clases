package Parcial1;

public class examen {
   public String primerMayuscula(String Frase)  {
        char PrimerLetra = Frase.charAt(0);
        String PLetra = String.valueOf(PrimerLetra);
        PLetra = PLetra.toUpperCase();
        int largo = Frase.length();
        Frase = Frase.substring(1, largo);
        Frase = PLetra + Frase;
        return Frase;
   }
   public String invertirCadena(String Frase) {
        int largo = Frase.length();
        largo = largo - 1;
        String Invertido = "";
        char letra;
        String ltra;
        for (int i = largo; i >= 0; i--)  {
            letra = Frase.charAt(i);
            ltra = String.valueOf(letra);
            Invertido = Invertido + ltra;
        }
        return Invertido;
   }
   public String vocalesMayuscula(String Frase) {
        Frase = Frase.replace("a","A");
        Frase = Frase.replace("e","E");
        Frase = Frase.replace("i","I");
        Frase = Frase.replace("o","O");
        Frase = Frase.replace("u","U");
        return Frase;
   }
   void FizzBuzz(String Frase)     {
     int largo = Frase.length();
     for (int i = 1; i <= largo; i++)   {
          if (i % 3 == 0 && i % 5 == 0)     {
               System.out.println("FizzBuzz");
          }
          else if (i % 3 == 0)     {
               System.out.println("Fizz");
          }
          else if (i % 5 == 0)     {
               System.out.println("Buzz");
          }
     }
   }
   Boolean Palindromo(String Frase)     {
     Frase = Frase.replace(" ", "");
     Frase = Frase.toLowerCase();
     String Invertido = this.invertirCadena(Frase);
     if ( Frase.equals(Invertido)) {
          return true;
     }
     else {
          return false;
     }
   }

}
