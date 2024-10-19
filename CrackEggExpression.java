public class CrackEggExpression extends CookingExpression {

    @Override
    public void interpret(CookingContext context) {
        context.setCurrentStep("卵を割ります");
        System.out.println(context.getCurrentStep());
    }
}
