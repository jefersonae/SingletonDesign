public class Logger {
    private static Logger instancia;

    private Logger() {
    }

    public static Logger getInstancia() {
        if (instancia == null) {
            instancia = new Logger();
        }
        return instancia;
    }

    // Métodos para gravar logs
    public void gravarLog(String mensagem) {
        // Implementação da gravação do log
    }
}
