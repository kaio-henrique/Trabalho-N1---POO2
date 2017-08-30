import java.util.Scanner;

public class Q11 {

	public static void main(String[] args) {
		int vl;
	       
	    Scanner in = new Scanner(System.in);
	    
	    System.out.println("Digite um número:");
	   	vl = in.nextInt();
	   	
	   	if(vl >= 0) {
	    
	   		System.out.println("O número escolhido: " + vl + " é POSITIVO");
	   	}else {
	   		System.out.println("O número escolhido: " + vl + " é NEGATIVO");
	   	}
	}

}
