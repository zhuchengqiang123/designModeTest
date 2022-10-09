package abstractFactoryPattern;

/**
 * 描述：
 *
 * @author chengqiang_zhu
 * @date 2022/10/9
 */
public class Red implements Color {

    @Override
    public void fill() {
        System.out.println("Red...");
    }
}
