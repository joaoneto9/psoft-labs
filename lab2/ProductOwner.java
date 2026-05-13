public class ProductOwner implements Function {

    private Function internFunction;

    public ProductOwner(Function interFunction) {
        this.internFunction = interFunction;
    }

    public ProductOwner() {
        this.internFunction = null;
    }

    @Override
    public String doTheJob() {
        String job = "Im the ProductOwner of this company"
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
