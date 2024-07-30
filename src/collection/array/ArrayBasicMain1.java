package collection.array;

import java.util.Arrays;

public class ArrayBasicMain1 {

    public static void main(String[] args) {
        int[] arr = new int[5];

        System.out.println("==index 입력: 0(1)==");
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;

        System.out.println(Arrays.toString(arr));

        System.out.println("==index 변경: 0(1)==");
        arr[2] = 10;
        System.out.println(Arrays.toString(arr));

        /**
         * 배열의 경우 인덱스를 사용하면 아무리 많은 데이터가 있어도 한 번의 계산으로 자료의 위치를 찾을 수 있다.
         * 인덱스를 사용하는 경우 입력, 변경, 조회 모두 한 번의 연산만으로 처리가 가능하다.
         * 따라서 배열의 인덱스를 통한 처리는 압도적인 성능을 보여준다.
         *
         * 최초 배열의 생성된 시점의 주소값(배열의 시작 참조값)에 자료의 크기와 인덱스의 곱을 더하여 해당 위치를 찾는다.
         * int의 크기는 4byte이다. 주소값이 x100인 경우
         * x100 + (4byte * index) 의 연산으로 자료의 위치를 찾는다.
         *
         */
        System.out.println("==index 조회: 0(1)==");
        System.out.println("arr[2] = " + arr[2]);

        /**
         * 배열의 크기와 검색 연산 : 검색의 경우 배열의 크기만큼 연산이 필요하다.
         * - 배열의 크기 1: arr[0] 연산 1회
         * - 배열의 크기 2: arr[0], arr[1] 연산 2회
         * - 배열의 크기 3: arr[0], arr[1], arr[2] 연산 3회
         * - 배열의 크기 10: arr[0], arr[1], arr[2] ... arr[9] 연산 10회
         * - 배열의 크기 1000: arr[0], arr[1], arr[2] ... arr[999] 연산 1000회
         *
         * 배열에서 자료를 찾을 때 만약 인덱스의 위치를 사전에 연산할 수 있는 상황이라면
         * for loop를 돌려서 찾는 것보다 인덱스를 구한 후 바로 찾는 것이 성능상 유리하다.
         *
         */
        System.out.println("==index 검색: 0(n)==");
        System.out.println(Arrays.toString(arr));
        int value = 10;
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr["+i+"]:"+arr[i]);
            if(value == arr[i]){
                System.out.println(value + " 찾음");
                break;
            }
        }
    }

}
