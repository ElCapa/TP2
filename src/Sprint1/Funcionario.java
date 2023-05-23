package Sprint1;
import Sprint1.Interface.GestorEvento;
/**
 *Representa funcionários não docentes do ISECMAR. Esta classe implementa
 * a interface GerirEventos.
 */
public class Funcionario extends Isecmarini implements GestorEvento {
    private String uo;
    private String funcao;

    /**
     * Metodo construtor de Funcionario.

     */
    public Funcionario(String username, String email, String nome, String apelido, String pseudominio, String alcunha, String password, String uo, String funcao) {
        super(username, email, nome, apelido, pseudominio, alcunha, password);
        this.uo = uo;
        this.funcao = funcao;
    }

    /**
     * Metodos getters e setters.
     */
    public String getUo() {
        return uo;
    }

    public void setUo(String uo) {
        this.uo = uo;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
    /**
     *Cria um novo evento.
     */
    @Override
    public void novo() {
        Evento evento = new Evento();
        evento.setNome("");
        evento.setTipo();
        evento.setId();
        evento.setData("");
        evento.setLocal("");
    }
    /**
     *Cria um novo evento recorrente.
     */
    @Override
    public void novoRecorrente() {
        Evento eventoRecorrente = new Evento();
        eventoRecorrente.setNome("");
        eventoRecorrente.setData("");
        eventoRecorrente.setLocal("");
        eventoRecorrente.setFrequencia("");
        eventoRecorrente.setIntervalo(1);
    }
    /**
     * Metodo que convida Funcionario para um evento.
     */
    @Override
    public void convidar() {
        enviarConvite("");
        enviarConvite("");
        enviarConvite("");
    }

    /**
     * Envia um convite para um novo funcionário.
     */
    private void enviarConvite(String novoFuncionario) {
        System.out.println("Convidar " + novoFuncionario);
    }
}
