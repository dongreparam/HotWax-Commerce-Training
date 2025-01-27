import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class LearningSets {
    public static void main(String[] args) {
        Set<Object> set = new HashSet<>();
        set.add("Param");
        set.add("Shriya");
        set.add("Parnika");
        set.add("Priyanshee");
        set.add("Vidhan");
        set.add("Vidhan");
        set.add("Vidhan");

        System.out.println(set);
//
//        System.out.println(set.contains("Param"));
//
//        System.out.println(set.hashCode());

        Iterator iterator = set.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());

        }


    }

}