package builderPattern.foodItemExample;

/**
 * 描述：
 *
 * @author chengqiang_zhu
 * @date 2022/10/10
 */
public class Bottle implements Packing {

    @Override
    public String pack() {
        return "罐装";
    }
}