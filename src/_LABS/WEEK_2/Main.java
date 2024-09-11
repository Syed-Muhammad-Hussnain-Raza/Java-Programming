public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertLast(1);
        list.insertLast(2);
        list.insertLast(3);
        list.insertLast(4);

        System.out.print("Original list: ");
        list.display();

        // Reverse using recursion
        list.reverseUsingRecursion();
        System.out.print("Reversed list using recursion: ");
        list.display();

        // Reverse back to original using loop
        list = list.reverseUsingLoop();
        System.out.print("Reversed back list using loop: ");
        list.display();

        // Insert after a value
        list.insertAfter(2, 5);
        System.out.print("List after inserting 5 after 2: ");
        list.display();

        // Find multiple occurrences
        list.findMultipleOccurrence(5);

        // Merge lists
        LinkedList list2 = new LinkedList();
        list2.insertLast(6);
        list2.insertLast(7);
        LinkedList mergedList = list.mergeLinkedLists(list, list2);
        System.out.print("Merged list: ");
        mergedList.display();

        // Delete operations
        list.deleteFirst();
        System.out.print("List after deleting first element: ");
        list.display();

        list.deleteLast();
        System.out.print("List after deleting last element: ");
        list.display();

        list.deleteNode(3);
        System.out.print("List after deleting node with data 3: ");
        list.display();

        list.deleteWholeList();
        System.out.print("List after deleting all elements: ");
        list.display();
    }
}
