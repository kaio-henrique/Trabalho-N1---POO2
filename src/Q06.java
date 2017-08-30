import java.util.Scanner;

public class Q06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numEleitores, brancos, nulos, validos;
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Digite o total de eleitores: ");
		numEleitores = in.nextInt();
		
		System.out.print("Qnts votos Brancos: ");
		brancos = in.nextInt();
		
		System.out.print("Qnts votos Nulos: ");
		nulos = in.nextInt();
		
		System.out.print("Qnts votos Validos: ");
		validos = in.nextInt();
		
		System.out.println("Porcentagem de votos em Branco = " + (brancos * numEleitores)/100 + "%");
		System.out.println("Porcentagem de votos Nulos = " + (nulos * numEleitores)/100 + "%");
		System.out.println("Porcentagem de votos Validos = " + (validos * numEleitores)/100 + "%");
		

	}

}
