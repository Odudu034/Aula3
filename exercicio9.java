import java.util.Scanner;
public class exercicio9 {
    public static void main(String[] args) {

        Scanner e = new Scanner(System.in);

        double salario, prestacao;

        System.out.print("Digite o salário bruto: ");
        salario = e.nextDouble();

        System.out.print("Digite o valor da prestação: ");
        prestacao = e.nextDouble();

        if (prestacao <= salario * 0.30) {
            System.out.println("Empréstimo pode ser concedido");
        } else {
            System.out.println("Empréstimo não pode ser concedido");
        }
    }
}
 