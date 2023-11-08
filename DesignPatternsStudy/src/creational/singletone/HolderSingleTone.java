package creational.singletone;

import java.util.ArrayList;
import java.util.List;

public class HolderSingleTone {

    private final List<String> someList;
    private String someName;

    private HolderSingleTone() {
        someList = new ArrayList<>();
        someName = "someName";
    }

    // instance 를 리턴할 Holder inner class 생성하기 (double-checked locking 쓰면 알아서 Intellij 가 추천해주더라)
    private static final class SingleToneInstanceHolder {
        private static final HolderSingleTone singleToneInstance = new HolderSingleTone();
    }

    /*
    이 방법은 클래스안에 클래스(Holder)를 두어 JVM의 클래스 로더 매커니즘과 클래스가 로드되는 시점을 이용한 방법이다.
    Lazy Initialization 방식을 가져가`면서 Thread간 동기화 문제를 동시에 해결할 수 있다.

    중첩클래스 Holder는 getInstance()메서드가 호출되기 전에는 참조되지 않으며, 최초로 getInstance()메서드가
    호출될 때, 클래스 로더에 의해 싱글톤 객체를 생성하여 리턴한다.

    우리가 알아야 할 것은 Holder 안에 선언된 instance가 static이기 때문에, 클래스 로딩 시점에 한번만 호출된다는 점을 이용한 것이다.
    또 final을 사용해서 다시 값이 할당되지 않도록 한다.

    현재까지 가장 많이 사용되는 방법이다.`
    */

    public static HolderSingleTone getInstance() {
        return SingleToneInstanceHolder.singleToneInstance;
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
