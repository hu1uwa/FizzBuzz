package com.ztb;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by z on 2017/8/10.
 */
public class FizzBuzzTest {
    FizzBuzz fizzBuzz;
    @Before
    public void setUp() throws Exception {
        fizzBuzz = new FizzBuzz();
        fizzBuzz.setFirstnum(3,5,7);
    }

    @Test
    public void should_equals_1() throws Exception {
        assertEquals("1",fizzBuzz.play(1));
    }

    @Test
    public void should_equals_fizz() throws Exception {
        assertEquals("Fizz",fizzBuzz.play(3));
    }

    @Test
    public void should_equals_buzz() throws Exception {
        assertEquals("Buzz",fizzBuzz.play(5));

    }

    @Test
    public void shoudl_equals_whizz() throws Exception {
        assertEquals("Whizz",fizzBuzz.play(7));

    }
}
