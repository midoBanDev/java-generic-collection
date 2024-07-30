package collection.array;

import java.util.Arrays;

/**
 * 정적 벼열. 크기가 정해진 배열
 */
public class MyArrayListV1Static {

    private static final int DEFAULT_CAPACITY = 5;  // 배열의 기본 크기

    private Object[] elementData;    // 데이터를 담을 배열
    private int size = 0;    // 입력된 데이터 크기

    /**.
     * 기본 배열 생성
     */
    public MyArrayListV1Static() {
        elementData = new Object[DEFAULT_CAPACITY];
    }

    /**
     * 사용자 정의 배열 객체 생성
     */
    public MyArrayListV1Static(int initialCapacity){
        elementData = new Object[initialCapacity];
    }

    /**
     * 입력된 데이터 크기 조회
     */
    public int size(){
        return size;
    }

    /**
     * 데이터 추가
     */
    public void add(Object e){
        elementData[size] = e;
        size++;
    }

    /**
     * index에 있는 데이터 조회
     */
    public Object get(int index){
        return elementData[index];
    }

    /**
     * 입력된 index에 데이터 추가 후 기존 데이터 리턴
     */
    public Object set(int index, Object element){
        Object oldValue = get(index);
        elementData[index] = element;
        return oldValue;
    }

    /**
     * 파라미터 데이터와 일치하는 배열 속 데이터의 index 리턴
     */
    public int indexOf(Object o){
        for (int i = 0; i < size; i++) {
            if (o.equals(elementData[i]))
                return i;
        }
        return -1;
    }

    /**
     * 현재 배열 객체 리턴
     */
    public String toString(){
        return Arrays.toString(Arrays.copyOf(elementData, size)) + " size="+ size + ", capacity=" + elementData.length;
    }
}
