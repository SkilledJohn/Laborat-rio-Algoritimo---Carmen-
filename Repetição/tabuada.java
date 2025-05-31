/*import java.util.Scanner;

public class tabuada {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite um número entre 1 a 9: ");
        int num = leia.nextInt();

        int i = 0, x = 0;

        while(num > 10 || num < 0){
            
            System.out.println("Não é possível realizar");
    }

        do{

            i = i + 1;

            int mult = num * i;

            System.out.println(i + " x " + num + " = " + mult);
            x++;

        }while(x < 10);
    }
}*/

public class tabuada {
    public static void main(String[] args) {
        
        int i = 0, num = 1;

        for(num = 1; num <= 10; num++){

        for(i = 0; i <= 9; i++){
            
            int mult = num * i; 

            System.out.print(i + " X " + num + " = " + mult + "\t");
        }System.out.println();
      }
    }
    
}
