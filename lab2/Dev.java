public class Dev implements Function {

    private Function internFunction;

    public Dev(Function interFunction) {
        this.internFunction = interFunction;
    }

    public Dev() {
        this.internFunction = null;
    }

    @Override
    public String doTheJob() {
        String job = "Im a Dev and im programmimg"
                + internFunction == null ? "." : " and " + internFunction.doTheJob() + ".";

        return job;
    }

    @Override
    public void addFunction(Function newFunction) {
        if (internFunction == null) {
            this.internFunction = newFunction;
        }

        this.internFunction.addFunction(newFunction);
    }

}
