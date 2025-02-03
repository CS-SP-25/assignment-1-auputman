public class Hawaii extends State {
    public Hawaii(SalesTaxBehavior taxBehavior) {
        this.taxBehavior = taxBehavior; //Set the tax behavior on construction
        this.setName("Hawaii"); //Set name, this doesn't need to really be variable
    }

    public void showTax(double value) {
        super.showTax(value); //See comments in Indiana.java
    }
}
