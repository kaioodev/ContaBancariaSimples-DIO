import java.util.Scanner; //importa a classe usada para ler a entrada de dados do usuário.
import java.util.Locale; //determina formatação de numeros, datas... De uma determinada região.

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US); //cria um objeto que vai ler os dados do teclado(system.in)

        int numero;
        double saldo;
        String agencia, nomeCliente;

        System.out.print("Digite seu nome e sobrenome:\n>>");
        nomeCliente = scanner.nextLine(); //Lê toda a linha até o ENTER.

        System.out.print("\nDigite sua agência: (000-0)\n>>");
        agencia = scanner.next(); //Lê até o espaço ou ENTER.

        System.out.print("\nDigite o número da sua conta:(0000)\n>>");
        numero = scanner.nextInt();

        System.out.print("\nDigite seu saldo:\n>>");
        saldo = scanner.nextDouble();

        System.out.print("\nOlá " + nomeCliente + "! Obrigado por criar uma conta em nosso banco!");
        System.out.print(" Sua agência é: " + agencia + ", conta: " + numero + " e seu saldo: R$ " + saldo);
        System.out.println(" já está disponível para saque.");







    }
}
