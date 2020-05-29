package com.tenpearls.filteringevenodd.service.impl;

import com.tenpearls.filteringevenodd.Utils.BaseUtil;
import com.tenpearls.filteringevenodd.service.Sort;

import java.util.List;

public class SortImpl implements Sort {


    @Override
    public List<Integer> getSortedOddFirstEvenLastList(List<Integer> list) {

        if (list == null || list.isEmpty()) return null;

        list.remove(Integer.valueOf(0));    // Remove Zero from list if exist
        int countEven = 0;
        int length = list.size();
        for (int i = 0; i < length; i++) {
            if (BaseUtil.checkIfOdd(list.get(i))) {
                countEven++;
            }
        }
        int i = 0;
        int j = i + 1;
        while (i != countEven) {
            if (BaseUtil.checkIfOdd(list.get(i))) {
                i++;
                j = i + 1;
            } else if (BaseUtil.checkIfEven(list.get(i)) && j < length) {
                int temp = list.get(i);
                list.set(i, list.get(j));
                list.set(j, temp);
                j++;
            }
        }


        return list;
    }
}
