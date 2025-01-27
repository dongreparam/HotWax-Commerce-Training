import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class LearningHashSet {
    public static void main(String[] args) {
        HashSet<Object> hashSet = new HashSet<>();
        hashSet.add("Param");
        hashSet.add("Shriya");
        hashSet.add("Parnika");
        hashSet.add("Priyanshee");
        hashSet.add("VIdhan");
        hashSet.add(null);

        System.out.println(hashSet);


        ArrayList arrayList = new ArrayList();
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(40);
//
//        hashSet.addAll(arrayList);
//
//        Iterator itr = hashSet.iterator();
//        while (itr.hasNext()){
//            System.out.println(itr.next());
//        }
//
        System.out.println(hashSet.size());
        System.out.println(hashSet.contains("Param"));
        System.out.println(hashSet.isEmpty());
        System.out.println(hashSet.remove("Param"));
        System.out.println(hashSet);
        System.out.println(hashSet.contains("Param"));
    }
}