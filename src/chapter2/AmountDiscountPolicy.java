package chapter2;

public class AmountDiscountPolicy extends DefaultDiscountPolicy{
    private Money discountAmount;
    public AmountDiscountPolicy(Money discountAmount, DiscountCondition ... conditions) {
        super(conditions);
        this.discountAmount = discountAmount;
    }

    @Override
    public Money calculateDiscountAmount(Screening screening) {
        return discountAmount;
    }
}
