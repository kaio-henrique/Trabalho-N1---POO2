import java.util.Scanner;

public class Q13 {

	public static void main(String[] args) {
		double sal_fixo;
		double vl_vendas;
		double soma1;
		double soma2;
	       
	    Scanner in = new Scanner(System.in);
	    
	    System.out.println("Digite o salário fixo: ");
	    sal_fixo = in.nextInt();
	    
	    System.out.println("Digite o valor das vendas: ");
	    vl_vendas = in.nextInt();
	    
	    soma1 = (sal_fixo * 3) / 100;
	    soma2 = (sal_fixo * 5) / 100;
	    
	   	if(vl_vendas <= 1500) {
	   		System.out.println("O valor do salário é: R$" + sal_fixo + " o acrescimo de 3% é R$" + (sal_fixo + soma1));
	   	}else {
	   		System.out.println("O valor do salário é: R$" + sal_fixo + " o acrescimo de 3% mais 5% por ultrapassar o valor, é R$" + (sal_fixo + soma2));
	   	}
	}

}
