package Sprint1;
import Sprint1.emumeration.VidaEstudante;
/**
 * Esta classe representa antigos estudantes do Isecmar.
 * Herda da classe Estudante.
 */
public class Alumni extends Estudante {
    private String trabalho;
    private String funcao;
    private String email;
/**
 * Construtor da classe Alumni.
 */

    public Alumni(String username, String email, String nome, String apelido, String pseudominio, String alcunha, String password, int codigo, String curso, int anomatricula, int anocurso, VidaEstudante status, String trabalho, String funcao, String email1) {
        super(username, email, nome, apelido, pseudominio, alcunha, password, codigo, curso, anomatricula, anocurso, status);
        this.trabalho = trabalho;
        this.funcao = funcao;
        this.email = email1;
    }
    /**
     * Metodos getters e setters.
     */
    public String getTrabalho() {
        return trabalho;
    }

    public void setTrabalho(String trabalho) {
        this.trabalho = trabalho;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

