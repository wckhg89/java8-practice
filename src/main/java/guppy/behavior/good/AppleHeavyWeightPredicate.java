package guppy.behavior.good;

import guppy.behavior.Apple;

import java.util.function.Predicate;

/**
 * Created by guppy.kang on 2017. 12. 26.
 * email : guppy.kang@kakaocorp.com
 */
public class AppleHeavyWeightPredicate implements ApplePredicate {
    @Override
    public boolean test(Apple apple) {
        return apple.getWeight() > 150;
    }
}
