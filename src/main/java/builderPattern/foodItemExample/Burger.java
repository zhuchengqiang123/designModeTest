package builderPattern.foodItemExample;

import builderPattern.foodItemExample.Item;
import builderPattern.foodItemExample.Packing;
import builderPattern.foodItemExample.Wrapper;

/**
 * 描述：
 *
 * @author chengqiang_zhu
 * @date 2022/10/10
 */
public abstract class Burger implements Item {

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}