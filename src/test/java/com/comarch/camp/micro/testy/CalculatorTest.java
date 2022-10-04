package com.comarch.camp.micro.testy;

import org.junit.*;

public class CalculatorTest {

    static Calculator calculator = new Calculator();

    public CalculatorTest() {
        System.out.println("Kostruktor klasy z testami !!");
    }

    @Before
    public void prepare() {
        System.out.println("Przygotowanie do testu !!");
    }

    @After
    public void clean() {
        System.out.println("Sprzatanie po tescie !!");
    }

    @BeforeClass
    public static void prepareForAll() {
        System.out.println("Przygotowanie przed wszystkimi testami !!");
    }

    @AfterClass
    public static void cleanAfterAllTests() {
        System.out.println("Sprzatanie po wszystkich testach !!");
    }

    @Test
    public void addTwoPositiveTest() {
        //przygotowanie scenariusza testowego
        int a = 7;
        int b = 5;
        int expectedResult = 12;

        //wykonanie testu
        int actual = calculator.add(a, b);

        //asercja - sprawdzenie wynikow testu
        Assert.assertEquals(expectedResult, actual);
    }

    @Test
    public void addPositiveAndNegativeTest() {
        int a = 7;
        int b = -5;
        int expectedResult = 2;

        int actual = calculator.add(a, b);

        Assert.assertEquals(expectedResult, actual);
    }

    @Test
    public void addZeroAndPositiveTest() {
        int a = 0;
        int b = 6;
        int expectedResult = 6;

        int actual = calculator.add(a, b);

        Assert.assertEquals(expectedResult, actual);
    }

    @Test
    public void addZeroAndNegativeTest() {
        int a = 0;
        int b = -5;
        int expectedResult = -5;

        int actual = calculator.add(a, b);

        Assert.assertEquals(expectedResult, actual);
    }

    @Test
    public void addTwoZerosTest() {
        int a = 0;
        int b = 0;
        int expectedResult = 0;

        int actual = calculator.add(a, b);

        Assert.assertEquals(expectedResult, actual);
    }

    @Test
    public void addTwoNegativeTest() {
        int a = -7;
        int b = -5;
        int expectedResult = -12;

        int actual = calculator.add(a, b);

        Assert.assertEquals(expectedResult, actual);
    }

    @Test
    public void multiplyTwoPositiveTest() {
        int a = 5;
        int b = 7;
        int expectedResult = 35;

        int actual = calculator.multiply(a, b);

        Assert.assertEquals(expectedResult, actual);
    }

    @Test
    public void multiplyTwoZerosTest() {
        int a = 0;
        int b = 0;
        int expectedResult = 0;

        int actual = calculator.multiply(a, b);

        Assert.assertEquals(expectedResult, actual);
    }

    @Test
    public void multiplyZeroAndPositiveTest() {
        int a = 0;
        int b = 6;
        int expectedResult = 0;

        int actual = calculator.multiply(a, b);

        Assert.assertEquals(expectedResult, actual);
    }

    @Test
    public void multiplyTwoNegativeTest() {
        int a = -8;
        int b = -4;
        int expectedResult = 32;

        int actual = calculator.multiply(a, b);

        Assert.assertEquals(expectedResult, actual);
    }

    @Test
    public void multiplyPositiveAndNegativeTest() {
        int a = -8;
        int b = 4;
        int expectedResult = -32;

        int actual = calculator.multiply(a, b);

        Assert.assertEquals(expectedResult, actual);
    }

    @Test
    public void divideTwoPositiveTest() {
        int a = 7;
        int b = 2;
        double expectedResult = 3.5;

        double actual = calculator.divide(a, b);

        Assert.assertEquals(expectedResult, actual, 0.001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void divideByZeroTest() {
        int a = 5;
        int b = 0;

        calculator.divide(a, b);
    }
}
