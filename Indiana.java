public class Indiana extends State {
    public Indiana(SalesTaxBehavior taxBehavior) {
        this.taxBehavior = taxBehavior; //see comments from Hawaii.java
        this.setName("Indiana");
    }

    public void showTax(double value) {
        super.showTax(value); //go to parent print
    }
}
