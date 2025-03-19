package chapter2;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class DefaultDiscountPolicy implements DiscountPolicy{

    private List<DiscountCondition> conditions = new ArrayList<>();
    public DefaultDiscountPolicy(DiscountCondition ... conditions) {
        this.conditions = Arrays.asList(conditions);
    }
}
