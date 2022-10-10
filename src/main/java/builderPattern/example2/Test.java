package builderPattern.example2;

/**
 * 描述：
 *
 * @author chengqiang_zhu
 * @date 2022/10/10
 */
public class Test {
    public static void main(String[] args) {
        NutritionFacts juice = new NutritionFacts.Builder(240, 8).
                calories(100).sodium(35).carbohydrate(27).build();
        System.out.println(juice);
    }
}
