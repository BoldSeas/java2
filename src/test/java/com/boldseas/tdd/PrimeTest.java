package com.boldseas.tdd;

import org.junit.Test;
import java.util.Arrays;

import static junit.framework.Assert.assertEquals;

/**
 * Created by bykj on 2015/9/6.
 */
public class PrimeTest {
    Prime prime = new Prime();
    @Test
    public void one_has_no_prime_factory(){
        assertEquals(Arrays.asList(),prime.factors(1));
    }
    @Test
    public void prime_factor_of_2_is_2(){
        assertEquals(Arrays.asList(2),prime.factors(2));
    }
    @Test
    public void prime_factor_of_3_is_3(){
        assertEquals(Arrays.asList(3),prime.factors(3));
    }
    @Test
    public void prime_factor_of_4_is_2_and_2(){
        assertEquals(Arrays.asList(2,2),prime.factors(4));
    }
    @Test
    public void prime_factor_of_6_is_2_and_3(){
        assertEquals(Arrays.asList(2,3),prime.factors(6));
    }
    @Test
    public void prime_factor_of_8_is_2_2_and_2(){
        assertEquals(Arrays.asList(2,2,2),prime.factors(8));
    }
    @Test
    public void prime_factor_of_9_is_3_and_3(){
        assertEquals(Arrays.asList(3,3),prime.factors(9));
    }
}
