package chapter2;

public class NonDiscountPolicy extends DiscountPolicy{

    @Override
    protected Money getDiscountAmount(Screening Screening) {
        return Money.ZERO;
    }
}
