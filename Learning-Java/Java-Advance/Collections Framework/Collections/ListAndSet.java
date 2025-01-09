import java.util.List;
import java.util.Set;
import java.util.ArrayList;
import java.util.HashSet;



class Lists {
    public static void main(String[] args) {
        List l = new ArrayList();
        l.add(10);
        l.add(20);
        l.add(30);
        System.out.println(l);

        Sets s1 = new Sets();
        s1.Setts();
    }
}

class Sets {
    Set s = new HashSet();

    void Setts(){
        s.add(10);
        s.add(20);
        s.add(30);
        s.add(40);
        System.out.println(s);
    }
}