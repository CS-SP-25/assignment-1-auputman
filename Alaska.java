public class Alaska extends State {
    public Alaska(SalesTaxBehavior taxBehavior) {
        this.taxBehavior = taxBehavior; //See comments in Hawaii.java
        this.setName("Alaska");
    }

    public void showTax(double value) {
        super.showTax(value); //See comments in Indiana.java
    }
}
