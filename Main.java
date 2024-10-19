public class Main {
    public static void main(String[] args) {
        CookingContext context = new CookingContext();

        // 調理の手順を構築
        CookingExpression measureFlour = new MeasureFlourExpression();
        CookingExpression crackEgg = new CrackEggExpression();
        CookingExpression addMilk = new AddMilkExpression();
        CookingExpression mix = new MixIngredientsExpression();
        CookingExpression cookPancake = new CookPancakeExpression();

        // 一連の手順をまとめて解釈
        CookingExpression recipe = new SequenceExpression(measureFlour, crackEgg, addMilk, mix, cookPancake);
        recipe.interpret(context);

    }
}