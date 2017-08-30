import java.util.Scanner;

public class Q19 {

	public static void main(String[] args) {
	
	Scanner in = new Scanner(System.in);

    int vlrs[] = new int[3];
    int result = 0;
    boolean scap = true;
    
    for(int a = 0; a < vlrs.length; a++){
        System.out.println("Digite o " + (a+1) + "º valor: ");
        vlrs[a] = in.nextInt();
    }

    if(vlrs[0] < vlrs[1] && vlrs[0] < vlrs[2]){
        if(vlrs[1] < vlrs[2]){
            System.out.println("Ordem Crescente: " + vlrs[0] + ", " + vlrs[1] + ", " + vlrs[2]);
        }
    }else{
        if(vlrs[1] < vlrs[0] && vlrs[1] < vlrs[2]){
            if(vlrs[0] < vlrs[2]){
                System.out.println("Ordem Crescente: " + vlrs[1] + ", " + vlrs[0] + ", " + vlrs[2]);
            }else{
                System.out.println("Ordem Crescente: " + vlrs[1] + ", " + vlrs[2] + ", " + vlrs[0]);
            }
        }else{
            if(vlrs[1] < vlrs[0]){
                System.out.println("Ordem Crescente: " + vlrs[2] + ", " + vlrs[1] + ", " + vlrs[0]);
            }else{
                System.out.println("Ordem Crescente: " + vlrs[2] + ", " + vlrs[0] + ", " + vlrs[1]);
            }
        }
    }

    }

}
