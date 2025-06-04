import java.util.Scanner;
import java.util.Random;

public class jogo_da_senha {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Random random = new Random();
        
        int num, i, cont = 0;
        System.out.println("Senha: ");
        int d[] = new int [3];
        int ent[] = new int[3];

        for(i = 0; i <= 2; i++){
            d[i] = random.nextInt(10);
            System.out.print(d[i]);
        }
        while (cont != 3){
        System.out.println();
        System.out.println("Digite sua senha de 3 digitos: ");
        num = leia.nextInt();

        ent[0] = num/100;
        ent[1] = (num%100)/10;
        ent[2] = (num%10);
        cont = 0;

            for(i = 0; i <= 2; i++){
                if(d[i] == ent[i]) {
                    cont++;
                }
            }
            if(cont == 3){
                System.out.println("Senha correta!!!");
            }else{
                System.out.println(cont + " numeros estão na posição correta");
             }
             
        }
    }
}