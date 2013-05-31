package org.training.tdd.test;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

/**
 * Created by IntelliJ IDEA.
 * User: haopt
 * Date: 5/31/13
 * Time: 2:01 PM
 * To change this template use File | Settings | File Templates.
 */
public class TestMathService {
    private MathService mathService;

    @Test
    public void testWithParamNull() {
        assertEquals(0, mathService.methodAdd(null));
    }

    @Test
    public void testWithParamNotNullWithEmptyString() {
        assertEquals(0, mathService.methodAdd(""));
    }

    @Test
    public void testWithOneNumber() {
        assertEquals(1, mathService.methodAdd("1"));
    }

    @Test
    public void testWithParamTwoNumber() {
        assertEquals(3, mathService.methodAdd("1,2"));
    }

    @Test
    public void testWithParamMuchNumber() {
        assertEquals(10, mathService.methodAdd("1,2,3,4"));
    }

    @Test
    public void testWithParamDelimiter() {
        assertEquals(3, mathService.methodAdd("//;\n1;2"));
    }

    @Test
    public void testWithParamNegativeNumber() {
       assertEquals(-1, mathService.methodAdd("-1,3,4"));
    }
}
