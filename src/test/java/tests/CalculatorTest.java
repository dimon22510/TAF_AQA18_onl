package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTest extends BaseTest {

    @Test
    public void testSum(){
        Assert.assertEquals(calculator.sum(2,3), 5, "Incorrect sum");
    }

    @Test(enabled = false)               // ��������� ���� �� �������
    public void testSum1(){
        Assert.assertEquals(calculator.sum(2,3), 5, "Incorrect sum");
    }

    @Test(description = "Test c opisaniem")    //�������� ��� ����������
    public void testSum2(){
        Assert.assertEquals(calculator.sum(2,3), 5, "Incorrect sum");
    }

    @Test(testName = "Test with Name")    //������ ��������� ����� � ����������
    public void testSum3(){
        Assert.assertEquals(calculator.sum(2,3), 5, "Incorrect sum");
    }

    @Test(timeOut = 1000)    //������������� ����� �� ������� ������ ������ ����, ���� �� ������, �� ������
    public void testSum4() throws InterruptedException {
        Thread.sleep(500);
    }

    @Test(invocationCount = 3, invocationTimeOut = 1000, threadPoolSize = 3)    //���� ����������� ������������� ��� ���. ����������� ���������������. ���������� ��� ������� ��� ��������� ������� ���������� �����
    public void testSum5() throws InterruptedException {
        Thread.sleep(500);
        Assert.assertEquals(calculator.sum(2,3), 5, "Incorrect sum");
    }


}
