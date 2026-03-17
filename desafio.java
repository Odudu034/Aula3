import java.util.Scanner;
public class desafio {
    public static void main(String[] args) {

        Scanner e = new Scanner(System.in);

        int idade;

        System.out.print("Digite sua idade: ");
        idade = e.nextInt();

        if (idade < 16) {
            System.out.println("Não pode votar.");
        }
        else if (idade < 18) {
            System.out.println("Voto facultativo.");
        }
        else if (idade <= 70) {
            System.out.println("Voto obrigatório.");
        }
        else {
            System.out.println("Voto facultativo.");
        }

    }
}

 