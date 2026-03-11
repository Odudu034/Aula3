import  java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {

        Scanner e = new Scanner(System.in);

        System.out.println("digite dois numeros sem serem iguais ");
        int num1 = e.nextInt();
        int num2 = e.nextInt();

        if (num1 > num2){
            System.out.println("esses sao o seu numeros em forma decrecente "+num1+ " e "+num2);

        }else{
            System.out.println("esses sao seus Numeros em forma decrescente "+num2+" e "+num1);
        }

    }
}
