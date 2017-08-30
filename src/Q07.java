import java.util.Scanner;

public class Q07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        
        double salAtual, salNovo;
        int reajuste;

        System.out.print("Digite o Salario Atual: ");
        salAtual = in.nextDouble();
    
        System.out.print("Digite o a porcentagem do Reajuste: ");
        reajuste = in.nextInt();

        salNovo = salAtual + salAtual*reajuste/100;

        System.out.print("Salario com o Reajuste de " + reajuste + "% :" + salNovo);






        	
		
		

	}

}
