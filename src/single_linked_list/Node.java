package single_linked_list;

public class Node<T> {
    public T data;
    public Node<T> next; // 다음 노드의 주소, 결국 같은 종류의 객체

    public Node(T item) {
        data = item;
        next = null;
    }
}
