public class CookPancakeExpression extends CookingExpression {

    @Override
    void interpret(CookingContext context) {
        context.setCurrentStep("フライパンでパンケーキを焼きます");
        System.out.println(context.getCurrentStep());
    }
}
