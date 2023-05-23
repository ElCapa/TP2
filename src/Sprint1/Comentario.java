package Sprint1;
import java.util.Date;
/**
 * Classe que representa um de sistema de comentários.
 */
public class Comentario {
    private static int contador = 1;
    private String texto;
    private Date dataHora;
    private int gostos;
    private int id;
    /**
     * Construtor da classe Comentario.
     */
    public Comentario(String texto) {
        this.id = contador++;
        this.texto = texto;
        this.dataHora = new Date();
        this.gostos = 0;
    }
    /**
     * Responde ao comentário com um novo comentário.
     */
    public Comentario responder(String texto) {
        Comentario comentario = new Comentario(texto);
        return comentario;
    }
    /**
     * Metodo que incrementa o número de gostos do comentário.
     */
    public void gosto() {
        this.gostos++;
    }
    /**
     * Metodo que decrementa o número de gostos do comentário.
     */
    public void tragosto() {
        this.gostos--;
    }
    /**
     * Metodos getters.
     */
    public String getTexto() {
        return texto;
    }

    public int getId() {
        return id;
    }
}
