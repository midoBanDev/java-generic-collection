package generic.ex1;

/**
 * 로 타입 또는 원시 타입이라 한다.
 * 과거 버전이 낮은 java를 사용하는 프로젝트의 하위호환을 위해 지원하는 기능.
 * 로 타입은 사용하지 말자.
 */
public class RowTypeMain {

    public static void main(String[] args) {
        GenericBox integerBox = new GenericBox();
        //GenericBox<Object> integerBox = new GenericBox<>(); // 권장
        integerBox.set(10);
        Integer result = (Integer) integerBox.get();
        System.out.println("result = " + result);
    }
}
