public class FourHalfPercent implements SalesTaxBehavior {
    public Double compute(Double value) {
        return value * 0.045f;
    }
}
