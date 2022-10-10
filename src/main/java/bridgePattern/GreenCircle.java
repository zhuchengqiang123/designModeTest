package bridgePattern;

/**
 * 描述：
 *
 * @author chengqiang_zhu
 * @date 2022/10/10
 */
public class GreenCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: green, radius: "
                + radius +", x: " +x+", "+ y +"]");
    }
}