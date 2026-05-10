/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */


import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


/**
 *
 * @author DELL
 */
public class DiscountCalculatorTest {
    
    @ParameterizedTest
    @CsvSource({
        "REGULAR,5,true",
        "REGULAR,15,false",
        "PREMIUM,5,false",
        "PREMIUM,15,true"
    })
    void testDiscountCalculation(String customerType,
                                 int totalOrders,
                                 boolean subscribed) {

    }
}
