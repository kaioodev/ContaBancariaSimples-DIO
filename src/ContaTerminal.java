import java.awt.desktop.SystemEventListener;
import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        System.out.print("Digite seu nome e sobrenome:\n>>");
        nomeCliente = scanner.nextLine();

        System.out.print("\nDigite sua agência: (000-0)\n>>");
        agencia = scanner.next();

        System.out.print("\nDigite o número da sua conta:(0000)\n>>");
        numero = scanner.nextInt();

        System.out.print("\nDigite seu saldo:\n>>");
        saldo = scanner.nextDouble();

        System.out.println("\nOlá " + nomeCliente + "! Obrigado por criar uma conta em nosso banco, sua agência é: " + agencia + ", conta: " + numero + " e seu saldo R$" + saldo + " já está disponível para saque.");







    }
}