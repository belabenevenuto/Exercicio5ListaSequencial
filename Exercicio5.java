import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {
        double metros, centimetros;
        Scanner teclado = new Scanner(System.in);
        metros = teclado.nextDouble();
        centimetros = metros * 100;
        System.out.print("O resultado é " + centimetros + " centímetros");
    }
}
