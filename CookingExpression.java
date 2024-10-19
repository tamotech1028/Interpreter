// AbstractExpression: 抽象式（調理の手順を表す抽象クラス）
public abstract class CookingExpression {
    protected CookingContext context;
    abstract void  interpret(CookingContext context);
}
