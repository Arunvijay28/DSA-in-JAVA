public class demo_ll {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.insertbegin(5);
        ll.insertbegin(6);
        ll.insertbegin(9);
        ll.display();

        ll.insertatpos(1, 7);
        System.out.println();
        ll.display();

        ll.deleteatpos(2);
        System.out.println();
        ll.display();
    }
}
