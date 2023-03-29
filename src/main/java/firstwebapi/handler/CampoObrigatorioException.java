package firstwebapi.handler;

public class CampoObrigatorioException extends BusinessException{

    public CampoObrigatorioException(String campo) {
        super("O campo é obrigatório", campo);
    }

    
}
