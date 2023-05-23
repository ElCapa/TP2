package Sprint1;
import Sprint1.Interface.MembroRede;
import java.util.TreeMap;
/**
 *Classe abstracta que representa os diferentes membros que a rede social Pe-
 * dradaDigital pode ter. Esta classe implementa a interface MembroRede onde
 * é definido métodos que representam o comportamento de um membro da rede
 * social. Escrever diferentes tipos de posts são exemplos desses métodos.
 */
public abstract class Isecmarini implements MembroRede {
    protected String username;
    private String email;
    private String nome;
    private String apelido;
    private String pseudominio;
    private String alcunha;
    private String password;
    protected TreeMap<String, Interesse> interesses;
    private boolean visivel;
    /**
     * Metodo construtor.
     */
    public Isecmarini(String username, String email, String nome, String apelido, String pseudominio, String alcunha, String password) {
        this.username = username;
        this.email = email;
        this.nome = nome;
        this.apelido = apelido;
        this.pseudominio = pseudominio;
        this.alcunha = alcunha;
        this.password = password;
        this.interesses = new TreeMap<>();
        this.visivel = true;
    }
    /**
     * Metodo getters e setters.
     */
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public String getPseudominio() {
        return pseudominio;
    }

    public void setPseudominio(String pseudominio) {
        this.pseudominio = pseudominio;
    }

    public String getAlcunha() {
        return alcunha;
    }

    public void setAlcunha(String alcunha) {
        this.alcunha = alcunha;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public TreeMap<String, Interesse> getInteresses() {
        return interesses;
    }

    public void setInteresses(TreeMap<String, Interesse> interesses) {
        this.interesses = interesses;
    }
    public boolean isVisivel() {
        return visivel;
    }
    public void setVisivel(boolean visivel) {
        this.visivel = visivel;
    }

    public void definirVisibilidade() {
        this.visivel = visivel;
    }
    /**
     * Exibe o perfil do membro.
     */
    public void verPerfil(){
        System.out.println("Perfil de " + nome);
        System.out.println("Username: " + username);
        System.out.println("Email: " + email);
        System.out.println("Nome completo: " + nome + " " + apelido);
        System.out.println("Pseudônimo: " + pseudominio);
        System.out.println("Alcunha: " + alcunha);
        System.out.println("Interesses:");
        for (Interesse interesse : interesses.values()) {
            System.out.println(interesse.getDescricao());
        }
        if (visivel) {
            System.out.println("Visibilidade: Visível");
        } else {
            System.out.println("Visibilidade: Invisível");
        }
    }
    /**
     * Resetar a senha do membro.
     */
    public void resetPassword(String novaPassword) {
        this.password = novaPassword;
    }

    /**
     * Envia menssagem para membro.
     */
    @Override
    public Pedrada manda(MembroRede membro) {
        visivel = !visivel;
        System.out.println("Visibilidade alterada: " + (visivel));
        return  null;
    }
    /**
     * Exibe o perfil do membro.
     */
    @Override
    public void mostraPerfil() {
        System.out.println("Perfil de " + username + ":");
        System.out.println("Nome: " + nome);
        System.out.println("Apelido: " + apelido);
        System.out.println("Email: " + email);
        System.out.println("Pseudominio: " + pseudominio);
        System.out.println("Alcunha: " + alcunha);
        System.out.println(" password: " + password);
        if (visivel) {
            System.out.println("Visibilidade: Visível");
        } else {
            System.out.println("Visibilidade: Invisível");
        }
        System.out.println("Interesses:");
        for (Interesse interesse : interesses.values()) {
            System.out.println("- " + interesse.getDescricao());
        }
    }
    /**
     * Muda visibilidade do  membro.
     */
    @Override
    public void mudarVisibilidade() {
        if (isVisivel()) {
            setVisivel(false);
            System.out.println("Visibilidade do perfil alterada para invisível.");
        } else {
            setVisivel(true);
            System.out.println("Visibilidade do perfil alterada para visível.");
        }
    }
    /**
     * Envia uma mensagem.
     */
    @Override
    public void manda() {
        System.out.println("Enviando mensagem.");
    }


    /**
     * Escreve na pedra.
     */
    @Override
    public void escreveNaPedra(Isecmarini membro) {
        System.out.println("Escrevendo na pedra de " + membro.getNome());
        //Pedrada pedra = new Pedrada();
       // pedra.masriola("Olá " + membro.getNome() + "! Deixe uma mensagem na minha pedra.");
       // membro.escreveNaPedra(Pedrada);
    }
    /**
     * Conecta-se a outro membro.
     */
    @Override
    public void conecta(Isecmarini outroMembro) {
        if (estaConectado(outroMembro)) {
            System.out.println("Já está conectado  " + outroMembro.getNome());
        } else {
            System.out.println("Conectando a " + outroMembro.getNome());

            adicionarConexao(outroMembro);
        }

    }
    /**
     * Verifica se está conectado a um membro.
     */
    private boolean estaConectado(Isecmarini outroMembro) {
        return true;
    }
    /**
     * Adiciona uma conexão com outro membro.
     */
    private void adicionarConexao(Isecmarini outroMembro) {

    }
    /**
     * Desconecta de outro membro.
     */
    @Override
    public void desconectar(Isecmarini outroMembro) {
        if (estaConectado(outroMembro)) {
            System.out.println("Desconectando de " + outroMembro.getNome());
            removerConexao(outroMembro);
        } else {
            System.out.println("Não está conectado a " + outroMembro.getNome());
        }
    }
    /**
     * Remove uma conexão com outro membro.
     */
    private void removerConexao(Isecmarini outroMembro) {

    }
}
