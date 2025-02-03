public class State {
    private String name;
    protected SalesTaxBehavior taxBehavior; //thing to calculate tax value with

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void showTax(double value) {
        System.out.printf("The sales tax on $%.2f in %s is $%.2f.%n", value, this.getName(), taxBehavior.compute(value));
    }
}
