package tests.testnghomework;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DivParam {

    @Parameters({"Number1", "Number2","result"})
    @Test
    public void divParamTest(@Optional("50") String number1,
                             @Optional("2") String number2,
                             @Optional("25") String result) {
        System.out.println("If the number - " + number1 + " divide by the number - " + number2 + ", we get - "
                 + result);
    }

}
