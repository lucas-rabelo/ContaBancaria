import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        int numero = 0;
        String agencia = new String("");
        String nome_cliente = new String("");
        double saldo = 0.0;

        System.out.println("Por favor, digite o número da Agência!");
        numero = scanner.nextInt();

        System.out.println("Por favor, digite a Agência!");
        agencia = scanner.next();

        System.out.println("Por favor, digite a Nome Completo!");
        nome_cliente = scanner.next();

        while (true) {
            try {
                System.out.println("Por favor, digite o Saldo!");
                saldo = scanner.nextDouble();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, digite um valor numérico.");
                scanner.next(); // Limpa a entrada inválida
            }
        }

        System.out.println("Olá " + nome_cliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");
    }
}
