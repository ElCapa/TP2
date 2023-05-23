package Sprint1;
/**
 * A classe Grupo.
 */
public class Grupo {
    private int id;
    private String data;
    private String estado;
    /**
     * Constrói um objeto Grupo com valores padrão.
     */
    public Grupo() {
        this.id = 0;
        this.data = "data";
        this.estado = "estado";
    }
    /**
     * Metodos getters e setters.
     */

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    /**
     * Define o nome do grupo.
     */
    public void setNome(String grupoDeEstudo) {
    }
    /**
     * Define a descrição do grupo.
     */

    public void setDescricao(String s) {
    }
    /**
     * Adiciona um membro ao grupo.
     */
    public void adicionarMembro(Professor professor) {
    }
}
