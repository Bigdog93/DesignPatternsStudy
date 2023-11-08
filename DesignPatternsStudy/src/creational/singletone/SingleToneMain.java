package creational.singletone;

public class SingleToneMain {
    public static void main(String[] args) {
        HolderSingleTone singleTone = HolderSingleTone.getInstance();

        singleTone.addElement("영번째 요소입니다.");
        singleTone.setName("new Name");

        HolderSingleTone otherTone = HolderSingleTone.getInstance();

        System.out.println("singleTone.getName()            : " + singleTone.getName());
        System.out.println("singleTone.getListElement(0)    : " + singleTone.getListElement(0));
        System.out.println("otherTone.getName()             : " + otherTone.getName());
        System.out.println("otherTone.getListElement(0)     : " + otherTone.getListElement(0));

    }
}
