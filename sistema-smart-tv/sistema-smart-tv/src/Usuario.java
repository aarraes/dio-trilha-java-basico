
import java.util.Scanner;



public class Usuario {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();
        System.out.println("Digite seu sobrenome: ");
        String sobrenome = scanner.nextLine();
        System.out.println("Nome: " + nome + " " + sobrenome);
        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();
        System.out.println("Idade: " + idade);
        System.out.println("Digite sua altura: ");
        double altura = scanner.nextDouble();
        System.out.println("Altura: " + altura);
        
        
        SmartTv smartTv = new SmartTv();
        System.out.println("A TV está ligada? " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canalAtual);
        System.out.println("Volume atual: " + smartTv.volumeAtual);
                
        smartTv.ligar();
        System.out.println("A TV está ligada? " + smartTv.ligada);

        smartTv.desligar(); 
        System.out.println("A TV está ligada? " + smartTv.ligada);
        
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        System.out.println("Volume atual: " + smartTv.volumeAtual);

    }
}
