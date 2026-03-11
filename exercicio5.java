import  java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {

        Scanner e = new Scanner(System.in);

        System.out.println("digite um numero aleatorio");
        double num=e.nextDouble();

        if (num>=50 || num<=100){
            System.out.println("pertence ao intervalo");

        }else{
            System.out.println("não pertence ao intervalo");
        }
    }
}
