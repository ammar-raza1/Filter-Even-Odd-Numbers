package com.tenpearls.filteringevenodd.service;


import com.tenpearls.filteringevenodd.FilteringevenoddApplicationTests;
import com.tenpearls.filteringevenodd.service.impl.SortImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortImplTests extends FilteringevenoddApplicationTests {

    @InjectMocks
    SortImpl sort;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void getSortedOddFirstEvenLastListIsNullTests() {

        Assert.assertNull(sort.getSortedOddFirstEvenLastList(null));
    }

    @Test
    public void getSortedOddFirstEvenLastListIsEmptyTests() {

        List<Integer> unsortedList = new ArrayList<>();
        List<Integer> integers = sort.getSortedOddFirstEvenLastList(unsortedList);

        Assert.assertNull(integers);
    }

    @Test
    public void getSortedOddFirstEvenLastListIsNotNullTests() {

        List<Integer> unsortedList = Arrays.asList(3, 1, 10, 4, 8, 5, 2, 7, 6);
        List<Integer> integers = sort.getSortedOddFirstEvenLastList(unsortedList);

        Assert.assertNotNull(integers);
    }

    @Test
    public void getSortedOddFirstEvenLastListCase1Tests() {

        List<Integer> unsortedList = Arrays.asList(3, 1, 10, 4, 8, 5, 2, 7, 6);
        List<Integer> resultList = sort.getSortedOddFirstEvenLastList(unsortedList);
        List<Integer> expectedList = Arrays.asList(3, 1, 5, 7, 10, 4, 8, 2, 6);

        Assert.assertEquals(expectedList, resultList);
    }

    @Test
    public void getSortedOddFirstEvenLastListCase2Tests() {

        List<Integer> unsortedList = Arrays.asList(9, 1, 4, 8, 2, 7, 8);
        List<Integer> resultList = sort.getSortedOddFirstEvenLastList(unsortedList);
        List<Integer> expectedList = Arrays.asList(9, 1, 7, 4, 8, 2, 8);

        Assert.assertEquals(expectedList, resultList);
    }


    @Test
    public void getSortedOddFirstEvenLastListCase3NegativeTests() {

        List<Integer> unsortedList = Arrays.asList(-9, 1, -4, 8, 2, -7, 10);
        List<Integer> resultList = sort.getSortedOddFirstEvenLastList(unsortedList);
        List<Integer> expectedList = Arrays.asList(-9, 1, -7, -4, 8, 2, 10);

        Assert.assertEquals(expectedList, resultList);
    }

    @Test
    public void getSortedOddFirstEvenLastListCase4WithZeroAsElementTests() {

        List<Integer> unsortedList = new ArrayList<>();
        unsortedList.addAll(Arrays.asList(-9, 1, 0, -6, 8, 2, -11, 6));
        List<Integer> resultList = sort.getSortedOddFirstEvenLastList(unsortedList);
        List<Integer> expectedList = Arrays.asList(-9, 1, -11, -6, 8, 2, 6);

        Assert.assertEquals(expectedList, resultList);
    }

    @Test
    public void getSortedOddFirstEvenLastListCase5WithDuplicateTests() {

        List<Integer> listOfIntegers = Arrays.asList(-9, 6, 7, -4, 4, 2, -7, 6, 3, 11);
        List<Integer> resultList = sort.getSortedOddFirstEvenLastList(listOfIntegers);
        List<Integer> expectedList = Arrays.asList(-9, 7, -7, 3, 11, 6, -4, 4, 2, 6);

        Assert.assertEquals(expectedList, resultList);
    }


}
