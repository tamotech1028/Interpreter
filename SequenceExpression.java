// NonTerminalExpression: 非終端式（調理手順を組み合わせる）
public class SequenceExpression extends CookingExpression {

    private CookingExpression[] steps;

    public SequenceExpression(CookingExpression... steps) {
        this.steps = steps;
    }

    @Override
    public void interpret(CookingContext context) {
        for (CookingExpression step : steps) {
            step.interpret(context);
        }
    }
}
