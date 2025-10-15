public class Main {
    public static void main(String[] args) {
        DoubleLinkedList doublelist = new DoubleLinkedList();

        doublelist.printForward();
        doublelist.add(1);
        doublelist.add(2);
        doublelist.add(3);
        doublelist.add(4);
        doublelist.add(5);
        doublelist.printForward();
        System.out.println("--------------------------");
        doublelist.printBackward();

    }
}