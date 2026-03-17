import java.util.Scanner;
public class exercicio7 {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);

        double salario, bonus;
        int anos;

        System.out.print("Digite o salário: ");
        salario = e.nextDouble();

        System.out.print("Digite os anos de trabalho: ");
        anos = e.nextInt();

        if (anos >= 5) {
            bonus = salario * 0.20;
        } else {
            bonus = salario * 0.10;
        }

        System.out.println("Valor do bônus: " + bonus);

    }
}

