package collection.list;

public class MyLinkedList<E> implements MyList<E> {

    private Node<E> first;
    private int size = 0;

    private static class Node<E> {
        private E item;
        private Node<E> next;

        public Node(E item) {
            this.item = item;
        }

        @Override
        public String toString() {
            Node<E> x  = this;
            StringBuilder result = new StringBuilder();
            result.append("[");
            while (x != null){
                result.append(x.item);
                if(x.next != null){
                    result.append("->");
                }
                x = x.next;
            }
            result.append("]");
            return result.toString();
        }
    }

    @Override
    public int size(){
        return size;
    }

    @Override
    public void add(E e){
        Node<E> newNode = new Node<>(e);
        if(first == null){
            first = newNode;
        }else{
            Node<E> node = getLastNode();
            node.next = newNode;
        }
        size++;
    }

    @Override
    public void add(int index, E e){
        Node<E> newNode = new Node<>(e);
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
            Node<E> preNode = getNode(index-1);
            newNode.next = preNode.next;
            preNode.next = newNode;

            // 내 코드
//            newNode.next = getNode(index);
//            Node preNode = getNode(index-1);
//            preNode.next = newNode;
        }
        size++;
    }

    @Override
    public E get(int index){
        Node<E> node = getNode(index);
        return node.item;
    }

    @Override
    public E set(int index, E element){
        Node<E> node = getNode(index);
        E oldValue = node.item;
        node.item = element;
        return oldValue;
    }


    @Override
    public E remove(int index){
        // 강사 코드
        Node<E> removeNode = getNode(index);
        E removeItem = removeNode.item;
        if(index == 0){
            first = removeNode.next;
        } else {
            Node<E> preNode = getNode(index-1);
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

    @Override
    public int indexOf(E o){
        // 김영한님이 작성한 코드
        int index = 0;
        for (Node<E> x = first; x != null; x = x.next){
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

    public Node<E> getLastNode() {
        Node<E> x = first;
        while (x.next != null){
            x = x.next;
        }
        return x;
    }

    public Node<E> getNode(int index) {
        Node<E> x = first;
        for (int i = 0; i < index; i++) {
            x = x.next;
        }
        return x;
    }

    @Override
    public String toString() {
        return "MyLinkedListV1{" +
                "first=" + first +
                ", size=" + size +
                '}';
    }
}
