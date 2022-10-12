package strategyPattern;

/**
 * 描述：
 *
 * @author chengqiang_zhu
 * @date 2022/10/12
 */
public class OperationMultiply implements Strategy{
    @Override
    public int doOperation(int num1, int num2) {
        return num1 * num2;
    }
}