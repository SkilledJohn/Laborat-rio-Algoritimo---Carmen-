import java.util.Scanner;

public class divisores {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int num, i; 

        System.out.print("Digite um número: ");
        num = leia.nextInt();

        for(i = 1; i <= num; i++){
            if(num%i == 0){
                System.out.println(i);
            }
        }
    }
}
