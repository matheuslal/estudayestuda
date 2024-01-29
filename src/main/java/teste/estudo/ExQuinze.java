package teste.estudo;

import java.util.Scanner;

public class ExQuinze {
    public static void main(String [] args){
        Scanner leia = new Scanner(System.in);
        System.out.print("Informe as suas horas trabalhadas no mês: ");
        double horasTrabalhadasMes = leia.nextDouble();
        System.out.print("Informe quanto ganha por hora no trabalho: ");
        double valorHoraTrabalhada = leia.nextDouble();

        double salarioBruto = valorHoraTrabalhada * horasTrabalhadasMes;
        double IR = (salarioBruto/100) * 11;
        double INSS = (salarioBruto/100) * 8;
        double sindicato = (salarioBruto/100) * 5;
        double descontos = IR + INSS + sindicato;
        double salarioLiquido = salarioBruto - descontos;

        System.out.println("Salário bruto: R$ " + salarioBruto);
        System.out.println("IR: R$ " + IR);
        System.out.println("INSS: R$ " + INSS);
        System.out.println("Sindicato: R$ " + sindicato);
        System.out.println("Descontos: R$ " + descontos);
        System.out.println("Salário líquido: R$ " + salarioLiquido);
    }
}
