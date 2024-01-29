package teste.estudo;
import java.util.Scanner;

public class ExNove {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        float grausFarnheit, grausCelsius;
        System.out.print("Informe o grau Farenheit a ser convertido para Celsius: ");
        grausFarnheit = ler.nextFloat();
        grausCelsius = (5 * (grausFarnheit-32)/9);
        System.out.print("a conversão foi realizada e " + grausFarnheit + " F em Celsius ficou " + grausCelsius +" C");
    }
}
