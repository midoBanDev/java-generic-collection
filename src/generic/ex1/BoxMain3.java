package generic.ex1;

public class BoxMain3 {

    public static void main(String[] args) {
        GenericBox<Integer> genericBox = new GenericBox<Integer>(); // 객체 생성 시점에 T의 타입이 결정.
        genericBox.set(10);
        //genericBox.set("문자열");  // Integer 타입만 허용. 컴파일 오류 발생.
        Integer integer = genericBox.get(); // Integer 타입 반환. (캐스팅 필요 없음)
        System.out.println("integer = " + integer);

        GenericBox<String> stringBox = new GenericBox<String>();
        stringBox.set("hello");
        String str = stringBox.get();
        System.out.println("str = " + str);

        // 모든 타입을 지정할 수 있다. : 원시 타입은 지정할 수 없다.
        GenericBox<Double> doubleBox = new GenericBox<Double>();
        doubleBox.set(10.5);
        Double doubleValue = doubleBox.get();
        System.out.println("doubleValue = " + doubleValue);

        // 타입 추론 : 생성하는 제네릭 타입을 생략할 수 있다.
        GenericBox<Integer> integerGenericBox1 = new GenericBox<Integer>(); // 타입 직접 입력
        GenericBox<Integer> integerGenericBox2 = new GenericBox<>();        // 타입 추론
    }
}
