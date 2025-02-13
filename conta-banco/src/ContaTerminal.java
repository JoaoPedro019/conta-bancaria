import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ContaTerminal {
 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<ContaBancaria> contas = new ArrayList<>();

        while (true) {
            System.out.println("Digite o número da conta:");
            int numero = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Digite o número da agência:");
            String agencia = scanner.nextLine();

            System.out.println("Digite o nome do cliente:");
            String nomeCliente = scanner.nextLine();

            System.out.println("Digite o saldo inicial:");
            double saldo = 100;
            scanner.nextLine();
            ContaBancaria novaConta = new ContaBancaria(numero, agencia, nomeCliente, saldo);
            contas.add(novaConta);

            System.out.println(novaConta.getInfo());

            System.out.println("Deseja cadastrar outra conta? (s/n)");
            String resposta = scanner.nextLine();
            if (resposta.equalsIgnoreCase("n")) {
                break;
            }
        }

        System.out.println("--- Contas cadastradas ---");
        for (ContaBancaria conta : contas) {
            System.out.println(conta.getInfo());
        }

        scanner.close();
    }
}
