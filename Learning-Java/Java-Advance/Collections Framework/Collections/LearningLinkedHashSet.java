import java.util.Iterator;

public class LearningLinkedHashSet {
    public static void main(String[] args) {
        java.util.LinkedHashSet<Object> linkedHashSet = new java.util.LinkedHashSet<>();
        linkedHashSet.add(10);
        linkedHashSet.add(20);
        linkedHashSet.add(30);
        linkedHashSet.add(40);
        linkedHashSet.add(50);
        linkedHashSet.add(60);

        System.out.println(linkedHashSet.spliterator());

        Iterator iterator = linkedHashSet.iterator();
        System.out.println(iterator.hasNext());

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}