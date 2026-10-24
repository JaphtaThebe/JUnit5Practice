package com.jumpstart;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@DisplayName("Calculator Test Class")
class CalculatorTest {

    private Calculator calculator;


    @BeforeAll
    static void beforeAll() {
        System.out.println("BEFORE ALL TESTS 1");
    }

    @BeforeEach
    void beforeEach() {
        calculator = new Calculator();
        System.out.println("BEFORE EACH TEST 2");
    }

    @Test
    @DisplayName("Should add two numbers correctly")
    void addition() {
        System.out.println("RUNNING ADDITION TEST 3");
        assertEquals(2, calculator.add(1, 1));
    }

    @Test
    void anotherAddition() {
        System.out.println("RUNNING ANOTHER ADDITION TEST 3");
        assertEquals(5, calculator.add(2, 3));
    }

    @Test
    @DisplayName("Should add two negative numbers correctly")
    void addNegativeNumbers(){
        System.out.println("RUNNING ADD NEGATIVE NUMBERS TEST 3");
        assertEquals(-10,calculator.add(-5,-5));
    }
/*
    @Test
    @DisplayName("Should subtract two numbers correctly")
    void subtraction() {
        assertEquals(2, calculator.subtract(5, 3));
    }

    @Test
    @DisplayName("Should identify a positive number")
    void positiveNumber() {
        assertTrue(5 > 0);
    }

    @Test
    @DisplayName("Should reject division by zero")
    void divisionByZero() {
        assertThrows(
                ArithmeticException.class,
                () -> calculator.divide(10, 0)
        );
    }*/


    @Test
    @DisplayName("Should run when the test environment is available")
    void testEnvironment() {

        System.out.println("Test Environment Test");
        boolean environmentAvailable = true;

        assumeTrue(environmentAvailable);

        assertEquals(5, calculator.add(2, 3));
    }
    @AfterEach
    void afterEach() {
        System.out.println("AFTER EACH TEST 4");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("AFTER ALL TESTS 5");
    }
}