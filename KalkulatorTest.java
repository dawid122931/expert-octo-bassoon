import org.junit.jupiter.api.Test;
import  static org.junit.jupiter.api.Assertions.assertEquals;

public class KalkulatorTest {
    @Test
    public void twoPlusTwoShouldReturnFour(){
        Kalkulator kalkulator = new Kalkulator();
        assertEquals(4,kalkulator.add(2,2));
    }
    @Test
    public void minusTwoPlusTenShouldReturnEight(){
        Kalkulator kalkulator = new Kalkulator();
        assertEquals(8,kalkulator.add(-2,10));
    }
    @Test
    public void TwoPlusMinusSevenShouldReturnMinusFive(){
        Kalkulator kalkulator = new Kalkulator();
        assertEquals(-5,kalkulator.add(2,-7));
    }
    @Test
    public void minusTwoPlusMinusThreeShouldReturnMinusFive(){
        Kalkulator kalkulator = new Kalkulator();
        assertEquals(-5,kalkulator.add(-2,-3));
    }


    @Test
    public void twoMinusTwoShouldReturnZero(){
        Kalkulator kalkulator = new Kalkulator();
        assertEquals(0,kalkulator.subtract(2 , 2));
    }
    @Test
    public void MinusTwoMinusFourShouldReturnMinusSix(){
        Kalkulator kalkulator = new Kalkulator();
        assertEquals(-6,kalkulator.subtract(-2 , 4));
    }
    @Test
    public void sixMinusMinusFourShouldReturnTen(){
        Kalkulator kalkulator = new Kalkulator();
        assertEquals(10,kalkulator.subtract(6 , -4));
    }
    @Test
    public void minusTwoMinusMinusOneShouldReturnMinusOne(){
        Kalkulator kalkulator = new Kalkulator();
        assertEquals(-1,kalkulator.subtract(-2 , -1));
    }

    @Test
    public void twoTimesFourShouldReturnEight(){
        Kalkulator kalkulator = new Kalkulator();
        assertEquals(8,kalkulator.multiply(2,4));
    }
    @Test
    public void minusFourTimesFourShouldReturnMinusSixteen(){
        Kalkulator kalkulator = new Kalkulator();
        assertEquals(-16,kalkulator.multiply(-4,4));
    }
    @Test
    public void fiveTimesMinusTwoShouldReturnMinusTen(){
        Kalkulator kalkulator = new Kalkulator();
        assertEquals(-10,kalkulator.multiply(5,-2));
    }
    @Test
    public void MinusSixTimesMinusThreeShouldReturnEighteen(){
        Kalkulator kalkulator = new Kalkulator();
        assertEquals(18,kalkulator.multiply(-6,-3));
    }
    @Test
    public void zeroTimesFiveShouldReturnZero(){
        Kalkulator kalkulator = new Kalkulator();
        assertEquals(0,kalkulator.multiply(0,5));
    }

    @Test
    public void fourDivideIntoTwoShouldReturnTwo(){
        Kalkulator kalkulator = new Kalkulator();
        assertEquals(2,kalkulator.divide(4,2));
    }
    @Test
    public void MinusSixDivideIntoThreeShouldReturnMinusTwo(){
        Kalkulator kalkulator = new Kalkulator();
        assertEquals(-2,kalkulator.divide(-6,3));
    }
    @Test
    public void tenDivideIntoMinusTwoShouldReturnMinusFive(){
        Kalkulator kalkulator = new Kalkulator();
        assertEquals(-5,kalkulator.divide(10,-2));
    }
    @Test
    public void minusFifteenDivideIntoMinusFiveShouldReturnThree(){
        Kalkulator kalkulator = new Kalkulator();
        assertEquals(3,kalkulator.divide(-15,-5));
    }
    @Test
    public void EightDivideIntoZeroShouldReturnError(){
        Kalkulator kalkulator = new Kalkulator();
        assertEquals(0,kalkulator.divide(8,0));
    }

    @Test
    public void threeTOThePowerOfTwoShouldReturnNine(){
        Kalkulator kalkulator = new Kalkulator();
        assertEquals(9,kalkulator.power(3,2));
    }
    @Test
    public void MinusThreeTOThePowerOfThreeShouldReturnMinusTwentySeven(){
        Kalkulator kalkulator = new Kalkulator();
        assertEquals(-27,kalkulator.power(-3,3));
    }
    @Test
    public void tenTOThePowerOfMinusOneShouldReturnOneTenth(){
        Kalkulator kalkulator = new Kalkulator();
        assertEquals(0.1,kalkulator.power(10,-1));
    }
    @Test
    public void twoTOThePowerOfZeroShouldReturnOne(){
        Kalkulator kalkulator = new Kalkulator();
        assertEquals(1,kalkulator.power(2,0));
    }

    @Test
    public void rootOfFourShouldReturnTwo(){
        Kalkulator kalkulator = new Kalkulator();
        assertEquals(2,kalkulator.sqrt(4));
    }
    @Test
    public void rootOfMinussixteenShouldReturnError(){
        Kalkulator kalkulator = new Kalkulator();
        assertEquals(0,kalkulator.sqrt(-16));
    }
    @Test
    public void rootOfZeroShouldReturnZero(){
        Kalkulator kalkulator = new Kalkulator();
        assertEquals(0,kalkulator.sqrt(0));
    }
}
