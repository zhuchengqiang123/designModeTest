package builderPattern.foodItemExample;
import builderPattern.foodItemExample.Bottle;
import builderPattern.foodItemExample.Item;
import builderPattern.foodItemExample.Packing;

/**
 * 描述：
 *
 * @author chengqiang_zhu
 * @date 2022/10/10
 */
public abstract class ColdDrink implements Item {

    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}