package tests.testnghomework;

import org.testng.Assert;
import org.testng.annotations.Test;
import tests.BaseTest;
import tests.utils.Retry;

public class RetryDivTest extends BaseTest {
    private int attempt = 1;

    @Test (retryAnalyzer = Retry.class)
    public void flakyDIvTest() {
        if (attempt == 5) {
            Assert.assertEquals(calculator.div(10,5),2, "Mistake");
        } else {
            attempt++;
            System.out.println("Try number is: " + attempt);
            throw new NullPointerException();
        }
    }


}
