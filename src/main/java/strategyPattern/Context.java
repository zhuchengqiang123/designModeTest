package strategyPattern;

/**
 * 描述：
 *
 * @author chengqiang_zhu
 * @date 2022/10/12
 */
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    public int executeStrategy(int num1, int num2){
        return strategy.doOperation(num1, num2);
    }
}
