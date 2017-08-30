import java.util.Scanner;

public class Q04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int area, base, altura;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite respectivamente os valores para \nBASE e ALTURA para descobrir a area do Retangulo: ");
		
		base = in.nextInt();
		altura = in.nextInt();

		
		System.out.println("Area do Retangulo: " + base * altura);
	}

}
