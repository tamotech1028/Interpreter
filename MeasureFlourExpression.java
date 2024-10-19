public class MeasureFlourExpression extends CookingExpression {

    @Override
    void interpret(CookingContext context) {
        context.setCurrentStep("小麦粉を計量します");
        System.out.println(context.getCurrentStep());
    }
    
}
