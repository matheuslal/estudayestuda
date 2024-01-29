package teste.estudo;
import java.util.Scanner;
public class ExQuatorze {
    public static void main(String [] args){
        Scanner leia = new Scanner(System.in);
        double pesoPeixe, pesoExcesso, multaPorKgExcedente;
        System.out.print("Informe o peso do peixe: ");
        pesoPeixe = leia.nextDouble();
        if (pesoPeixe > 50){
          pesoExcesso = pesoPeixe - 50;
          multaPorKgExcedente = pesoExcesso * 4;
          System.out.print("O peso em excesso é de " + pesoExcesso + " e a multa que deverá ser paga é de R$: "+ multaPorKgExcedente);
        } else{
            System.out.print("Não há peso em excesso e consequentemente não há multa.");
        }
    }
}
