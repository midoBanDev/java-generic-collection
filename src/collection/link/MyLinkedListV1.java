package collection.link;

public class MyLinkedListV1 {

    private Node first;
    private int size = 0;

    public void add(Object e){
        Node newNode = new Node(e);
        if(first == null){
            first = newNode;
        }else{
            Node node = getLastNode(first);
            node.next = newNode;
        }
        size++;
    }

    public int size(){
        return size;
    }

    public Node getLastNode(Node node) {
        Node x = node;
        while (x.next != null){
            x = x.next;
        }
        return x;
    }

    public Object set(int index, Object element){
        Node node = getNode(index);
        Object oldValue = node.item;
        node.item = element;
        return oldValue;
    }

    public Object get(int index){
        Node node = getNode(index);
        return node.item;
    }

    public Node getNode(int index) {
        Node x = first;
        for (int i = 0; i < index; i++) {
            x = x.next;
        }
        return x;
    }

    public int indexOf(Object o){
        // 김영한님이 작성한 코드
        int index = 0;
        for (Node x = first; x != null; x = x.next){
            if(o.equals(x.item)){
                return index;
            }
            index++;
        }

        return -1;

        // 내가 작성한 코드
//        for (int i = 0; i < size; i++) {
//            Node x = getNode(i);
//            if(x.item.equals(o)){
//                return i;
//            }
//        }
//        return -1;
    }

    @Override
    public String toString() {
        return "MyLinkedListV1{" +
                "first=" + first +
                ", size=" + size +
                '}';
    }
}
