package Sprint1;
import Sprint1.emumeration.VidaEstudante;

import java.util.TreeMap;
/**
 * Classe que representa a plataforma PedradaDigital.
 */
public class PedradaDigital {
    private TreeMap<String, Isecmarini> comunidade;
    private TreeMap<Integer, Pedrada> pedradas;
    private TreeMap<Integer, Grupo> grupos;
    private TreeMap<Integer, Evento> eventos;
    /**
     * Construtor da classe PedradaDigital.
     */
    public PedradaDigital() {
        this.comunidade = new TreeMap<>();
        this.pedradas = new TreeMap<>();
        this.grupos = new TreeMap<>();
        this.eventos = new TreeMap<>();
    }
    /**
     * Realiza o cadastro de um membro na plataforma PedradaDigital.
     */
    public Isecmarini signup(String username, String email, String nome, String apelido, String pseudominio, String alcunha, String password) {
        Isecmarini membroF = new Funcionario(username, email, nome, apelido, pseudominio, alcunha, password, "", "");
        comunidade.put(username, membroF);
        Isecmarini membroE = new Estudante(username, email, nome, apelido, pseudominio, alcunha, password, 0, "", 0, 0, VidaEstudante.valueOf(""));
        comunidade.put(username, membroE);
        Isecmarini membroP = new Professor(username, email, nome, apelido, pseudominio, alcunha, password, "", "","");
        comunidade.put(username, membroP);
        return membroF;
    }

    /**
     * Realiza o login de um membro na plataforma PedradaDigital.
     */

    public void signin(String username, String password) {

        if (comunidade.containsKey(username)) {
            Isecmarini membro = comunidade.get(username);

            if (membro.getPassword().equals(password)) {
                System.out.println("Sucesso!");
            } else {
                System.out.println("Senha incorreta!");
            }
        } else {
            System.out.println("Usuário não encontrado");
        }
    }
    /**
     * Realiza o logout de um membro da plataforma PedradaDigital.
     */
    public void signoff(String username) {
        if (comunidade.containsKey(username)) {
            comunidade.remove(username);
            System.out.println("Removido: " + username);
        } else {
            System.out.println("Membro não encontrado: " + username);
        }
    }
    /**
     * Adiciona um grupo à plataforma PedradaDigital.
     */
    public void addGrupo(Grupo grupo) {
        grupos.put(grupo.getId(), grupo);
    }
    /**
     * Adiciona um evento à plataforma PedradaDigital.
     */
    public void addEvento(Evento evento) {
        eventos.put(evento.getId(), evento);
    }
}
