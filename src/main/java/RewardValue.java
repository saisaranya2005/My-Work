public class RewardValue {
    private final double cashValue;
    private final int milesValue;
    private static final double conversionRate = 0.0035;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = (int) (cashValue / getConversionRate());
    }

    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
        this.cashValue = milesValue * getConversionRate();
    }

    public double getCashValue() {
        return cashValue;
    }

    public int getMilesValue() {
        return milesValue;
    }

    public static double getConversionRate() {
        return conversionRate;
    }
}