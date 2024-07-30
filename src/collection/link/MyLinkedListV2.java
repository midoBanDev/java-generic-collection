package collection.link;

public class MyLinkedListV2 {

    private Node first;
    private int size = 0;

    public void add(Object e){
        Node newNode = new Node(e);
        if(first == null){
            first = newNode;
        }else{
            Node node = getLastNode();
            node.next = newNode;
        }
        size++;
    }

    public void add(int index, Object e){
        Node newNode = new Node(e);
        if(index == 0){
            // 강사 코드
            newNode.next = first;
            first = newNode;

            // 내 코드
//            Node first1 = this.first;
//            first = newNode;
//            first.next = first1;
        }else{
            // 강사 코드
            Node preNode = getNode(index-1);
            newNode.next = preNode.next;
            preNode.next = newNode;

            // 내 코드
//            newNode.next = getNode(index);
//            Node preNode = getNode(index-1);
//            preNode.next = newNode;
        }
        size++;
    }

    public Object remove(int index){
        // 강사 코드
        Node removeNode = getNode(index);
        Object removeItem = removeNode.item;
        if(index == 0){
            first = removeNode.next;
        } else {
            Node preNode = getNode(index-1);
            preNode.next = removeNode.next;
        }
        removeNode.item = null;
        removeNode.next = null;
        size--;
        return removeItem;


        // 내코드
//        Node oldNode;
//        if(index == 0){
//            oldNode = first;
//            this.first = getNode(1);
//        }else{
//            Node preNode = getNode(index-1);
//            oldNode = preNode.next;
//            preNode.next = preNode.next.next;
//        }
//        size--;
//        return oldNode.item;
    }

    public int size(){
        return size;
    }

    public Node getLastNode() {
        Node x = first;
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
