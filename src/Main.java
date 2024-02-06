import com.bridgelabz.linkedlist.MyLinkedlist;

public class Main {
    public static void main(String[] args) {
        MyLinkedlist list = new MyLinkedlist();
        list.insertAfter(56,0);
        list.insertAfter(30,56);
        list.insertAfter(40,30);
        list.insertAfter(70,40);
        list.display();
        list.search(40);
    }
}