package creational.singletone;

import java.util.ArrayList;
import java.util.List;

public class EagerInitializedSingleTone {
    private final List<String> someList;
    private String someName;

    // 이른 초기화 방법. 아래 getInstance()에서 null 체크를 할 필요가 없으며 synchronized 하지 않아도 된다.
    private final static EagerInitializedSingleTone singleToneInstance = new EagerInitializedSingleTone();

    private EagerInitializedSingleTone() {
        someList = new ArrayList<>();
        someName = "someName";
    }

    public synchronized static EagerInitializedSingleTone getInstance() {
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
