package com.sample.good;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

//used a spy here instead of mock... please run both tests and compare to see the difference
// Don't look at system design here :D
public class ATest {
    private A subject;

    private AInterface dependency = new AInterfaceSpy();

    @Before
    public void setUp() {
        subject = new A(dependency);
    }

    @Test
    public void fetchDetailsFromServerOne() {
        int result = subject.fetchResultFromServerOne();

        assertEquals(100, result);
    }

    @Test
    public void fetchDetailsFromServerTwo() {
        int result = subject.fetchResultFromServerTwo();

        assertEquals(200, result);
    }

    @Test
    public void fetchDetailsFromServerThree() {
        int result = subject.fetchResultFromServerThree();

        assertEquals(300, result);
    }

    @After
    public void tearDown() {
        subject = null;
    }
}