package com.sample.bad;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import static junit.framework.TestCase.assertEquals;
import static org.mockito.Mockito.when;
import static org.mockito.MockitoAnnotations.initMocks;

//used a mock here ... please run both tests and compare to see the difference
// Don't look at system design here :D
public class ATest {

    private A subject;

    @Mock
    private B dependency;

    @Before
    public void setUp() {
        initMocks(this);

        subject = new A(dependency);
    }

    @Test
    public void fetchDetailsFromServerOne() {
        int expectedResult = 1;
        when(dependency.doXWork()).thenReturn(expectedResult);

        int result = subject.fetchResultFromServerOne();

        assertEquals(expectedResult, result);
    }

    @Test
    public void fetchDetailsFromServerTwo() {
        int expectedResult = 2;
        when(dependency.doYWork()).thenReturn(expectedResult);

        int result = subject.fetchResultFromServerTwo();

        assertEquals(expectedResult, result);
    }

    @Test
    public void fetchDetailsFromServerThree() {
        int expectedResult = 3;
        when(dependency.doZWork()).thenReturn(expectedResult);

        int result = subject.fetchResultFromServerThree();

        assertEquals(expectedResult, result);
    }

    @After
    public void tearDown() {
        subject = null;
    }
}