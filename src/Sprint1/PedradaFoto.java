package Sprint1;
/**
 * Classe que representa uma pedrada de foto.
 */
public class PedradaFoto extends Pedrada {
    private String nomeFicheiro;
    private String legenda;
    /**
     * Construtor da classe PedradaFoto.
     */
 public PedradaFoto(int id, String username, long carimboTempo, String nomeFicheiro, String legenda) {
        super(id, username, carimboTempo);
        this.nomeFicheiro = nomeFicheiro;
        this.legenda = legenda;
    }
    /**
     * Exibe as informações da pedrada de foto.
     */
    public void display() {
        System.out.println("Foto: " + nomeFicheiro);
        System.out.println("Legenda: " + legenda);
    }
    /**
     * Metodos getters.
     */

    public String getNomeficheiro() {
        return nomeFicheiro;
    }

    public String getLegenda() {
        return legenda;
    }


}


