package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import tests.testnghomework.Calculator;

public class GroupsTest {
    Calculator calculator = new Calculator();

    @Test (groups = "smoke")
    public void stepb() {
        Assert.assertEquals(calculator.sum(2, 3), 5, "�������� ����� ... ");
    }

    @Test(groups = "regression")
    public void stepa() {
        Assert.assertEquals(calculator.sum(2, 3), 5, "�������� ����� ... ");
    }

    @Test (groups = "regression")
    public void stepd() {
        Assert.assertEquals(calculator.sum(2, 3), 5, "�������� ����� ... ");
    }

    @Test (groups = {"smoke", "regression"})
    public void stepc() {
        Assert.assertEquals(calculator.sum(2, 3), 5, "�������� ����� ... ");
    }

}
