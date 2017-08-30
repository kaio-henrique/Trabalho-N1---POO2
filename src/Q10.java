import java.util.Scanner;

public class Q10 {

	public static void main(String[] args) {
		int vl;
	       
	    Scanner in = new Scanner(System.in);
	    
	    System.out.println("Digite um número:");
	   	vl = in.nextInt();
	   	
	   	if(vl > 10) {	    
	   		System.out.println("O número escolhido: " + vl + " é MAIOR que 10");
	   	}else {
	   		System.out.println("O número escolhido: " + vl + " NÃO é MAIOR que 10");
	   	}
	}

}
