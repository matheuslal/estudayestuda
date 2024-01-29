package teste.estudo;
import java.util.Scanner;

public class ExOnze {
    public static void main(String[] args){
     Scanner ler = new Scanner(System.in);
     float numeroReal, a, b, c, numeroUmInt, numeroDoisInt;
     System.out.print("Informe um número inteiro:");
     numeroUmInt = ler.nextFloat();
     System.out.print("Informe outro número inteiro: ");
     numeroDoisInt = ler.nextFloat();
     System.out.print("Infomre um número real: ");
     numeroReal = ler.nextFloat();

     a = (2 * numeroUmInt) + (numeroDoisInt/2);
     b = 3 * numeroUmInt + numeroReal;
     c = (float) Math.pow(numeroReal,2);
     System.out.print("O resultado da A: " + a +" O resultado da B: "+ b +" O resultado da C: "+ c);
    }
}
