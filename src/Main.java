;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        LinkList<Integer> link1 = new LinkList<>();
        link1.inse(3);
        link1.inse(5);
        link1.inse(2);
        link1.inse(8);
        link1.print();

        LinkList<Integer> link2 = new LinkList<>();
        link2.inse(1);
        link2.inse(3);
        link2.inse(2);
        link2.inse(1);
        link2.print();

        LinkList<Integer> mergedList = link1.mergeLists(link2);

        List<Integer> sortedList = new ArrayList<>();
        LinkList<Integer>.Node current = mergedList.headNode;
        while (current != null) {
            sortedList.add(current.data);
            current = current.nextNode;}
        Collections.sort(sortedList);

        System.out.println("Sort List: " + sortedList);
    }
}