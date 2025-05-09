import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro:");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro:");
        int parametroDois = terminal.nextInt();
        
        terminal.close(); // Fechar o Scanner para evitar vazamentos de recursos
        
        try {
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        }
    }
    
    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm >= parametroDois) { // Ajuste na lógica da exceção
            throw new ParametrosInvalidosException("O primeiro parâmetro deve ser menor que o segundo.");
        }
        
        int contagem = parametroDois - parametroUm;
        
        for (int x = 1; x <= contagem; x++) { // Agora conta corretamente de parametroUm até parametroDois
            System.out.println("Imprimindo o número " + x);
        }
    }
}

