public class Gerente implements Function {
    private Function internFunction;

    public Gerente(Function interFunction) {
        this.internFunction = interFunction;
    }

    public Gerente() {
        this.internFunction = null;
    }

    @Override
    public String doTheJob() {
        String job = "Im the Gerente of this team"
                + internFunction == null ? "." : " and " + internFunction.doTheJob() + ".";

        return job;
    }

    @Override
    public void addFunction(Function newFunction) {
        if (this.internFunction == null) {
            this.internFunction = newFunction;
        }

        this.internFunction.addFunction(newFunction);
    }
}
