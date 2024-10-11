package code;

public class BooleanLogic {
    public static void main(String[] args) {
        //son bought bread
        boolean isBoughtBread = true;
        //son Bought Milk
        boolean isBoughtMilk = true;

        boolean isBoughtMilkAndBread = isBoughtBread && isBoughtMilk;

        if (isBoughtBread && isBoughtMilk) {
            System.out.println("Bought Bread and Milk");
        }else {
            System.out.println("Not Bought Bread");
        }
    }
}
