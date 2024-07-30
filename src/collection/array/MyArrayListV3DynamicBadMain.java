package collection.array;

public class MyArrayListV3DynamicBadMain {

    public static void main(String[] args) {
        MyArrayListV3Dynamic numberList = new MyArrayListV3Dynamic();
        
        // 숫자만 입력 하기를 기대
        numberList.add(1);
        numberList.add(2);
        numberList.add("문자"); // 문자를 입력
        System.out.println("numberList = " + numberList);

        // Object를 반환하므로 다운캐스팅 필요.
        Integer num1 = (Integer) numberList.get(0);
        Integer num2 = (Integer) numberList.get(1);

        // 문자가 담겨 있기 때문에 캐스팅 에러 발생.
        Integer num3 = (Integer) numberList.get(2);
    }
}
