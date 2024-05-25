import java.util.Scanner;

public class Contador{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Digite o primeiro valor: ");
		int num1 = scan.nextInt(); 
		System.out.print("Digite o segundo valor: ");
		int num2 = scan.nextInt();
		
		try{
			contar(num1, num2);
		}catch(ParametrosInvalidosException e){
			e.printStackTrace();
		}
		
		scan.close();

	}
	public static void contar(int num1, int num2) throws ParametrosInvalidosException{
		if(num1 > num2){
			throw new ParametrosInvalidosException();
		}

		int contagem = num2 - num1;

		for(int i=0; i<contagem; i++){
			System.out.println("Imprimindo o número " + (i+1));
		}
	} 

}

