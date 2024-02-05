import com.bridgelabz.linkedlist.Linkedlist;

public class Main {
    public static void main(String[] args) {
        Linkedlist list = new Linkedlist();
        list.insert(56,0);
        list.insert(70,56);  // Insert 70 after 56
        list.insert(30, 56); // Insert 30 between 56 and 70
        list.display();
    }
}