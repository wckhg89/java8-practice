package guppy.behavior.good;

import guppy.behavior.Apple;

/**
 * Created by guppy.kang on 2017. 12. 26.
 * email : guppy.kang@kakaocorp.com
 */
public interface ApplePredicate {
    // 조건만 주고 구현을 다르게 둠 (전략 디자인 패턴
    // 캡슐화 하는 알고리즘 패밀리를 정의해둔 다음에 런타임에 알고리즘을 선택하는 기법
    // 예제에서는 ApplePredicate가 알고리즘 패밀리고 AppleHeavyWeightPredicate 와 AppleGreenColorPredicate 가 전략이다
    boolean test (Apple apple);

}
