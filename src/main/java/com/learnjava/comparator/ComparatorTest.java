package com.learnjava.comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Created by z001qgd on 1/11/17.
 */
public class ComparatorTest {

    public static void main(String[] args) {

        CompareVO compareVO2=new CompareVO();
        compareVO2.setCompareVal(3);

        CompareVO compareVO1=new CompareVO();
        compareVO1.setCompareVal(1);

        CompareVO compareVO=new CompareVO();
        compareVO.setCompareVal(2);



        List<CompareVO> compareVOList=new ArrayList<>();
        compareVOList.add(compareVO);
        compareVOList.add(compareVO2);
        compareVOList.add(compareVO1);

        System.out.println("Before Sort : "+ compareVOList);
        compareVOList.sort(new Comparator<CompareVO>() {
            @Override
            public int compare(CompareVO o1, CompareVO o2) {
                System.out.println(o1);
                System.out.println(o2);
                System.out.println("Compare value is : "+ o1.getCompareVal().compareTo(o2.getCompareVal()));
                return o1.getCompareVal().compareTo(o2.getCompareVal());
            }
        });

        System.out.println("compareVOList : " + compareVOList);
    }


}
