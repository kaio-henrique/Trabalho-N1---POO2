import java.util.Scanner;

public class Q09 {

	public static void main(String[] args) {
		int nt_01;
	    int nt_02;
	    int nt_03;
	    int media;
	       
	    Scanner in = new Scanner(System.in);
	    
	    System.out.println("Digite 1º nota");
	   	nt_01 = in.nextInt();
	   	
	   	System.out.println("Digite 2º nota");
	   	nt_02 = in.nextInt();
	   	
	   	System.out.println("Digite 3º nota");
	   	nt_03 = in.nextInt();
	    
	    media = ((nt_01 * 2) + (nt_02 * 3) + (nt_03 * 5)) / 10;
	    
	    System.out.println("A média final do aluno é " + media);

	}

}
