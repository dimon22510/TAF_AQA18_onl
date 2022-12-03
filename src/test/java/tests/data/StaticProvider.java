package tests.data;

import org.testng.annotations.DataProvider;

public class StaticProvider {

    @DataProvider(name = "dataForSum")
    public static Object[][] dateForSumTest() {
        return new Object[][]{
                {-2, -3, -5},
                {0, 0, 0},
                {2, 3, 5}
        };
    }
    @DataProvider(name = "dataForDivInt")
    public static Object[][] dataForDivInt() {
        return new Object[][]{
                {81, 9, 9},
                {66, 6, 11},
                {30, 10, 3},
                {100, 10, 10},
                {1000, 100, 10}
        };
    }

    @DataProvider(name = "dataForDivDouble")
    public static Object[][] dataForDivDouble() {
        return new Object[][]{
                {81.0, 9.0, 9.0},
                {66.0, 6.0, 11.0},
                {30.0, 10.0, 3.0},
                {100.0, 10.0, 10.0},
                {1000.0, 100.0, 10.0}
        };
    }
}
