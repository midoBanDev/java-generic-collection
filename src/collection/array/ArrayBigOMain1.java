package collection.array;

import java.util.Arrays;

/**
 * 빅오 표기법 - 알고리즘의 성능을 분석할 때 사용하는 수학적 표현 방식
 * 알고리즘을 실행했을 때 데이터의 양이 증가할 때, 그 알고리즘이 얼마나 빠르게 실행되는지 나타낸다.
 * 정확하게 알고리즘의 실행 시간을 계산하는게 아니라. 데이터의 크기에 따른 성능 변화의 추이를 알기 위한 것이다.
 *
 * 빅오 표기법 특징
 *  대량의 데이터를 입력한다고 가정한다.
 *  최악의 상황을 가정하여 표기한다. 때론 최적, 평균, 최악으로 분류하여 표기하기도 한다.
 *
 * 빅오 표기법의 예시
 *  O(1) - 상수 시간: 입력 데이터의 크기에 관계없이 알고리즘의 실행 시간이 일정한다.
 *          예) 배열에서 인덱스를 사용하는 경우
 *
 *  O(n) - 선형 시간: 알고리즘의 실행 시간이 입력 데이터의 크기에 비례하여 증가한다.
 *          예) 배열의 검색, 배열의 모든 요소를 순회하는 경우
 *
 *  O(n²) - 제곱 시간: 알고리즘의 실행 시간이 입력 데이터의 크기의 제곱에 비례하여 증가한다.
 *          n²은 n * n 을 뜻한다.
 *          예) 보통 이중 루프를 사용하는 알고리즘에서 나타남
 *
 * O(log n) - 로그 시간: 알고리즘의 실행 시간이 데이터 크기의 로그에 비례하여 증가한다.
 *          예) 이진 탐색
 *
 * O(n log n) - 선형 로그 시간:
 *          예) 많은 효율적인 정렬 알고리즘들
 *
 *
 */
public class ArrayBigOMain1 {

    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 2;

        System.out.println(Arrays.toString(arr));

        // 배열의 첫 번째 위치에 추가
        // 기본 배열의 데이터를 한 칸씩 뒤로 밀고 배열의 첫 번째 위치에 추가
        System.out.println("배열의 첫번째 위치에 3 추가 O(n)");
        int newValue = 3;
        addFirst(arr, newValue);
        System.out.println(Arrays.toString(arr));

        // index 위치에 추가
        // 기본 배열의 데이터를 한 칸씩 밀고 배열의 index 위치에 추가
        System.out.println("배열의 index(2) 위치에 4 추가 O(n)");
        int index =2;
        int indexValue =4;
        addAtIndex(arr, index, indexValue);
        System.out.println(Arrays.toString(arr));

        System.out.println("배열의 마지막 위치에 5 추가 O(1)");
        addLast(arr, 5);
        System.out.println(Arrays.toString(arr));

    }

    private static void addFirst(int[] arr, int firstValue) {
        for (int i = arr.length - 1; i > 0 ; i--) {
            arr[i] = arr[i-1];
        }
        arr[0] = firstValue;
    }

    private static void addAtIndex(int[] arr, int index, int middleValue) {
        for (int i = arr.length-1; i > index; i--) {
            arr[i] = arr[i-1];
        }
        arr[index] = middleValue;
    }

    private static void addLast(int[] arr, int lastValue) {
        arr[arr.length-1] = lastValue;
    }




}
