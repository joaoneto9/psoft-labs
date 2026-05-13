import java.util.HashMap;
import java.util.Map;

public class Empresa {

    private Map<Integer, Team> teams;
    private Funcionario productOwner;
    private Integer nextIdTeam;

    public Empresa(Funcionario productOwner) {
        this.teams = new HashMap<>();
        this.productOwner = productOwner;
    }

    public void addTeam() {
        this.teams.put(nextIdTeam++, new Team());
    }

    public String getProductOwnerJob() {
        return productOwner.showJobs();
    }
}