package Sprint1;
import Sprint1.emumeration.TipoEvento;
public class Evento {
    private int id;
    private String nome;
    private TipoEvento tipo;
    private String data;
    private String local;
    private String frequencia;
    private int intervalo;
    /**
     * Metodo construtor de Evento.
     */
    public Evento() {
        this.id = id;
        this.nome = nome;
        this.tipo = tipo;
    }
    /**
     * Metodos getters e setters.
     */
    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public TipoEvento getTipo() {
        return tipo;
    }

    public void setId() {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTipo() {
        this.tipo = tipo;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getLocal() {
        return local;
    }
    /**
     * Obtém a frequência do evento.
     */
    public void setFrequencia(String frequencia) {
        this.frequencia = frequencia;
    }

    /**
     * Obtém a frequência do evento.
     *
     * @return A frequência do evento.
     */
    public String getFrequencia() {
        return frequencia;
    }
    /**
     * Define o intervalo do evento.
     */
    public void setIntervalo(int intervalo) {
        this.intervalo = intervalo;
    }
    /**
     * Obtém o intervalo do evento.
     */
    public int getIntervalo() {
        return intervalo;
    }
}
