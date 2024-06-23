/**
 * 1. Creates 2 Rational objects, "rational0" and "rational1"
 * 2. Checks the numerator and denominator of "rational0" and the
 *    float value of "rational1"
 **/
@Test
public void test3() throws Throwable {
    Rational rational0 = new Rational(1L, 3215L);
    Rational rational1 = rational0.abs();
    assertEquals(1L, rational0.numerator);
    assertEquals(3215L, rational0.denominator);
    assertEquals(3.11041E-4F, rational1.floatValue(), 0.0);
}

