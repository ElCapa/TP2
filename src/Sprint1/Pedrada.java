package Sprint1;
import java.util.TreeMap;
/**
 *Classe Abstracta que representa um publicação feita na rede social. De notar
 * que o atributo carimbo do tempo que representa a data e hora da publicação
 * porém guardada em formato timestamp.
 */

public abstract class Pedrada {

    private int id;
    private String username;
    private long carimboTempo;
    private int gostos;
    private TreeMap<Integer, Comentario> comentarios;
    /**
     * Construtor da Pedrada.
     */
    public Pedrada(int id, String username, long carimboTempo) {
        this.id = id;
        this.username = username;
        this.carimboTempo = carimboTempo;
        this.gostos = 0;
        this.comentarios = new TreeMap<>();
    }
    /**
     * Metodos getters e setters.
     */

    public String getUsername() {
        return username;
    }

    public int getGostos() {
        return gostos;
    }

    public TreeMap<Integer, Comentario> getComentarios() {
        return comentarios;
    }

    public void gosto() {
        gostos++;
    }

    public void tragosto() {
        if (gostos > 0) {
            gostos--;
        }
    }
    /**
     * Adiciona um novo Comentário à Pedrada.
     */
    public Comentario masriola(String texto) {
        Comentario comentario = new Comentario(texto);
        comentarios.put(comentario.getId(), comentario);
        return comentario;
    }

    public long getCarimboTempo() {
        return carimboTempo;
    }
    /**
     * Exibe as informações da Pedrada.
     */
    public void display() {
        System.out.println("Username: " + username);
        System.out.println("Gostos: " + gostos);
        System.out.println("Comentários:");
        for (Comentario comentario : comentarios.values()) {
            System.out.println(" - " + comentario.getTexto());
        }

    }
    /**
     * Adiciona um Comentário à Pedrada.
     */
    public void addComentario(Comentario comentario) {
        comentarios.put(comentario.getId(), comentario);
    }
}
