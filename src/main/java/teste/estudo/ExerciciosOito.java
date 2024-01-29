package teste.estudo;

import java.util.Scanner;

public class ExerciciosOito {

    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        double salarioPorHora, salarioFinal, horasTrabalhadasMes;
        System.out.print("Quanto você ganha por hora? ");
        salarioPorHora = ler.nextDouble();
        System.out.print("Informe as horas trabalhadas por mes: ");
        horasTrabalhadasMes = ler.nextDouble();
        salarioFinal = salarioPorHora * horasTrabalhadasMes;
        System.out.print("O valor do salário final é de R$: "+ salarioFinal);

    }
}
