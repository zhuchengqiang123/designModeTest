package abstractFactoryPattern;


/**
 * 描述：
 *
 * @author chengqiang_zhu
 * @date 2022/10/9
 */
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Square...");
    }
}
