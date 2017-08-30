import java.util.Scanner;

public class Q14 {

	public static void main(String[] args) {
		double vl;
	       
	    Scanner in = new Scanner(System.in);
	    
	    System.out.println("Digite um valor: ");
	    vl = in.nextDouble();
	    
	   	if(vl > 0) {
	   		System.out.println("Número POSITIVO");
	   	}
	   	else if(vl < 0) {
	   		System.out.println("Número NEGATIVO");
	   	}
	   	else {
	   		System.out.println("Número ZERO");
	   	}
	}

}
