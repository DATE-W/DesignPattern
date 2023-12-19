package framework.order;

public class PromotionContext {
    private final PromotionInterface promotionInterface;

    public PromotionContext(String promotionType){
        this.promotionInterface = createPromotion(promotionType);
    }

    private PromotionInterface createPromotion(String promotionType){
        return switch (promotionType) {
            case "discount" -> new RebatePromotion(0.9);  // 打九折
            case "threshold" -> new ReturnPromotion(100, 20);  // 满100减20
            default -> null;  // 没有促销
        };
    }

    public double applyPromotion(double originalPrice){
        if(promotionInterface != null){
            return promotionInterface.usePromotion(originalPrice);  // 有折扣
        }
        return originalPrice;  // 没有折扣
    }
}
