import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Olá Git!");

        Scanner sc = new Scanner(System.in);

        System.out.println("""
                Bem vindo!
                Escolha um numero para fazer a tabuada de 0 a 10
                """);

        int escolha;

        while (!sc.hasNextInt()){
            System.out.print("Entrada invalida! Digite um numero inteiro: ");
            sc.next();
            }
        escolha = sc.nextInt();

        for (int i = 0; i <= 10; i++) {
            int calculo = escolha * i;
            System.out.println(escolha + " X " + i + " = "+ calculo );
        }
        sc.close();
    }
}