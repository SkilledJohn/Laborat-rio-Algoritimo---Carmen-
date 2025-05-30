import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

       int prox = 2;
       int prim = 1;
       int seg = 1;
       int i, n;

       System.out.print("Digite um número: ");
       n = leia.nextInt();

       System.out.println(prim);
       System.out.println(seg);

       for(i = 1; i <= n; i = i + 1){

        prox = prim + seg;
        System.out.println(prox);
        prim = seg;
        seg = prox;
       }
    }
}
