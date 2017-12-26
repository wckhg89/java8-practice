package guppy.behavior;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by guppy.kang on 2017. 12. 26.
 * email : guppy.kang@kakaocorp.com
 */

public class FilterApple {


    public static List<Apple> filterGreenApples(List<Apple> inventory) {
        List<Apple> result = new ArrayList<>();

        for (Apple apple : inventory) {
            // 필요 조건 (요구사항 변경으로 빨간색으로 바뀌면)
            if ("green".equals(apple.getColor())) {
                result.add(apple);
            }
        }

        return result;
    }

    // 색깔에 대한 요구사항 변경에 대한 대응
    public static List<Apple> filterApplesByColor(List<Apple> inventory, String color) {
        List<Apple> result = new ArrayList<>();

        for (Apple apple : inventory) {
            // 필요 조건 (요구사항 변경으로 빨간색으로 바뀌면)
            if (color.equals(apple.getColor())) {
                result.add(apple);
            }
        }

        return result;
    }

    // 색깔에 대한 요구사항 변경에 대한 대응
    public static List<Apple> filterApplesByWeight(List<Apple> inventory, int weight) {
        List<Apple> result = new ArrayList<>();

        for (Apple apple : inventory) {
            // 요구사항이 무게로 바뀌면 나머지는 다 같은데 해당 조건 문만 바뀌게 된다. (DRY 원칙에 위배)
            if (apple.getWeight() > weight) {
                result.add(apple);
            }
        }

        return result;
    }


    public static List<Apple> filterAppleByAll(List<Apple> inventory, String color, int weight, boolean flag) {
        List<Apple> result = new ArrayList<>();

        for (Apple apple : inventory) {
            // flag 를 보고 색또는 무게로 판단한다.. 흠.. flag 가 의미하는 바가 모호하다.
            if ((flag && apple.getColor().equals(color)) || (!flag && apple.getWeight() > weight)) {
                result.add(apple);
            }
        }

        return result;
    }


}

