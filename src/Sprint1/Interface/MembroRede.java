package Sprint1.Interface;
import Sprint1.Isecmarini;
import Sprint1.Pedrada;


public interface MembroRede {
    Pedrada manda(MembroRede membro);
    void mostraPerfil();
    void mudarVisibilidade();
    void manda();
    void escreveNaPedra(Isecmarini membro);
    void conecta(Isecmarini outroMembro);
    void desconectar(Isecmarini outroMembro);
}


