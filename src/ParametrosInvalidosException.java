public class ParametrosInvalidosException extends RuntimeException{

    private static final String MENSAGEM_ERRO = "O segundo parâmetro deve ser maior que o primeiro";

    public ParametrosInvalidosException() {
            super(MENSAGEM_ERRO);
    }

}
