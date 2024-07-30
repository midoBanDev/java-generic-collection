package collection.array;

public class MyArrayListV4GenericMain {

    public static void main(String[] args) {

        MyArrayListV4Generic<String> stringList = new MyArrayListV4Generic<>();
        stringList.add("a");
        stringList.add("b");
        stringList.add("c");
        String s = stringList.get(0);
        System.out.println("s = " + s);

        MyArrayListV4Generic<Integer> intList = new MyArrayListV4Generic<>();
        intList.add(0, 1);
//        intList.add(1);
//        intList.add(2);
//        intList.add(3);
//        Integer num = intList.get(0);
        System.out.println("num = " + intList);


    }
}
