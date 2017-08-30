import java.util.Scanner;

public class Q08 {

	public static void main(String[] args) {
		double vl_c;
	    double vl_f;
	    double vl_temp;
	       
	    Scanner in = new Scanner(System.in);
	    
	    System.out.println("Digite a temperatura em ºF");
	   	vl_f = in.nextDouble();
	    
	    vl_temp = ((vl_f - 32)*5)/9;
	    
	    System.out.println("Convertendo a temperatura de " + vl_f + "ºF para ºC, obtemos o valor de: " + vl_temp + "ºC");

	}

}
