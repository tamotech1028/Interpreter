public class MixIngredientsExpression extends CookingExpression {

    @Override
    void interpret(CookingContext context) {
        context.setCurrentStep("材料を混ぜます");
        System.out.println(context.getCurrentStep());
    }   
}
