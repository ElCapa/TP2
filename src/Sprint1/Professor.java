package Sprint1;
import Sprint1.Interface.ModeradorGrupo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
/**
 *Representa um membro da rede social que é professor do Isecmar. A classe
 * professor implementa a interface ModeradorGrupo.
 */
public class Professor extends Isecmarini implements ModeradorGrupo {
    private String area;
    private String grau;
    private String departamento;
    private Object novoMembro;
    private Professor grupo;
    private Object membro;
    private List<Grupo> listaGrupos;
    /**
     * Construtor da classe Professor.
     */

    public Professor(String username, String email, String nome, String apelido, String pseudominio, String alcunha, String password, String area, String grau, String departamento) {
        super(username, email, nome, apelido, pseudominio, alcunha, password);
        this.area = area;
        this.grau = grau;
        this.departamento = departamento;
        this.listaGrupos = new ArrayList<>();
    }
    /**
     * Metodos getters e setters.
     */
    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getGrau() {
        return grau;
    }

    public void setGrau(String grau) {
        this.grau = grau;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public void criar() {
        Grupo novoGrupo = new Grupo();
        novoGrupo.setNome("");
        novoGrupo.setDescricao("");
        novoGrupo.adicionarMembro(this);
        listaGrupos.add(novoGrupo);

    }

    @Override
    public void apagar() {
        if (grupo != null) {
            listaGrupos.remove(grupo);
            System.out.println("Grupo apagado com sucesso.");
        } else {
            System.out.println("Não foi possível apagar o grupo.");
        }
    }

    @Override
    public void adicionarMembro() {
        if (grupo != null && novoMembro != null) {
            if (!grupo.getMembros().contains(novoMembro)) {
                grupo.adicionarMembro(novoMembro);
                System.out.println("Membro adicionado com sucesso ao grupo.");
            } else {
                System.out.println("O membro já está no grupo.");
            }
        } else {
            System.out.println("Não foi possível adicionar o membro ao grupo.");
        }
    }

    private void adicionarMembro(Object novoMembro) {

    }

    private Collection<Object> getMembros() {
        return null;
    }

    @Override
    public void removerMembro() {
        if (grupo != null && membro != null) {
            if (grupo.getMembros().contains(membro)) {
                grupo.removerMembro();
                System.out.println("Membro removido.");
            } else {
                System.out.println("Membro não existe.");
            }
        } else {
            System.out.println("Não foi possível remover o membro do grupo.");
        }
    }

    private List<Professor> obterColegas() {
        List<Professor> colegas = new ArrayList<>();
        colegas.add(new Professor("colega1", "colega1@example.com", "Colega 1", "Sobrenome 1", "pseudominio1", "alcunha1", "senha1", "Área 1", "Grau 1", "Departamento 1"));
        colegas.add(new Professor("colega2", "colega2@example.com", "Colega 2", "Sobrenome 2", "pseudominio2", "alcunha2", "senha2", "Área 2", "Grau 2", "Departamento 2"));
        colegas.add(new Professor("colega3", "colega3@example.com", "Colega 3", "Sobrenome 3", "pseudominio3", "alcunha3", "senha3", "Área 3", "Grau 3", "Departamento 3"));

        return colegas;
    }

    public void mandaColegas() {

        List<Professor> colegas = obterColegas();

        if (colegas.isEmpty()) {
            System.out.println("Não há colegas para enviar mensagem.");
        } else {
            System.out.println("Enviando mensagem para os colegas:");

            for (Professor colega : colegas) {
                System.out.println(" - Nome: " + colega.getNome());
                System.out.println("   Email: " + colega.getEmail());
                System.out.println("   Departamento: " + colega.getDepartamento());
                System.out.println("   Área: " + colega.getArea());
                System.out.println();
            }
        }
    }
}