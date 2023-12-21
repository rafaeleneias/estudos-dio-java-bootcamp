import java.util.Scanner;

public class CaixaEletronico {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        double saldo;
        double ValorSolicitado;

        saldo = 1000;
        System.out.print("Digite o valor a ser sacado: ");
        ValorSolicitado = sc.nextDouble();
        if(ValorSolicitado > saldo){
            System.out.println("Saldo insuficiente!");
        } else{
            saldo = saldo - ValorSolicitado;
            System.out.println("Valor sacado!");
        }
        System.out.println("Saldo atual da conta: " + saldo);
        sc.close();

    }
}
