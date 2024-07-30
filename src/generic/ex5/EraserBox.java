package generic.ex5;

/**
 * 타입 이레이저
 * Java는 컴파일 후 타입 매개변수를 모두 제거 한다.
 *
 * 일반 제네릭
 * - 타입 매개변수로 선언한 T는 모두 Object로 변환된다.
 * 상한 제네릭
 * - 타입 매개변수로 선언한 T는 상환 객체로 변환된다.
 *
 * @param <T>
 */
public class EraserBox<T> {

    public boolean instanceCheck(Object param){
        //return object instanceof T; // 오류

        /**
         * 오류 원인 : 타입 매개변수 T는 컴파일 후 모두 Object로 변환되기 때문에 아래 비교 조건은 무조건 ture가 발생한다.
         * 이런 이유로 타입 매개변수는 instanceof 를 허용하지 않는다.
         */
        return param instanceof Object;
    }

    public void create(){
        //new T; // 오류

        /**
         * 오류 원인 : 타입 매개변수는 컴파일 후 Objce로 변환되기 때문에 new Object가 되는 문제가 발생한다.
         * 따라서 타입 매개변수는 new를 허용하지 않는다.
         */
        new Object();
    }
}
