package singletone;

public class SingleToneMain {
    public static void main(String[] args) {
        SingleTonePattern singleTone = SingleTonePattern.getInstance();

        singleTone.addElement("영번째 요소입니다.");
        singleTone.setName("new Name");

        SingleTonePattern otherTone = SingleTonePattern.getInstance();

        System.out.println("singleTone.getName()            : " + singleTone.getName());
        System.out.println("singleTone.getListElement(0)    : " + singleTone.getListElement(0));
        System.out.println("otherTone.getName()             : " + otherTone.getName());
        System.out.println("otherTone.getListElement(0)     : " + otherTone.getListElement(0));

    }
}
