package framework.order;

public interface PromotionInterface {
    // 促销策略接口 不同的促销策略都要实现这一接口 计算不同的促销
    double usePromotion(double originalPrice);
}
