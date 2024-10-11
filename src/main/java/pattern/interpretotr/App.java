package pattern.interpretotr;

import pattern.interpretotr.context.Context;
import pattern.interpretotr.expression.FieldExpression;
import pattern.interpretotr.expression.TableExpression;

public class App {
    public static void main(String[] args) {
        Context context = new Context();

        FieldExpression fieldOne = new FieldExpression("name");
        FieldExpression fieldTwo = new FieldExpression("pin");

        TableExpression table = new TableExpression("bank_account");
        fieldOne.interpret(context);
        fieldTwo.interpret(context);
        table.interpret(context);

        System.out.println(context.buildQuery());
    }
}
