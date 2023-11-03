package singletone;

import java.util.ArrayList;
import java.util.List;

public class SingleTonePattern {

    private final List<String> someList;
    private String someName;

    private static SingleTonePattern singleToneInstance;

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
        if(singleToneInstance == null) { // 인스턴스가 만들어졌을 경우, 바로 인스턴르를 리턴해준다.
            synchronized (SingleTonePattern.class) { // 인스턴스가 아직 없을 때만, 스레드락 걸어줌.
                if(singleToneInstance == null) { // 스레드락 걸린 상태에서 한번 더 인스턴스 검사
                    singleToneInstance = new SingleTonePattern();
                }
            }
        }
        return singleToneInstance;
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
