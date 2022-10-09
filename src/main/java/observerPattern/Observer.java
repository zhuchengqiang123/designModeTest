package observerPattern;

/**
 * 描述：
 *
 * @author chengqiang_zhu
 * @date 2022/10/9
 */
public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
