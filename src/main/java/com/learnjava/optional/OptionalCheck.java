package com.learnjava.optional;

import java.util.Optional;

/**
 * Created by z001qgd on 2/27/17.
 */
public class OptionalCheck {

    public static void main(String[] args) {

        Optional<String> str = Optional.empty();
        System.out.println("str : " + str);
        if(str.isPresent())
            System.out.println("Str : " + str);

        str = Optional.ofNullable("Dilip");
        System.out.println("Str : " + str);

        if(str.isPresent()){
            System.out.println(str.get().toString());
        }

        CheckVO vo  = null;
        Optional<CheckVO> checkVO = Optional.ofNullable(vo);
        if(checkVO.isPresent())
                System.out.println(checkVO.get().getId());

    }
}
