package builderPattern.foodItemExample;

import builderPattern.foodItemExample.ColdDrink;

/**
 * 描述：
 *
 * @author chengqiang_zhu
 * @date 2022/10/10
 */
public class Pepsi extends ColdDrink {

    @Override
    public float price() {
        return 35.0f;
    }

    @Override
    public String name() {
        return "百世";
    }
}
