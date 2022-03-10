package AdapterModel;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;

public class DuckTestDrive {
    public static void main(String[] args) {

        ArrayList arrayList = new ArrayList(10);

        //EnumerationIterator enumerationIterator = new EnumerationIterator(new Iterator<Integer>());

        MallardDuck mallardDuck = new MallardDuck();

        WildTurkey turkey = new WildTurkey();

        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        System.out.println("The turkey says...");
        turkey.gobble();
        turkey.fly();

        System.out.println("\n The Duck says....");
        testDuck(mallardDuck);

        System.out.println("\n The TurkeyAdapter says....");
        testDuck(turkeyAdapter);

    }

    static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}
