package Sprint1;
import java.util.ArrayList;
/**
 * Classe que implementa o Newsfeed ou o feed de notícias da rede social por-
 * tanto quem publicou o quê, quando quem reagiu a publicação etc.
 */
public class Riola {
    private ArrayList<Pedrada> pedradas;
    /**
     * Construtor da classe Riola.
     */
    public Riola() {
        pedradas = new ArrayList<>();
    }
    /**
     * Adiciona uma pedrada à lista de pedradas.
     */
    public void addPedrada(Pedrada pedrada) {
        pedradas.add(pedrada);
    }


    public void show() {
        for (Pedrada pedrada : pedradas) {
            pedrada.display();
        }
    }
}

