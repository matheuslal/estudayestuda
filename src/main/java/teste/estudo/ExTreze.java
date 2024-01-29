package teste.estudo;
import java.util.Objects;
import java.util.Scanner;
public class ExTreze {
    public static void main(String [] args){
        Scanner leia = new Scanner(System.in);
        double altura, pesoIdeal;
        String sexo;
        System.out.print("Informe a sua altura: ");
        altura = leia.nextDouble();
        System.out.print("Informe seu sexo (apenas M ou F): ");
        sexo = leia.next();

        if(Objects.equals(sexo, "M")){
            pesoIdeal = 72.7 * altura -58;
            System.out.print("o seu peso ideal é: " + pesoIdeal + " kg");
        } else if (Objects.equals(sexo, "F")) {
            pesoIdeal = 62.1 * altura - 44.7;
            System.out.print("o seu peso ideal é: " + pesoIdeal + " kg");
        }
        else{
            System.out.print("Por favor, escolha o sexo correto!");
        }
    }
}
