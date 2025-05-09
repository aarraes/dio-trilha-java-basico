import java.util.Scanner;

public class CaixaEletronico {

  public static void main(String[] args) {
    double saldo = 1000.00; // Saldo inicial
    
    while (true) {
    
    System.out.println("Caixa Eletrônico");
    System.out.println("Selecione a operação desejada:");
    System.out.println("1 - Consultar saldo");
    System.out.println("2 - Sacar");
    System.out.println("3 - Depositar");
    System.out.println("4 - Sair");

    System.out.print("Opção: ");
    Scanner scanner = new Scanner(System.in);
    int opcao = scanner.nextInt();

    if (opcao == 1) {
      System.out.println("Seu saldo é: R$ " + saldo);
    } else if (opcao == 2) {
      System.out.print("Digite o valor a ser sacado: ");
      double valorSaque = scanner.nextDouble();
      if (valorSaque <= saldo) {
        saldo -= valorSaque;
        System.out.println("Saque realizado com sucesso! Seu novo saldo é: R$ " + saldo);
      } else {
        System.out.println("Saldo insuficiente para realizar o saque.");
      }
    } else if (opcao == 3) {
      System.out.print("Digite o valor a ser depositado: ");
      double valorDeposito = scanner.nextDouble();
      saldo += valorDeposito;
      System.out.println("Depósito realizado com sucesso! Seu novo saldo é: R$ " + saldo);
    } else if (opcao == 4) {
      System.out.println("Saindo do caixa eletrônico. Até logo!");
      break;
    } else {
      System.out.println("Opção inválida. Tente novamente.");
    }
  }
}
  
}
