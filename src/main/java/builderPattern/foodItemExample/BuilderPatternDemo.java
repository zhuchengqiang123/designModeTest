package builderPattern.foodItemExample;

/**
 * 描述：建造者模式
 *
 * @author chengqiang_zhu
 * @date 2022/10/10
 */
public class BuilderPatternDemo {
    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();

        Meal vegMeal = mealBuilder.prepareVegMeal();
       /* System.out.println("商品");
        vegMeal.showItems();
        System.out.println("共花费: " +vegMeal.getCost());*/

        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();

        /*System.out.println("\n\n肉餐");
        nonVegMeal.showItems();
        System.out.println("共花费: " +nonVegMeal.getCost());*/
    }
}
