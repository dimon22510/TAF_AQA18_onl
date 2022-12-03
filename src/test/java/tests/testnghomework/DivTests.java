package tests.testnghomework;

import org.testng.Assert;
import org.testng.annotations.Test;
import tests.BaseTest;
import tests.data.StaticProvider;

public class DivTests extends BaseTest {

    @Test(expectedExceptions = ArithmeticException.class, groups = "Smoke", priority = 1)
    public void divIntZeroPositiveException() {
        Assert.assertEquals(calculator.div(28, 0), 0, "Mistake,Dividing by 0 is not allowed");
    }

    @Test(expectedExceptions = ArithmeticException.class, groups = "Smoke", priority = 1)
    public void divIntZeroNegativeException() {
        Assert.assertEquals(calculator.div(-28, 0), 0, "Mistake,Dividing by 0 is not allowed");
    }

    @Test(expectedExceptions = ArithmeticException.class, groups = "Smoke", priority = 1)
    public void divIntAllZeroException() {
        Assert.assertEquals(calculator.div(0, 0), 0, "Mistake,Dividing by 0 is not allowed");
    }

    @Test(groups = "Smoke", priority = 2)
    public void divIntZeroPositive() {
        Assert.assertEquals(calculator.div(0, 10), 0, "Mistake, incorrect division");
    }

    @Test(groups = "Smoke", priority = 2)
    public void divIntZeroNegative() {
        Assert.assertEquals(calculator.div(0, -10), 0, "Mistake, incorrect division");
    }

    @Test(groups = "Smoke", priority = 3)
    public void divDoubleZeroPositiveException() throws ArithmeticException {
        Assert.assertEquals(calculator.div(10.0, 0.0), Double.POSITIVE_INFINITY);
    }

    @Test(groups = "Smoke", priority = 3)
    public void divDoubleZeroNegativeException() throws ArithmeticException {
        Assert.assertEquals(calculator.div(-10.0, 0.0), Double.NEGATIVE_INFINITY);
    }

    @Test(groups = "Smoke", priority = 3)
    public void divDoubleAllZeroException() throws ArithmeticException {
        Assert.assertEquals(calculator.div(0.0, 0.0), Double.NaN);
    }

    @Test(groups = "Smoke", priority = 4)
    public void divDoubleZeroPositive() {
        Assert.assertEquals(calculator.div(0.0, 10.0), 0, "Mistake, incorrect division");
    }

    @Test(groups = "Smoke", priority = 4)
    public void divDoubleZeroNegative() {
        Assert.assertEquals(calculator.div(0.0, -10.0), 0, "Mistake, incorrect division");
    }

    @Test(dataProvider = "dataForDivInt", dataProviderClass = StaticProvider.class, groups = "Smoke", priority = 11)
    public void testDivIntNumbers(int a, int b, int result) {
        Assert.assertEquals(calculator.div(a, b), result, "Mistake, incorrect division");
    }

    @Test(dataProvider = "dataForDivDouble", dataProviderClass = StaticProvider.class, groups = "Regression", priority = 11)
    public void testDivDoubleNumbers(double a, double b, double result) {
        Assert.assertEquals(calculator.div(a, b), result, "Mistake, incorrect division");
    }

    @Test(enabled = false)
    public void testDivIntEnabled() {
        Assert.assertEquals(calculator.div(100, 2), 50, "Mistake, incorrect division");
    }

    @Test(enabled = false)
    public void testDivDoubleEnabled() {
        Assert.assertEquals(calculator.div(80.0, 2.0), 40.0, "Mistake, incorrect division");
    }

    @Test(groups = "Smoke", priority = 10)
    public void testDivInt() {
        Assert.assertEquals(calculator.div(50, 2), 25, "Mistake, incorrect division");
    }

    @Test(dependsOnMethods = "testDivInt")
    public void testDivDouble() {
        Assert.assertEquals(calculator.div(30.0, 2.0), 15.0, "Mistake, incorrect division");
    }


    @Test(groups = "Smoke", priority = 9, description = "Test div 2 numbers")
    public void testDivIntGroup() {
        Assert.assertEquals(calculator.div(200, 2), 100, "Mistake, incorrect division");
    }

    @Test(groups = "Smoke", priority = 8)
    public void testDivIntGroup2() {
        Assert.assertEquals(calculator.div(1000, 2), 500, "Mistake, incorrect division");
    }

    @Test(groups = "Regression", priority = 8)
    public void testDivDoubleGroup() {
        Assert.assertEquals(calculator.div(6.0, 2.0), 3.0, "Mistake, incorrect division");
    }

    @Test(groups = "Regression", priority = 9)
    public void testDivDoubleGroup2() {
        Assert.assertEquals(calculator.div(24.0, 2.0), 12.0, "Mistake, incorrect division");
    }

    @Test(dependsOnMethods = "testDivDouble", alwaysRun = true)
    public void testDependsMethodsInt() {
        Assert.assertEquals(calculator.div(12, 6), 2, "Mistake, incorrect division");
    }

    @Test(groups = "Regression", invocationTimeOut = 1000, invocationCount = 3, threadPoolSize = 3, priority = 6)
    public void testDivIntInvocation() throws InterruptedException {
        Thread.sleep(400);
        Assert.assertEquals(calculator.div(20, 2), 10, "Mistake, incorrect division");
    }

    @Test(groups = "Regression", invocationTimeOut = 1000, invocationCount = 4, threadPoolSize = 4, priority = 7)
    public void testDivDoubleInvocation() throws InterruptedException {
        Thread.sleep(500);
        Assert.assertEquals(calculator.div(60.0, 2.0), 30.0, "Mistake, incorrect division");
    }

    @Test(groups = "Regression", invocationCount = 3, invocationTimeOut = 1000, threadPoolSize = 3, priority = 5)
    public void step3() {
        Assert.assertEquals(calculator.div(20, 2), 10, "Mistake, incorrect division");
    }


}
