package ContaBanco;
import java.util.Scanner;

public class ContaTerminal {

    public static void limpaTela() {
    System.out.print("\033[H\033[2J");
    //comando para limpar tela (utiliza ANSI)
    System.out.flush();
    }

public static void main(String[] args)  {
Scanner sc = new Scanner(System.in);


System.out.println("SEJA BEM-VINDO AO BANCO JAVA!");
System.out.println("-----------------------------");


System.out.println("Insira seu nome: ");
    String name = sc.nextLine();
    limpaTela();

System.out.println("Olá " + name + ", por favor informe sua Agência:");
    String agencia = sc.nextLine();

System.out.println("Qual o número da conta?");
    int conta = sc.nextInt();

System.out.println("Qual o saldo disponível?");
    double saldo = sc.nextDouble();
    limpaTela();
    
    
System.out.println("Olá " + name + ", obrigado por criar uma conta em nosso banco, \n sua agência é: " + agencia +"\n conta: " + conta + "\n seu saldo é: " +saldo+" e já está disponível para saque.");
















    }
}

