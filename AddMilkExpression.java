public class AddMilkExpression extends CookingExpression {

    @Override
    void interpret(CookingContext context) {
        context.setCurrentStep("牛乳を加えます");
        System.out.println(context.getCurrentStep());
    }
    
}
