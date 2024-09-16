package pattern;

import pattern.decorator.product.ChocolateCookie;
import pattern.decorator.product.Coffee;
import pattern.decorator.product.Cookie;
import pattern.decorator.product.MilkCoffee;
import pattern.prototype.Employee;
import pattern.prototype.JobTittle;

public class Test {
    public static void main(String[] args) {
        Cookie cookie = new Cookie();
        System.out.println(cookie.getWeight());

        Cookie chocolateCookie = new ChocolateCookie(cookie);
        System.out.println(chocolateCookie.getWeight());

        Coffee coffee = new Coffee();
        System.out.println(coffee.getCost());

        MilkCoffee milkCoffee = new MilkCoffee(coffee);
        System.out.println(milkCoffee.getCost());



//        Employee workerOne = new Employee();
//        workerOne.setId(1);
//        workerOne.setName("Alex");
//        workerOne.setSalary(5000);
//        workerOne.setJobTittle(JobTittle.DEVELOPER);
//
//        Employee workerTwo = (Employee) workerOne.getPrototype();
//        workerTwo.setName("Philip");
//        System.out.println(workerTwo);
    }
}
