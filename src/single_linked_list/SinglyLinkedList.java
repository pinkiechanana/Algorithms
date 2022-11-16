package single_linked_list;

public class SinglyLinkedList<T> {

    public Node<T> head;
    public int size;

    public SinglyLinkedList() {
        head = null;
        size = 0;
    }

    public void addFirst(T item) { // add node right after the head (index[0])
        Node<T> newNode = new Node<T>(item);
        newNode.next = head; // 무조건 먼저! 아니면 기존의 첫번째 노드의 주소는 평생 못찾는다!
        head = newNode;
        size++;
    }

    public void addAfter(Node<T> target, T item) { // add one after the target
        Node<T> afterNode = new Node<T>(item);
        afterNode.next = target.next;
        target.next = afterNode;
        size++;
    }

    public void add(int index, T item) { //
        if (index < 0 || index > size) return; // try catch exception 추가해야됨!!!******************
        if (index == 0) {
            addFirst(item);
        } else {
            Node<T> q = getNode(index - 1);
            addAfter(q, item);
        }
    }

    public T removeFirst() {
        if (head == null) {
            return null;
        } else {
            T temp = head.data;
            head = head.next;
            return temp;
        }
    }

    public T removeAfter(Node<T> target) { // delete the one after the target
        if (target.next == null) {
            return null;
        }
        T temp = target.next.data;
        target.next = target.next.next;
        return temp;
    }
    // delete : 무엇을 delete하더라도 지운 data를 return 해주는게 좋다
    public T remove(int index) { // delete by index(address)
        if (index < 0 || index >= size) return null;
        if (index == 0) return removeFirst();
        Node<T> prev = getNode(index - 1);
        return removeAfter(prev);
    }

    public T remove(T item) { // delete by searching value. q follows p one step behind.
        Node<T> p = head, q = null;
        while (p!= null && !p.data.equals(item)) {
            q = p;
            p = p.next;
        }
        if (p == null) return null; // if empty
        if (q == null) return removeFirst(); // if first node is target

        return removeAfter(q);
    }

    public T get(int index) {
        if (index < 0 || index >= size) return null;
        return getNode(index).data;
    }

    public Node<T> getNode(int index) {
        if (index < 0 || index >= size) return null;
        Node<T> p = head;
        for (int i = 0; i < index; i++)
            p = p.next;
        return p;
    }

    public int indexOf(T item) { // search

        Node<T> p = head;
        int index = 0;
        while (p != null) {
            if (p.data.equals(item)) {
                return index;
            }
            p = p.next;
            index++;
        }
        return -1;
    }

    public static void main(String[] args) {
        SinglyLinkedList<String> list = new SinglyLinkedList<>();
        list.add(0, "Saturday");
        list.add(1, "Friday");
        list.add(2, "Monday");
        list.add(0, "Thursday");


        String str = list.get(2); // str = "Friday";
        list.remove(2);
        int pos = list.indexOf("Monday"); // pos = 2;
    }
}