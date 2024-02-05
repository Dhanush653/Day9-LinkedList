import com.bridgelabz.linkedlist.Linkedlist;

public class Main {
    public static void main(String[] args) {
        Linkedlist list = new Linkedlist();
        list.insert(70);
        list.insert(30);
        list.insert(56);
        list.display();
        System.out.println();
        list.findposition(30);
    }
}