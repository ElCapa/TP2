package Sprint1;
import Sprint1.emumeration.TipoEvento;
import java.util.Date;
/**
 * Classe que representa um evento de pedrada.
 */
public class PedradaEvento extends Pedrada {
    private TipoEvento tipo;
    private String local;
    private String entrada;
    private String status;
    private Date data;
    /**
     * Construtor da classe PedradaEvento.
     */
 public PedradaEvento(int id, String username, long carimboTempo, TipoEvento tipo, Date data, String local, String entrada, String status) {
        super(id, username, carimboTempo);
        this.tipo = tipo;
        this.data = data;
        this.local = local;
        this.entrada = entrada;
        this.status = status;
    }
    /**
     * Exibe as informações do evento de pedrada.
     */
    @Override
    public void display() {
        System.out.println("Evento: " + tipo);
        System.out.println("Data: " + data);
        System.out.println("Local: " + local);
        System.out.println("Entrada: " + entrada);
        System.out.println("Status: " + status);
    }
    /**
     * Metodos getters e setters.
     */
    public String getLocal() {
        return local;
    }

    public String getStatus() {
        return status;
    }

    public Date getData() {
        return data;
    }
}









