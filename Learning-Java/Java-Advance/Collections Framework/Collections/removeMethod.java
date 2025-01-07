import java.util.ArrayList;
import java.util.Collections;


class removeMethod{
    public static void main(String[] args) {
        ArrayList l1 = new ArrayList();
        l1.add(10);
        l1.add(20);
        l1.add(30);
        l1.add("Param");
        System.out.println(l1);


        ArrayList l2 = new ArrayList();
        l2.add(40);

        l1.addAll(l2);
        System.out.println(l1);

        // l1.remove(10); gives an Exception of ArrayOutOfBound Index because the 10 is not the value but the Index
        l1.remove(0);
        System.out.println(l1);
    }
}