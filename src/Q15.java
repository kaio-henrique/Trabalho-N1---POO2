import java.util.Scanner;

public class Q15 {

	public static void main(String[] args) {
		int n1, n2, n3;
	       
	    Scanner in = new Scanner(System.in);
	    
	    System.out.println("Digite o 1º valor: ");
	    n1 = in.nextInt();
	    
	    System.out.println("Digite o 2º valor: ");
	    n2 = in.nextInt();
	    
	    System.out.println("Digite o 3º valor: ");
	    n3 = in.nextInt();
	    
	   	if(n1 >= n2 && n1 >= n3) {
	   		System.out.println("Maior valor " + n1);
	   	}
	   	else if(n2 >= n1 && n2 >= n3) {
	   		System.out.println("Maior valor " + n2);
	   	}
	   	else {
	   		System.out.println("Maior valor " + n3);
	   	}
	}

}
