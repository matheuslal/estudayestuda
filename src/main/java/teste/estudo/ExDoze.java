package teste.estudo;

import java.util.Scanner;

public class ExDoze {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
         double peso, altura;
        System.out.print("informe sua altura para calcular seu peso ideal: ");
         altura = ler.nextDouble();
         peso = 72.2 * altura - 58;
         System.out.print("O seu peso ideal para sua altura é: " + peso + " kg");
    }
}
