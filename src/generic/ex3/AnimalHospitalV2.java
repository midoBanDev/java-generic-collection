package generic.ex3;

/**
 * 타입 매개변수 도입과 실패
 * @param <T>
 */
public class AnimalHospitalV2<T> {

    private T animal;

    public void set(T animal){
        this.animal = animal;
    }

    public void checkup(){

        // T의 타입을 메서드를 정의하는 시점에는 알 수 없다.
        // 따라서 T를 어떤 타입이든 받을 수 있는 Object로 정의한다.
        // 결론, Object의 기능만 사용 가능.
        animal.toString();
        animal.equals(null);

        // 컴파일 오류
//        System.out.println("동물 이름 = " + animal.getName());
//        System.out.println("동물 크기 = " + animal.getSize());
//        animal.sound();
    }

    public T bigger(T target){
        // 컴파일 오류
//        return animal.getSize() > target.getSize() ? animal : target;
        return null;
    }
}
