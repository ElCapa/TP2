package Sprint1;

/**
 * Classe que representa uma pedrada de mensagem.
 */
public class PedradaMensagem extends Pedrada {
    private String mensagem;
    /**
     * Construtor da classe PedradaMensagem.
     */
    public PedradaMensagem(int id, String username, long carimboTempo, String mensagem) {
        super(id, username, carimboTempo);
        this.mensagem = mensagem;
    }
    /**
     * Exibe a mensagem da pedrada.
     */
    public void display() {
        System.out.println("Mensagem: " + mensagem);
    }
    /**
     * Metodos getters.
     */
    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }
    public String getTexto() {
        return mensagem;
    }
}

