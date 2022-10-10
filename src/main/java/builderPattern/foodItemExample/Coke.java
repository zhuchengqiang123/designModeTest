package builderPattern.foodItemExample;

import builderPattern.foodItemExample.ColdDrink;

/**
 * 描述：
 *
 * @author chengqiang_zhu
 * @date 2022/10/10
 */
public class Coke extends ColdDrink {

    @Override
    public float price() {
        return 30.0f;
    }

    @Override
    public String name() {
        return "可乐";
    }
}