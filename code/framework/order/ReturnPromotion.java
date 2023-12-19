package framework.order;

public class ReturnPromotion implements PromotionInterface {
    private final double threshold;  // 满减所需费用
    private final double returnMoney;  // 返减

    public ReturnPromotion(double threshold, double returnMoney) {
        this.threshold = threshold;
        this.returnMoney = returnMoney;
    }

    @Override
    public double usePromotion(double originalPrice) {
        return originalPrice >= threshold ? originalPrice - returnMoney : originalPrice;
    }
}
