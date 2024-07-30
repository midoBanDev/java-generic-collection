package collection.list;

public class BatchProcessorMain {

    public static void main(String[] args) {
        MyArrayList<Integer> list = new MyArrayList<>();
        BatchProcessor processor1 = new BatchProcessor(list);
        processor1.logic(100_000); // Loop는 O(n) 이고, add도 O(n) 이다. 결국 O(n*n)이 되어 성능이 기하급수적으로 안좋아 진다.(리스트에 0번째에 추가하는 경우에 한함 )

        MyLinkedList<Integer> list1 = new MyLinkedList<>();
        BatchProcessor processor2 = new BatchProcessor(list1);
        processor2.logic(1_000_000); // Loop는 O(n)이고, add는 O(1) 이다. 그래서 MyArrayList에 비해 압도적인 성능을 보여준다.(리스트에 0번째에 추가하는 경우에 한함 )
    }
}
