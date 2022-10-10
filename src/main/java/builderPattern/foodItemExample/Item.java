package builderPattern.foodItemExample;

/**
 * 描述：
 *
 * @author chengqiang_zhu
 * @date 2022/10/10
 */
public interface Item {
    public String name();
    public Packing packing();
    public float price();
}
