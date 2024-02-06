import com.bridgelabz.linkedlist.MyLinkedlist;

public class Main {
    public static void main(String[] args) {
        MyLinkedlist list = new MyLinkedlist();
        list.append(56);
        list.append(30);
        list.append(70);
        list.display();
        list.insertAfter(40,30);
        list.display();
    }
}