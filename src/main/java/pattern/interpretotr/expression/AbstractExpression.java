package pattern.interpretotr.expression;

import pattern.interpretotr.context.Context;

public abstract class AbstractExpression {
    public abstract void interpret(Context ctx);
}
