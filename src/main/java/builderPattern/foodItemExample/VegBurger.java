package builderPattern.foodItemExample;

import builderPattern.foodItemExample.Burger;

/**
 * 描述：
 *
 * @author chengqiang_zhu
 * @date 2022/10/10
 */
public class VegBurger extends Burger {

    @Override
    public float price() {
        return 25.0f;
    }

    @Override
    public String name() {
        return "素汉堡";
    }
}