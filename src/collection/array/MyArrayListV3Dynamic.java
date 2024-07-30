package collection.array;

import java.util.Arrays;

/**
 * 동적 벼열. 크기를 동적으로 증감.
 */
public class MyArrayListV3Dynamic {

    private static final int DEFAULT_CAPACITY = 5;  // 배열의 기본 크기

    private Object[] elementData;    // 데이터를 담을 배열
    private int size = 0;    // 입력된 데이터 크기

    /**.
     * 기본 배열 생성
     */
    public MyArrayListV3Dynamic() {
        elementData = new Object[DEFAULT_CAPACITY];
    }

    /**
     * 사용자 정의 배열 객체 생성
     */
    public MyArrayListV3Dynamic(int initialCapacity){
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
        // 코드 추가
        if(size == elementData.length){
            grow();
        }

        elementData[size] = e;
        size++;
    }

    /**
     * index에 데이터 추가
     */
    public void add(int index, Object e){
        if(index > size - 1){
            throw new ArrayIndexOutOfBoundsException();
        }

        if(size == elementData.length){
            grow();
        }

        shiftRightFrom(index, e);

        elementData[index] = e;
        size++;
    }

    /**
     * 데이터 오른쪽으로 밀기
     */
    private void shiftRightFrom(int index, Object e) {
        for (int i = size; i > index; i--) {
            elementData[i] = elementData[i-1];
        }
    }

    /**
     * 배열 객체 증설
     */
    private void grow() {
        int oldCapacity = elementData.length;
        int newCapacity = oldCapacity * 2;

        elementData = Arrays.copyOf(elementData, newCapacity);
    }

    public Object remove(int index){
        Object oldValue = elementData[index];

        shiftLeftFrom(index);

        size--;
        elementData[size] = null;
        return oldValue;
    }

    private void shiftLeftFrom(int index) {
        for (int i = index; i < size - 1; i++) {
            elementData[i] = elementData[i+1];
        }
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
