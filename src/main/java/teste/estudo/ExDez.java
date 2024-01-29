package teste.estudo;
import java.util.Scanner;

public class ExDez {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        float grausCelsius, grausFarenheit;
        System.out.print("Informe a temperatura em Celsius para ser convertido em Farenheit: ");
        grausCelsius = ler.nextFloat();
        grausFarenheit = (grausCelsius * 9/5) + 32;
        System.out.print(grausCelsius + "C Em Farenheit fica "+ grausFarenheit + "F");
    }
}
