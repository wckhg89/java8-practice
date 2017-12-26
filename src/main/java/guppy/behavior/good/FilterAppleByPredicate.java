package guppy.behavior.good;

import guppy.behavior.Apple;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by guppy.kang on 2017. 12. 26.
 * email : guppy.kang@kakaocorp.com
 */
public class FilterAppleByPredicate {

    public static List<Apple> filterApples (List<Apple> inventory, ApplePredicate p) {
        List<Apple> result = new ArrayList<>();

        for (Apple apple : inventory) {
            // 동작 파라미터화
            // 즉 메소드가 다양한 동작 (또는 전략)을 받아서 내부적으로 다양한 동작을 수행
            if (p.test(apple)) {
                result.add(apple);
            }
        }

        return result;
    }

}
