import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        int numero;
        String agencia;
        String nomeCliente;
        float saldo;

        //criando um objeto da classe Scanner;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Agência!");
        numero = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Agora, informe a agência! ");
        agencia  = scanner.nextLine();

        System.out.println("Agora, digite o seu nome! ");
        nomeCliente  = scanner.nextLine();

        System.out.println("Por fim, informe o seu saldo! ");
        saldo  = scanner.nextFloat();

        System.out.print("Olá "+ nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "+ agencia +", conta " + numero + " e seu saldo de $" + saldo +" já está disponível para saque.");
    }
}