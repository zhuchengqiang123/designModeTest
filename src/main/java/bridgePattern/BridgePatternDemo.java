package bridgePattern;

/**
 * 描述： 桥接模式， 有点像代理模式，我觉得用的会比较少
 *
 * @author chengqiang_zhu
 * @date 2022/10/10
 */
public class BridgePatternDemo {
    public static void main(String[] args) {
        Shape redCircle = new Circle(100,100, 10, new RedCircle());
        Shape greenCircle = new Circle(100,100, 10, new GreenCircle());

        redCircle.draw();
        greenCircle.draw();
    }
}
