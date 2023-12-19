package framework.order;

public class RebatePromotion implements PromotionInterface{
    private final double rebateRate;  // 折扣(打n折)

    public RebatePromotion(double rebateRate){
        this.rebateRate = rebateRate;
    }

    @Override
    public double usePromotion(double originalPrice) {
        return originalPrice * rebateRate;
    }
}
