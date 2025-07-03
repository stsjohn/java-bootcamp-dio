import java.util.Scanner;
    public class Contas {
        public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int A, B, PROD;
		System.out.println("Insira o primeiro valor: ");
		A = sc.nextInt();
        System.out.println("Insira o segundo valor: ");
		B = sc.nextInt();
		
		PROD = (A*B);
        
		System.out.println("PROD = " + PROD );
        System.out.println("Esse é o resultado");
        sc.close();
	}
}

