package Sprint1;
/**
 * A classe Interesse representa um interesse relacionado o que os usuarios gostam fazer.
 */
public class Interesse {
    private String descricao;
    /**
     * Construtor.
     */
    public Interesse(String descricao) {
        this.descricao = descricao;
    }
    /**
     * Obtém a descrição do interesse.
     */
    public String getDescricao() {
        return descricao;
    }
}
