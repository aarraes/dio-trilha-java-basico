
import java.util.concurrent.ThreadLocalRandom;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        String alunos[] = {"FELIPE","JONAS", "JULIA", "MARCOS"};

        for (String aluno : alunos){
            System.out.println(aluno); 
            System.out.println(ThreadLocalRandom.current().nextDouble(2,8));
        }

        
    }
}
