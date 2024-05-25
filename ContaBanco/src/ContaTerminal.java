import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.print("Informe seu nome: ");
        String nome = scan.nextLine();
        System.out.print("Informe sua agencia: ");
        String agencia = scan.nextLine();
        System.out.print("Informe o número: ");
        int numero = scan.nextInt();
        System.out.print("Informe seu saldo: ");
        double saldo = scan.nextDouble();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é "+ agencia + ", conta " + numero + " e seu saldo R$" + saldo + " já está disponível para saque.");
	
	scan.close();    
}
}
