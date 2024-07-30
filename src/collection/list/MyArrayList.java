package collection.list;

import java.util.Arrays;

/**
 * 정적 벼열. 크기가 정해진 배열
 */
public class MyArrayList<E> implements MyList<E> {

    private static final int DEFAULT_CAPACITY = 5;  // 배열의 기본 크기

    private Object[] elementData;    // 데이터를 담을 배열
    private int size = 0;    // 입력된 데이터 크기

    /**.
     * 기본 배열 생성
     * 생성자에는 제네릭을 사용할 수 없다.
     */
    public MyArrayList() {
        elementData = new Object[DEFAULT_CAPACITY];
    }

    /**
     * 사용자 정의 배열 객체 생성
     */
    public MyArrayList(int initialCapacity){
        elementData = new Object[initialCapacity];
    }

    /**
     * 입력된 데이터 크기 조회
     */
    @Override
    public int size(){
        return size;
    }

    /**
     * 데이터 추가
     */
    @Override
    public void add(E e){
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
    @Override
    public void add(int index, E e){
        if(size == elementData.length){
            grow();
        }

        shiftRightFrom(index, e);

        elementData[index] = e;
        size++;
    }

    /**
     * index에 있는 데이터 조회
     */
    @SuppressWarnings("unchecked")
    @Override
    public E get(int index){
        return (E) elementData[index];
    }

    /**
     * 입력된 index에 데이터 추가 후 기존 데이터 리턴
     */
    @Override
    public E set(int index, E element){
        E oldValue = get(index);
        elementData[index] = element;
        return oldValue;
    }

    @Override
    public E remove(int index){
        E oldValue = get(index);

        shiftLeftFrom(index);

        size--;
        elementData[size] = null;
        return oldValue;
    }

    /**
     * 파라미터 데이터와 일치하는 배열 속 데이터의 index 리턴
     */
    @Override
    public int indexOf(E o){
        for (int i = 0; i < size; i++) {
            if (o.equals(elementData[i]))
                return i;
        }
        return -1;
    }

    private void shiftLeftFrom(int index) {
        for (int i = index; i < size-1; i++) {
            elementData[i] = elementData[i+1];
        }
    }

    /**
     * 데이터 오른쪽으로 밀기
     */
    private void shiftRightFrom(int index, E e) {
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

    /**
     * 현재 배열 객체 리턴
     */
    public String toString(){
        return Arrays.toString(Arrays.copyOf(elementData, size)) + " size="+ size + ", capacity=" + elementData.length;
    }
}
