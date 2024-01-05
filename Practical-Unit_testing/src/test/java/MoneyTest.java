import com.javad.Money;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static junitparams.JUnitParamsRunner.$;
import static org.junit.Assert.assertEquals;

@RunWith(JUnitParamsRunner.class)
public class MoneyTest {

    private static final Object[] moneyValues() {
        return $(
                $(10, "USD"),
                $(20, "EUR")
        );
    }

    @Test
    @Parameters(method = "moneyValues")
    public void moneyWithParamTest(int amount, String currency) {

        var money = new Money(amount, currency);
        assertEquals(money.getAmount(), amount);
        assertEquals(money.getCurrency(), currency);
    }
}