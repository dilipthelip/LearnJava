package com.learnjava.optional;

import com.sun.tools.javac.comp.Check;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by z001qgd on 3/16/17.
 */
public class IterateCheck {

    public static void main(String[] args) {

        List<CheckVO> checkVOList = new ArrayList<CheckVO>();

        CheckVO checkVO = new CheckVO();

        for (int i=0 ; i<4; i ++){

            checkVO.setId(Integer.toString(i));
            checkVOList.add(checkVO);
        }

        System.out.println(checkVOList);

    }
}
