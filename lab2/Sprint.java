import java.util.Date;

public class Sprint {
    private Funcionario lider;
    private Date date;
    private String summary;

    public Sprint(Funcionario lider, String summary) {
        this.date = new Date();
        this.summary = summary;
        // adicionar papel de lider aqui
        lider.addFunction(new Lider());
        this.lider = lider;
    }
}
