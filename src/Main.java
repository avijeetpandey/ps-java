import ds.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(12);
        list.add(13);
        list.add(14);
        list.add(15);
        list.add(16);
        list.print();
        System.out.println(list.find(14));
        System.out.println(list.find(30));
    }
}