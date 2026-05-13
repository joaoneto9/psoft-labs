import java.util.*;

public class Team {

    private Map<Integer, Funcionario> funcionarios;
    private List<Sprint> sprints;

    public Team() {
        this.funcionarios = new HashMap<>();
        this.sprints = new ArrayList<>();
    }

    public void addSprint(Integer idLider, String summary) {
        Funcionario lider = funcionarios.get(idLider);
        this.sprints.add(new Sprint(lider, summary));
    }

}
