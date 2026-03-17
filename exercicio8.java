import java.util.Scanner;
public class exercicio8 {
    public static void main(String[] args) {

        Scanner e = new Scanner(System.in);

        String senha;

        System.out.print("Digite a senha: ");
        senha = e.nextLine();

        if (senha.equals("R10p5")) {
            System.out.println("Acesso concedido");
        } else {
            System.out.println("Acesso negado");
        }

    }
}

 