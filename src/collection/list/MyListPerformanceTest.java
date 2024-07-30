package collection.list;

public class MyListPerformanceTest {

    public static void main(String[] args) {
        int size = 50_000;

        System.out.println("==MyArrayList 추가==");
        addFirst(new MyArrayList<Integer>(), size); // 찾는데 O(1), 데이터 밀기 O(n) -> O(n)
        addMid(new MyArrayList<Integer>(), size);   // 찾는데 O(1), 데이터 밀기 O(n) -> O(n)
        MyArrayList<Integer> arrayList = new MyArrayList<>();   // 조회용 데이터로 사용
        addLast(arrayList, size);   // 찾는데 O(1), 데이터 추가 O(1) -> O(1)
        
        int loop = 10_000;

        System.out.println("==MyArrayList 조회==");
        getIndex(arrayList, loop, 0);       // 맨 앞 조회
        getIndex(arrayList, loop, size/2);  // 중간 조회
        getIndex(arrayList, loop, size-1);  // 마지막 조회

        System.out.println("==MyArrayList 내용검색==");
        search(arrayList, loop, 0);       // 맨 앞 조회
        search(arrayList, loop, size/2);  // 중간 조회
        search(arrayList, loop, size-1);  // 마지막 조회

        System.out.println("==MyLinkedList 추가==");
        addFirst(new MyLinkedList<Integer>(), size); // 찾는데 O(1), 데이터 추가 O(1) -> O(1)
        addMid(new MyLinkedList<Integer>(), size);  // 찾는데 O(n), 데이터 추가 O(1) -> O(n)
        MyLinkedList<Integer> linkedList = new MyLinkedList<>();
        addLast(linkedList, size);  // 찾는데 O(n), 데이터 추가 O(1) -> O(n)

        System.out.println("==MyLinkedList 조회==");
        getIndex(linkedList, loop, 0);      // 맨 앞 조회
        getIndex(linkedList, loop, size/2); // 중간 조회
        getIndex(linkedList, loop, size-1); // 마지막 조회

        System.out.println("==MyLinkedList 내용 검색==");
        search(linkedList, loop, 0);      // 맨 앞 조회
        search(linkedList, loop, size/2); // 중간 조회
        search(linkedList, loop, size-1); // 마지막 조회
    }

    private static void addFirst(MyList<Integer> list, int size) {
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < size; i++) {
            list.add(0, i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("앞에 추가 - 크기: "+ size + ", 계산 시간: " + (endTime - startTime)+"ms");
    }

    private static void addMid(MyList<Integer> list, int size) {
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < size; i++) {
            list.add(i/2, i);   // 대략 가운데 위치에 추가 i/2
        }
        long endTime = System.currentTimeMillis();
        System.out.println("중간에 추가 - 크기: "+ size + ", 계산 시간: " + (endTime - startTime)+"ms");
    }

    private static void addLast(MyList<Integer> list, int size) {
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < size; i++) {
            list.add(i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("마지막에 추가 - 크기: "+ size + ", 계산 시간: " + (endTime - startTime)+"ms");
    }

    private static void getIndex(MyList<Integer> list, int loop, int index) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < loop; i++) {
            list.get(index);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("index: " + index + ", 반복: " + loop + ", 계산 시간: " + (endTime - startTime)+"ms");
    }

    private static void search(MyList<Integer> list, int loop, int findValue) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < loop; i++) {
            list.indexOf(findValue);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("findValue: " + findValue + ", 반복: " + loop + ", 계산 시간: " + (endTime - startTime)+"ms");
    }

}
