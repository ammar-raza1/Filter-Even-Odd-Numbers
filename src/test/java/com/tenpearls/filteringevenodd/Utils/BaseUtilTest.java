package com.tenpearls.filteringevenodd.Utils;

import com.tenpearls.filteringevenodd.FilteringevenoddApplicationTests;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.MockitoAnnotations;

public class BaseUtilTest extends FilteringevenoddApplicationTests {


    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void checkIfEvenTrueTests() {

        Assert.assertTrue(BaseUtil.checkIfEven(4));
    }

    @Test
    public void checkIfEvenFalseTests() {

        Assert.assertFalse(BaseUtil.checkIfEven(1));
    }

}
