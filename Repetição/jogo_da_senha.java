import java.util.Scanner;

public class jogo_da_senha {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int senha = 123;
        int cs = 1, ds = 2, us = 3;

        System.out.println("Adivinhe a senha de três digitos :");
        int tent = leia.nextInt();

        int cs_player = tent / 100;
        int ds_player = (tent % 100) / 10;
        int us_player = tent % 10;

        
    }
}