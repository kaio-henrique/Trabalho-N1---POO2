import java.util.Scanner;

public class Q05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		int ageInDays, days, months, years;
		
		System.out.println("Digite sua idade em anos: ");
		years = in.nextInt();
		
		System.out.println("Digite sua idade em meses: ");
		months = in.nextInt();
		
		System.out.println("Digite sua idade em dias: ");
		days = in.nextInt();
		
		ageInDays = days + years*365 + months*30;
		
		System.out.println("Sua idade em dias: " + ageInDays);
		
		
		
		

	}

}
