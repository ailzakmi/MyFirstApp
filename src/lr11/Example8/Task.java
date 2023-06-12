package lr11.Example8;

class Node {

    int value;
    Node next;

    Node(int value, Node next) {
        this.value = value;
        this.next = next;
    }
}
public class Task {
    public static void main(String[] args) {

        My list = new My();

        System.out.println("����������� ������:");
        list.createHead(new int[]{3, 2, 1});
        list.printLinkedList();

        System.out.println("����������� ������");
        list.createFromTail(new int[]{4, 5, 6});
        list.printLinkedList();

        System.out.println("���������� �������� � ������ � ����� ������:");
        list.createHead(new int[]{3, 2, 1});
        list.printLinkedList();
        list.addFirst(new Node(-5, null));
        list.addLast(new Node(60, null));
        list.printLinkedList();

        System.out.println("���������� �������� '-1' �� ������� 1:");
        list.createFromTail(new int[]{1,2,3});
        list.printLinkedList();
        list.insert(new Node(-1, null));
        list.printLinkedList();

        System.out.println("�������� ������� � ���������� ���������:");
        list.createFromTail(new int[]{1,2,3,4});
        list.printLinkedList();
        list.removeFirst();
        list.removeLast();
        list.printLinkedList();

        System.out.println("�������� �������� �� ��������:");
        list.createFromTail(new int[]{1,2,3,4});
        list.printLinkedList();
        list.remove();
        list.printLinkedList();

        System.out.println("����������� ������, ����������:");
        list.recursiveCreateHead(new int[]{4,3,2,1});
        list.printLinkedList();

        System.out.println("����������� ������, ����������:");
        list.createFromTailRecursive(new int[]{4,3,2,1});
        list.printLinkedList();

        System.out.println("����� ����������, �������� ������:");
        list.createFromTailRecursive(new int[]{4,3,2,1});
        list.printLinkedList();
        System.out.println("����������� �����:\n" + list.toStringRecursive());
    }
}

class My {

    private Node tail = null;
    private Node head = null;


    void createHead(int[] values) {
        head = new Node(values[0], null);
        tail = head;

        for (int i = 1; i < values.length; i++) {
            head = new Node(values[i], head);
        }
    }

    void recursiveCreateHead(int[] values) {
        head = new Node(values[0], null);
        tail = head;

        addItems_HeadRecursive(subArray(values));
    }

    private int[] subArray(int[] arr) {

        int[] newArr = new int[arr.length- 1];

        if (newArr.length >= 0) System.arraycopy(arr, 1, newArr, 0, newArr.length);

        return newArr;
    }

    private void addItems_HeadRecursive(int[] values) {
        if(values.length == 0) return;

        head = new Node(values[0], head);

        addItems_HeadRecursive(subArray(values));
    }

    void createFromTail(int[] val) {
        head = new Node(val[0], null);
        tail = head;

        for (int i = 1; i < val.length; i++) {
            tail.next = new Node(val[i], null);
            tail = tail.next;
        }
    }

    void createFromTailRecursive(int[] val) {
        head = new Node(val[0], null);
        tail = head;

        addItems_TailRecursive(subArray(val));
    }

    private void addItems_TailRecursive(int[] values) {
        if(values.length == 0) return;

        tail.next = new Node(values[0], null);
        tail = tail.next;

        addItems_TailRecursive(subArray(values));
    }

    void printLinkedList() {
        System.out.println(toString());
    }

    void addFirst(Node node) {
        node.next = head;
        head = node;
    }

    void addLast(Node node) {
        tail.next = node;
        tail = node;
    }

    void insert(Node node) {

        Node ref = head;
        while (ref != null) {

            if (ref.value == 1) {
                node.next = ref.next;
                ref.next = node;
                break;
            }
            ref = ref.next;
        }
    }

    void removeFirst() {
        head = head.next;
    }

    void removeLast() {

        Node ref = head;

        while (ref.next.next != null) {
            ref = ref.next;
        }

        ref.next = null;
        tail = ref;
    }

    void remove() {

        Node ref = head;

        while (ref.next.value != 3) ref = ref.next;

        ref.next = ref.next.next;
    }

    @Override
    public String toString() {

        StringBuilder build = new StringBuilder();
        Node ref = head;

        while (ref != null) {
            build.append(ref.value);
            build.append(" ");
            ref = ref.next;
        }

        return build.toString();
    }

    String toStringRecursive() {

        return toStringRecursiveInternal(head);
    }

    private String toStringRecursiveInternal(Node current) {

        if(current == null) return "";

        return current.value + " " + toStringRecursiveInternal(current.next);
    }
}

//        6. ����������� ������, � ������� ��� �����, ������ � ���������
//        ������������ ��������� ������ ������� ��������� ������:
//        �) � �������������� �����:
//        + ���� � ������ createHead();
//        + ���� � ������ createTail();
//        + ����� (������������ ������, �������������� �� ��������� ������) toString();
//        + ���������� �������� � ������ ������ AddFirst();
//        + ���������� �������� � ����� ������ AddLast();
//        + ������� �������� � ������ � ��������� ������� Insert();
//        + �������� �������� � ������ ������ RemoveFirst();
//        + �������� ���������� �������� ������ RemoveLast();
//        + �������� �� ������ �������� � ��������� ������� Remove();
//        �) � �������������� ��������:
//        + ���� � ������ createHeadRec();
//        + ���� � ������ createTailRec();
//        � ����� (������������ ������, �������������� �� ���������
//        ������) toStringRec().