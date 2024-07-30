package collection.link;

public class Node {

    Object item;
    Node next;

    public Node(Object item){
        this.item = item;
    }

    @Override
    public String toString() {
        Node x  = this;
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
