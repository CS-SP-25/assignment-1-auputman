public class NoTax implements SalesTaxBehavior  {
    public Double compute(Double value) {
        return value * 0;
    }
}
