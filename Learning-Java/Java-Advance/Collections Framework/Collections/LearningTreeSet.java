import java.util.SortedSet;
import java.util.TreeSet;

public class LearningTreeSet {
    public static void main(String[] args) {
        TreeSet ts = new TreeSet<>();
        ts.add("Param");
        ts.add("Shriya");
        ts.add("Parnika");
        ts.add("Priyanshee");

        TreeSet ts1 = new TreeSet();
        ts1.add(45);
        ts1.add(5);
        ts1.add(15);
        ts1.add(25);
        ts1.add(35);

        System.out.println(ts1);

        System.out.println(ts);
        System.out.println(ts.size());

        TreeSet ts2 = new TreeSet();
        ts2.add(100);
        ts2.add(33);
        ts2.add(23);
        ts2.add(23);
        ts2.add(0);

        ts1.addAll(ts2);
        System.out.println(ts1);

        System.out.println(ts1.ceiling(7));
        ts1.clone();

        SortedSet ss = new TreeSet();
        ss.add(10);
        ss.add(44);
        ss.add(21);

        System.out.println(ss);

    }
}