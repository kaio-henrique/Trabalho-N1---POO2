import java.util.Scanner;

public class Q18 {

	public static void main(String[] args) {
	
	Scanner in = new Scanner(System.in);
    String descProd;
    int qtd;
    double vlrUnit, total;

    System.out.print("Digite o nome do produto: ");
    descProd = in.next();

    System.out.print("Digite a quantidade a ser adquirida: ");
    qtd = in.nextInt();

    System.out.print("Digite o preço unitário:  ");
    vlrUnit = in.nextDouble();

    total = qtd * vlrUnit;

    if(qtd <= 5){
        System.out.print("Total com desconto de 2%: " + (total - (total * 0.02)));
    }

    if(qtd > 5 && qtd <= 10){
        System.out.print("Total com desconto de 2%: " + (total - (total * 0.03)));
    }

    if(qtd > 10){
        System.out.print("Total com desconto de 2%: " + (total - (total * 0.05)));
    }

	}

}
