import java.util.Scanner;

public class Q12 {

	public static void main(String[] args) {
		int num_macas;
		double vl_1 = 1.3;
		double vl_2 = 1;
	       
	    Scanner in = new Scanner(System.in);
	    
	    System.out.println("Digite o número de maças desejado: ");
	    num_macas = in.nextInt();
	   	
	   	if(num_macas >= 12) {
	    
	   		System.out.println("O valor será: R$" + (num_macas * vl_2 ));
	   	}else {
	   		System.out.println("O valor será: R$" + (num_macas * vl_1));
	   	}
	}

}
