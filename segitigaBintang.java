import java.util.Scanner;
public class segitigaBintang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for(int i = 1; i <= n; i++){
            for (int j = 0; j < n; j++){
                if(n - i <= j){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }    
}
