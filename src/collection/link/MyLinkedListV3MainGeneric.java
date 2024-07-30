package collection.link;

public class MyLinkedListV3MainGeneric {



    public static void main(String[] args) {
        MyLinkedListV3Generic<String> v3Generic = new MyLinkedListV3Generic<>();
        v3Generic.add("a");
        v3Generic.add("b");
        v3Generic.add("c");
        System.out.println("v3Generic = " + v3Generic);

        v3Generic.add(0,"d");
        System.out.println("v3Generic = " + v3Generic);

        String item = v3Generic.get(1);
        System.out.println("item = " + item);

        v3Generic.remove(2);
        System.out.println("v3Generic = " + v3Generic);

        MyLinkedListV3Generic<Integer> intList = new MyLinkedListV3Generic<>();
        intList.add(1);
        intList.add(2);
        intList.add(3);
        System.out.println("intList = " + intList);
    }


}
