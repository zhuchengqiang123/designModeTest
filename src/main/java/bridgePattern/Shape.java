package bridgePattern;

/**
 * 描述：
 *
 * @author chengqiang_zhu
 * @date 2022/10/10
 */
public abstract class Shape {
    protected DrawAPI drawAPI;
    protected Shape(DrawAPI drawAPI){
        this.drawAPI = drawAPI;
    }
    public abstract void draw();
}