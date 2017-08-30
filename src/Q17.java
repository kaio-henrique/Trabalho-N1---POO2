import java.util.Scanner;

public class Q17 {

	public static void main(String[] args) {
	
	Scanner in = new Scanner(System.in);
        int v1,v2,v3;

	System.out.println("Digite os valores para cada \nlado do triângulo respectivamente: ");
	v1 = in.nextInt();
	v2 = in.nextInt();
	v3 = in.nextInt();

	if(v1 + v2 > v3 && v1 + v3 > v2 && v2 + v3 > v1){
	    System.out.println("É um triângulo");
	}else{
	    System.out.println("Não é um triângulo");	
	}


	}

}
