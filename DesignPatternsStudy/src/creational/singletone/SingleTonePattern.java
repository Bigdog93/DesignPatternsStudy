package creational.singletone;

import java.util.ArrayList;
import java.util.List;

public class SingleTonePattern {

    private final List<String> someList;
    private String someName;

    /*
    volatile : (휘발성의) 라는 뜻.
        - Main Memory에 read & write를 보장하는 키워드
        각 CPU에서 프로세스를 실행할 때는 각 CPU 별로 Cache Memory가 있어서 성능향상을 위해 작업은 그곳에서 이뤄지고,
        그 후에 Main Memory 에 반영되는 방식이다.
        멀티 스레드 환경에서 같은 인스턴스에 접근해야 하는 상황에서, 각 CPU Cache Memory에서 작업이 이루어지면,
        싱글톤 환경에서 문제가 발생할 수 있음.
        - 아래 synchronized 키워드 없이 사용하면 어차피 똑같음.. 각 스레드에서 작업 하는 동안 Main memory 값 수정이 겹치는 상황 발생
        예) 값 x 를 읽어들여 +1 을 해줘야 하는 상황에서, 스레드1과 스레드2가 같은 작업을 수행, 원래는 x = 2가 되어야 하나
        두 스레드 모두 x = 0을 읽은 후, +1을 하고 Main Memory에 반영하는 경우...
        스레드 락을 걸어주어야 한다.
     */
    private static volatile SingleTonePattern singleToneInstance;

    private SingleTonePattern() {
        someList = new ArrayList<>();
        someName = "someName";
    }

    /*
    이 방법은 멀티 쓰레드 환경에서 싱글톤이 깨질 수 있기 때문에 쓰지 않는 것이 좋다.
    public static SingleTonePattern getInstance() {
        if(singleToneInstance == null) {
            singleToneInstance = new SingleTonePattern();
        }
        return singleToneInstance;
    }*/

    // 메소드에 synchronized 를 붙이면 호출 될때마다 스레드 락이 걸렸다 풀렸다 해서 리소스 낭비가 심함. 성능저하 발생 가능성이 높다.
    // 그래서 Double-Checked locking 방식을 사용
    public static SingleTonePattern getInstance() {
        SingleTonePattern localRef = singleToneInstance; // 지역 변수로 만들어줌으로써, 아래 코드에서 접근 속도를 향상
        if(localRef == null) { // 인스턴스가 만들어졌을 경우, 바로 인스턴르를 리턴해준다.
            synchronized (SingleTonePattern.class) { // 인스턴스가 아직 없을 때만, 스레드락 걸어줌.
                if(localRef == null) { // 스레드락 걸린 상태에서 한번 더 인스턴스 검사
                    localRef = new SingleTonePattern();
                }
            }
        }
        return localRef;
    }

    public String getListElement(int index) {
        return someList.get(index);
    }
    public int addElement(String str) {
        someList.add(str);
        return someList.size() - 1;
    }
    public int getListSize() {
        return someList.size();
    }
    public String getName() {
        return someName;
    }
    public void setName(String name) {
        someName = name;
    }

}
