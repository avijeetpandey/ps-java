import data_structures.linked_list.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(20);
        list.add(30);
        list.display();

        System.out.println(list.size());

        list.remove(20);

        list.display();

        System.out.println(list.size());
    }
}
