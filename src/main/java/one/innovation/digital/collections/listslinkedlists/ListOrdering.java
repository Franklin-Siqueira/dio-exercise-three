package one.innovation.digital.collections.listslinkedlists;

import one.innovation.digital.collections.listorderingclasses.AgeComparator;
import one.innovation.digital.collections.listorderingclasses.AllPropsComparator;
import one.innovation.digital.collections.listorderingclasses.Cat;
import one.innovation.digital.collections.listorderingclasses.ColorComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class ListOrdering {
    public static void main(String[] args) {

        List<Cat> myCats = new ArrayList<>(){{
            add(new Cat("Jon", 12, "preto"));
            add(new Cat("Simba", 6, "tigrado"));
            add(new Cat("Jon", 18, "amarelo"));
        }};
        myCats.sort(Comparator.comparing(Cat::getName));

        System.out.println("--\tInsertion order\t---");
        System.out.println(myCats);

        System.out.println("--\tRandom\t---");
        Collections.shuffle(myCats);
        System.out.println(myCats);

        System.out.println("--\tOrdered by name\t---");
        Collections.sort(myCats);
        System.out.println(myCats);

        System.out.println("--\tOrdered by age\t---");
        myCats.sort(new AgeComparator());
        System.out.println(myCats);

        System.out.println("--\tOrdered by age [with ANONYMOUS CLASS]\t---");
        myCats.sort(new Comparator<Cat>() {
            @Override
            public int compare(Cat catOne, Cat catTwo) {
                return Integer.compare(catOne.getAge(), catTwo.getAge());
            }
        });
        System.out.println(myCats);

        System.out.println("--\tOrdered by age [with FUNCTIONAL INTERFACE]\t---");
        myCats.sort(Comparator.comparing(new Function<Cat, Integer>() {
            @Override
            public Integer apply(Cat cat) {
                return cat.getAge();
            }
        }));
        System.out.println(myCats);

        System.out.println("--\tOrdered by age [with LAMBDA FUNCTION]\t---");
        myCats.sort(Comparator.comparing((Cat cat) -> cat.getAge()));
        System.out.println(myCats);

        System.out.println("--\tOrdered by age [with METHOD REFERENCE]\t---");
        myCats.sort(Comparator.comparing(Cat::getAge));
        System.out.println(myCats);

        System.out.println("--\tColor name comparing\t---");
        myCats.sort(new ColorComparator());
        System.out.println(myCats);

        System.out.println("--\tAll properties ordering\t---");
        myCats.sort(new AllPropsComparator());
        System.out.println(myCats);
    }
}
