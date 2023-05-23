package Sprint1;
import Sprint1.Interface.GestorEvento;
import Sprint1.emumeration.VidaEstudante;
import java.util.ArrayList;
import java.util.List;
/**
 *Representa estudantes que estão inscritos em algum curso do ISECMAR.
 * Esta classe implementa a interface GerirEventos.
 */

public class Estudante extends Isecmarini implements GestorEvento {
    private int codigo;
    private String curso;
    private int anomatricula;
    private int anocurso;
    private VidaEstudante status;
    /**
     * Construtor da classe Estudante.
     */
 public Estudante(String username, String email, String nome, String apelido, String pseudominio, String alcunha,
                     String password, int codigo, String curso,int anomatricula,int anocurso,VidaEstudante status) {
        super(username, email, nome, apelido, pseudominio, alcunha, password);
        this.codigo = codigo;
        this.curso = curso;
        this.anomatricula = anomatricula;
        this.anocurso = anocurso;
        this.status = status;
    }
    /**
     * Metodos getters e setters.
     */
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getAnomatricula() {
        return anomatricula;
    }

    public void setAnomatricula(int anomatricula) {
        this.anomatricula = anomatricula;
    }

    public int getAnocurso() {
        return anocurso;
    }

    public void setAnocurso(int anocurso) {
        this.anocurso = anocurso;
    }

    public VidaEstudante getStatus() {
        return status;
    }

    public void setStatus(VidaEstudante status) {
        this.status = status;
    }
    /**
     * Metodo para enviar uma mensagem para todos os estudantes da turma.
     */
    public void mandaPaTurma() {
        List<Estudante> estudantesDaTurma = obterEstudantesDaTurma();
        for (Estudante estudante : estudantesDaTurma) {
            enviarMensagem(estudante);
        }
    }
    /**
     * Obtém a lista de estudantes da turma.
     */
    private List<Estudante> obterEstudantesDaTurma() {
        List<Estudante> estudantes = new ArrayList<>();
        estudantes.add(new Estudante("colega1", "colega1@example.com", "Colega 1", "Sobrenome 1", "pseudominio1", "alcunha1", "senha1",0,"leit",2,2,VidaEstudante.Matriculado));
        estudantes.add(new Estudante("colega2", "colega2@example.com", "Colega 2", "Sobrenome 2", "pseudominio2", "alcunha2", "senha2",0, "LEM", 2,3,VidaEstudante.Suspenso));
        estudantes.add(new Estudante("colega3", "colega3@example.com", "Colega 3", "Sobrenome 3", "pseudominio3", "alcunha3", "senha3", 2, "LEE", 2,2,VidaEstudante.Terminado));

        return estudantes;
    }
    /**
     * Metodo envia uma mensagem para um estudante.
     */
    private void enviarMensagem(Estudante estudante) {
        System.out.println("Enviar Mensaagem " + estudante.getNome());
    }
    /**
     * Metodo que cria um novo evento.
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
     * Metodo que cria um novo evento recorrente.
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
     * Metodo que convida os estudantes para um evento.
     */
    @Override
    public void convidar() {
        enviarConvite("");
        enviarConvite("");
        enviarConvite("");
    }
    /**
     * Metodo envia um convite para um novo estudante.
     */
    private void enviarConvite(String novoEstudante) {
        System.out.println("Convidar " + novoEstudante);
    }
}

