package collection.link;


public class MyLinkedListV2Main {

    public static void main(String[] args) {
        MyLinkedListV2 list = new MyLinkedListV2();
        // 마지막에 추가 O(n)
        list.add("a");
        list.add("b");
        list.add("c");
        System.out.println(list);

        // 첫 번째 항목에 추가 O(1)
        list.add(0, "d");
        System.out.println(list);

        // 첫 번재 항목에 삭제 O(1)
        list.remove(0);
        System.out.println(list);

        // 중간 항목에 추가, 삭제
        list.add(1, "e"); // O(n)
        System.out.println(list);

        list.remove(2); // O(n)
        System.out.println(list);

    }
}
