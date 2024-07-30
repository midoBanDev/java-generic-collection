package generic.ex3;

import generic.animal.Cat;
import generic.animal.Dog;

/**
 * 타입 매개변수 제한 기능을 사용함으로써 코드 재사용성과 타입 안정성 모두를 충족하게 되었다.
 */
public class AnimalHospitalMainV3 {

    public static void main(String[] args) {
        AnimalHospitalV3<Dog> dogHospital = new AnimalHospitalV3<>();
        AnimalHospitalV3<Cat> catHospital = new AnimalHospitalV3<>();

        Dog dog = new Dog("멍멍이1", 100);
        Cat cat = new Cat("냐용이1", 300);

        // 개 병원
        dogHospital.set(dog);
        dogHospital.checkup();

        // 고양이 병원
        catHospital.set(cat);
        catHospital.checkup();

        // 문제1 : 개 병원에 고양이를 넣을 수 있나?
        // dogHospital.set(cat);   // 매개변수 체크 실패 : 컴파일 오류가 밟생하지 않는다. 타입 안전성 X

        // 문제2 : 개 타입 반환. 캐스팅 필요.
        dogHospital.set(dog);
        Dog biggerDog = dogHospital.bigger(new Dog("멍멍이2", 200));
        System.out.println("biggerDog = " + biggerDog);

    }
}
