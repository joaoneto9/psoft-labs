public class Lider implements Function {

    private Function internFunction;

    public Lider(Function interFunction) {
        this.internFunction = interFunction;
    }

    public Lider() {
        this.internFunction = null;
    }

    @Override
    public String doTheJob() {
        String job = "Im the leader of the sprint"
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
