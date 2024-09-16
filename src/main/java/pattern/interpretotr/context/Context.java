package pattern.interpretotr.context;

import pattern.interpretotr.expression.FieldExpression;
import pattern.interpretotr.expression.TableExpression;

import java.util.ArrayList;
import java.util.List;

public class Context {
    private List<FieldExpression> fields;
    private TableExpression tableExpression;
    public void setTableExpression(TableExpression table) {
        this.tableExpression = table;
    }

    public void addField(FieldExpression field) {
        if (fields == null) {
            fields = new ArrayList<>();
        }
        fields.add(field);
    }

    public String buildQuery(){
        StringBuilder attributes = new StringBuilder();
        int number = 1;
        int size = fields.size();
        for (FieldExpression field: fields){
            attributes.append(field.getValue());
            if (number != size){
                attributes.append(", ");
            }
            number++;
        }
        return "SELECT " + attributes + " FROM " + tableExpression.getValue() + " ;";
    }
}
