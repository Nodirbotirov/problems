package pattern.interpretotr.expression;

import pattern.interpretotr.context.Context;

public class FieldExpression extends AbstractExpression{
    private final String value;

    public FieldExpression(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public void interpret(Context ctx) {
        ctx.addField(this);
    }
}
