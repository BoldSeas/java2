package com.boldseas.unit.test;


import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class RangeTest {
    static boolean OPEN = true;

    static boolean CLOSE = false;
    @Test
    public void valueContain() throws Exception {
        //Arrange
        Range range = new Range(1, OPEN,5, CLOSE);

        //Action
        boolean result = range.contains(2);

        //Assert
        assertTrue(result);
    }
    @Test
    public void valueNotContain() throws Exception {
        Range range = new Range(1,OPEN,5,CLOSE);
        assertTrue(!range.contains(7));
    }

    @Test
    public void lowVlueNotContain() throws Exception {
        Range range = new Range(1,OPEN,5,CLOSE);
        assertTrue(!range.contains(1));
    }
    @Test
    public void highVlueContain() throws Exception {
        Range range = new Range(1,OPEN,5,CLOSE);
        assertTrue(range.contains(5));
    }
    @Test
    public void lowVlueContain() throws Exception {
        Range range = new Range(1,CLOSE,5,CLOSE);
        assertTrue(range.contains(1));
    }
    @Test(expected = IllegalArgumentException.class)
    public void rangeIlleagal(){
        Range range = new Range(1,true,1,false);
    }





}