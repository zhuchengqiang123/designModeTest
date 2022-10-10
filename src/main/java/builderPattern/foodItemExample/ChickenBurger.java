package builderPattern.foodItemExample;

import builderPattern.foodItemExample.Burger;

/**
 * 描述：
 *
 * @author chengqiang_zhu
 * @date 2022/10/10
 */
public class ChickenBurger extends Burger {

    @Override
    public float price() {
        return 50.5f;
    }

    @Override
    public String name() {
        return "鸡肉汉堡";
    }
}