package guppy.behavior.good;

import guppy.behavior.Apple;

/**
 * Created by guppy.kang on 2017. 12. 26.
 * email : guppy.kang@kakaocorp.com
 */
public class AppleGreenColorPredicate implements ApplePredicate {
    @Override
    public boolean test(Apple apple) {
        return "green".equals(apple.getColor());
    }
}
