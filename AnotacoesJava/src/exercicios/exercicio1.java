package exercicios;
import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);     
    System.out.println("-----------------------------");
    System.out.println("Sistema de direção");
    System.out.println("-----------------------------");
    System.out.print("Digite o seu nome: ");
    String nome = sc.nextLine();
    System.out.print("Digite o seu sobrenome: ");
    String sobrenome = sc.nextLine();
    System.out.print("Digite a sua idade: ");
    int idade = sc.nextInt();
    boolean podeDirigir = idade >=18;
    if(podeDirigir){
        System.out.println("Você está apto a dirigir!");
    } else{
        System.out.println("Você não está apto a dirigir!");
    }
    System.out.println("-----------------------------");
    sc.close();

    }
}
