package abstractFactoryPattern;


/**
 * 描述：
 *
 * @author chengqiang_zhu
 * @date 2022/10/9
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Circle...");
    }
}
