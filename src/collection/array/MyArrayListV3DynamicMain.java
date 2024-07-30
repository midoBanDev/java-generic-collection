package collection.array;

public class MyArrayListV3DynamicMain {

    public static void main(String[] args) {
        MyArrayListV3Dynamic list = new MyArrayListV3Dynamic();
        list.add("a");
        list.add("b");
        list.add("c");
        System.out.println(list);

        System.out.println("==마지막 index에 addlist 추가==");
        list.add("addList");
        System.out.println(list);

        System.out.println("==첫번째 index에 addFirst 추가==");
        list.add(0, "addFirst");
        System.out.println(list);

        System.out.println("==마지막 index 데이터 삭제==");
        list.remove(4);
        System.out.println(list);

        System.out.println("==첫번째 index 데이터 삭제");
        list.remove(0);
        System.out.println(list);
    }
}
