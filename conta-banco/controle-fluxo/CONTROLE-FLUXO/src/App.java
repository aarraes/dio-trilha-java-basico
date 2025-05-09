public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        FormatadorCep formatador = new FormatadorCep();
        String cep = "123"; // Exemplo de CEP
        try {
            String cepFormatado = formatador.formatarCep(cep);
            System.out.println("CEP formatado: " + cepFormatado);
        } catch (CepInvalidoException e) {
            System.out.println(e.getMessage());
        }
    }
}
