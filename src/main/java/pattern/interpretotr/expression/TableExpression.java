package pattern.interpretotr.expression;

import pattern.interpretotr.context.Context;

public class TableExpression extends AbstractExpression{

    private final String value;

    public TableExpression(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public void interpret(Context ctx) {
        ctx.setTableExpression(this);
    }
}
