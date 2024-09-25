public class Main {
    public static void main(String[] args) {
        CircularList<Integer> list = new CircularList<>();

        list.addFirst(0);
        list.addLast(1);
        list.addLast(2);
        list.insertAfter(new CircularNode<>(2), 3);
        list.addLast(4);
        list.addLast(5);
        list.addLast(6);
        list.addLast(7);
        list.addLast(8);

        System.out.println("Original List");
        list.displayList();

        list.removeFirst();
        list.removeLast();
        list.deleteSpecific(new CircularNode<>(3));

        System.out.println("\nList after delete from start, end and specific node of data: 3");
        list.displayList();

        System.out.println("\nNode 4 is at number: " + list.getNodeNumber(new CircularNode<>(4)));

        System.out.println("\nAfter deletion of node of data have even values");
        list.deleteNodeOfValues("even");
        list.displayList();

        System.out.println("\nList after deleting even positioned nodes");
        list.deleteEvenPositionedNodes();
        list.displayList();

        System.out.println();
        list.josephusProblem(3);
        System.out.println("List after josephus problem.");
        list.displayList();
    }
}
