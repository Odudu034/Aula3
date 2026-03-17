import java.util.Scanner;
public class exercicio10 {
    public static void main(String[] args) {

        Scanner e = new Scanner(System.in);

        int n1, n2, n3;

        System.out.print("Digite o primeiro número: ");
        n1 = e.nextInt();

        System.out.print("Digite o segundo número: ");
        n2 = e.nextInt();

        System.out.print("Digite o terceiro número: ");
        n3 = e.nextInt();

        if (n1 == n2 && n2 == n3) {
            System.out.println("Os números são iguais");
        }
        else {
            int maior = n1;

            if (n2 > maior) {
                maior = n2;
            }

            if (n3 > maior) {
                maior = n3;
            }

            System.out.println("O maior número é: " + maior);
        }

    }
}


 