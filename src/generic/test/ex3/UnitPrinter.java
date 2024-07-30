package generic.test.ex3;

import generic.test.ex3.unit.BioUnit;

public class UnitPrinter {

    /**
     * 제네릭 메서드 활용
     */
    public static <T extends BioUnit> void printV1(Shuttle<T> shuttle){
        T unit = shuttle.out();
        System.out.println("이름 : " + unit.getName() + ", 체력 : " + unit.getHp());
    }

    /**
     * 와일드 카드 : 권장
     */
    public static void printV2(Shuttle<? extends BioUnit> shuttle){
        BioUnit unit = shuttle.out();
        System.out.println("이름 : " + unit.getName() + ", 체력 : " + unit.getHp());
    }
}
