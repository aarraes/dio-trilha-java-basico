import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO:Conhecer e importar a classe scanner
        System.out.println("Olá, seja bem-vindo ao banco DevDojo!");
        System.out.println("Por favor, digite os dados da sua conta abaixo:");
        System.out.println("Número da conta: ");
        Scanner sc = new Scanner(System.in);
        int numeroConta = sc.nextInt();
        System.out.println("Agência: ");
        String agencia = sc.next();
        System.out.println("Nome do cliente: ");
        String nomeCliente = sc.nextLine();
        System.out.println("Saldo: ");
        double saldo = sc.nextDouble();
        
        
        //TODO: Exibir a mensagem:""Olá [Nome Cliente], obrigado por criar uma conta em nosso banco, sua agência é [Agencia], conta [Numero] e seu saldo [Saldo] já está disponível para saque"."
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}
