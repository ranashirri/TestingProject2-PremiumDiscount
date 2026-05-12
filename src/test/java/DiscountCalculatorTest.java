/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */


import com.testingteam.discountcalculatorsystem.DiscountCalculator;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.api.Test;

/**
 *
 * @author DELL
 */
public class DiscountCalculatorTest {
    
    @ParameterizedTest
    @CsvSource({
        "NEW,5,false,5",
        "NEW,5,true,7",
        "REGULAR,5,false,8",
        "REGULAR,15,true,15",
        "PREMIUM,5,true,12",
        "PREMIUM,15,false,15"
    })
    void testDiscountCalculation(String customerType,
                             int totalOrders,
                             boolean subscribed,
                             int expectedDiscount) {
        int result = DiscountCalculator.calculateDiscount(
        customerType,
        totalOrders,
        subscribed);

        assertEquals(expectedDiscount, result);
    }
    
    @Test
    void testInfeasibleCombination() {

        assertThrows(IllegalArgumentException.class, () -> {

            DiscountCalculator.calculateDiscount(
                    "NEW",
                    15,
                    true);
        });
    }
}
