import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RewardValueTests {

    @Test
    void create_with_cash_value() {
        double cashValue = 100.0;
        RewardValue rewardValue = new RewardValue(cashValue);
        Assertions.assertEquals(cashValue, rewardValue.getCashValue());
    }

    @Test
    void create_with_miles_value() {
        int milesValue = 10000;
        RewardValue rewardValue = new RewardValue(milesValue);
        Assertions.assertEquals(milesValue, rewardValue.getMilesValue());
    }

    @Test
    void convert_from_cash_to_miles() {
        double cashValue = 350.0;
        RewardValue rewardValue = new RewardValue(cashValue);
        int expectedMilesValue = (int) (cashValue / RewardValue.getConversionRate());
        Assertions.assertEquals(expectedMilesValue, rewardValue.getMilesValue());
    }

    @Test
    void convert_from_miles_to_cash() {
        int milesValue = 10000;
        RewardValue rewardValue = new RewardValue(milesValue);
        double expectedCashValue = milesValue * RewardValue.getConversionRate();
        Assertions.assertEquals(expectedCashValue, rewardValue.getCashValue());
    }

    @Test
    void convert_from_cash_to_miles_with_zero_value() {
        double cashValue = 0.0;
        RewardValue rewardValue = new RewardValue(cashValue);
        int expectedMilesValue = 0;
        Assertions.assertEquals(expectedMilesValue, rewardValue.getMilesValue());
    }

    @Test
    void convert_from_miles_to_cash_with_zero_value() {
        int milesValue = 0;
        RewardValue rewardValue = new RewardValue(milesValue);
        double expectedCashValue = 0.0;
        Assertions.assertEquals(expectedCashValue, rewardValue.getCashValue());
    }
}
