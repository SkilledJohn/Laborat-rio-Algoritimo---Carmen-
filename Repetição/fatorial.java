import java.util.Scanner;

public class fatorial {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int num, fat, soma=1;

        System.out.println("Digite um número para fatora-lo: ");
        num = leia.nextInt();

        for(fat = 1; fat <= num; fat = fat+1){
            soma = soma*fat;
        }
        System.out.println("Resultado= "+soma);
    }
}
