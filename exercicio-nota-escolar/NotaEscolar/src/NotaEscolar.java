import java.util.Scanner;

public class NotaEscolar {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        String aluno;
        double nota1,nota2,NotaTotal;

        System.out.print("Digite o nome do aluno: ");
        aluno = sc.nextLine();
        System.out.print("Digite a primeira nota: ");
        nota1 = sc.nextDouble();
        System.out.print("Digite a segunda nota: ");
        nota2 = sc.nextDouble();
        NotaTotal = nota1 + nota2 / 2;
        
        if(NotaTotal >=6){
            System.out.println("Notal total: " + NotaTotal);
            System.out.println("Aluno aprovado!");
        } else{
            System.out.println("Notal total: " + NotaTotal);
            System.out.println("Aluno reprovado!");
        }
        sc.close();
    }
}
