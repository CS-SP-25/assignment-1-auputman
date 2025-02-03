public class SevenPercent implements SalesTaxBehavior {
    public Double compute(Double value) {
        return value * 0.07f;
    }
}
