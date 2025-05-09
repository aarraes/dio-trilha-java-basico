public class FormatadorCep {
    public static String formatarCep(String cep) throws CepInvalidoException {
        // Remove caracteres não numéricos
        String cepLimpo = cep.replaceAll("[^0-9]", "");

        // Verifica se o CEP tem 8 dígitos
        if (cepLimpo.length() != 8) {
            throw new CepInvalidoException("CEP inválido. O CEP deve conter 8 dígitos.");
        }

        // Formata o CEP no padrão XXXXX-XXX
        return cepLimpo.substring(0, 5) + "-" + cepLimpo.substring(5);
    }  
}
