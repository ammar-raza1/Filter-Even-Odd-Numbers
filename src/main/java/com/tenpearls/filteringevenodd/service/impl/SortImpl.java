package com.tenpearls.filteringevenodd.service.impl;

import com.tenpearls.filteringevenodd.Utils.BaseUtil;
import com.tenpearls.filteringevenodd.service.Sort;

import java.util.ArrayList;
import java.util.List;

public class SortImpl implements Sort {


    @Override
    public List<Integer> getSortedOddFirstEvenLastList(List<Integer> list) {

        if (list == null || list.isEmpty()) return null;

        list.remove(Integer.valueOf(0));    // Remove Zero from list if exist

        List<Integer> oddNumberList = new ArrayList<>();
        List<Integer> evenNumberList     = new ArrayList<>();

        for (Integer anInteger : list) {
            if (BaseUtil.checkIfEven(anInteger)) {
                evenNumberList.add(anInteger);
            } else {
                oddNumberList.add(anInteger);
            }
        }
        oddNumberList.addAll(evenNumberList);
        return oddNumberList;
    }
}
