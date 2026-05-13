public class Funcionario {

    private String name;
    private String cpf;
    private Function function;

    public Funcionario(String name, String cpf) {
        this.name = name;
        this.cpf = cpf;
        this.function = new Dev();
    }

    public Funcionario(String name, String cpf, Function function) {
        this.name = name;
        this.cpf = cpf;
        this.function = function;
    }

    public String showJobs() {
        return function.doTheJob();
    }

    public String getName() {
        return name;
    }

    public String getCpf() {
        return cpf;
    }

    public Function getFunction() {
        return function;
    }

    public void setFunction(Function function) {
        this.function = function;
    }

    public void addFunction(Function function) {
        this.function.addFunction(function);
    }

}
