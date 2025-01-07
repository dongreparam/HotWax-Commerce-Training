import java.util.ArrayList;
import java.util.Collections;

class demoCollectionsAdd{
    public static void main(String[] args) {
        ArrayList l1 = new ArrayList();
        l1.add(10);
        l1.add(20);
        l1.add(30);

        System.out.println(l1);

        ArrayList l2 = new ArrayList();
        l2.add("AAA");
        l2.add("BBB");
        l2.add("CCC");

        System.out.println(l2);

        l1.addAll(l2);

        System.out.println(l1);
    }
}