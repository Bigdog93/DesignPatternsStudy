package structural.adapter;

// adapter 클래스는 호환되지 않으나 사용하고 싶은 클래스를 멤버필드로 가지고 있어.
// 그리고 기존에 사용하고 있던 호환하고 싶은 클래스의 interface 를 상속받아 adapter 를 구현하면서
// 호환되지 않는 메소드를 adapter 안에서 호환되도록 변환, 처리 후에 사용하게 하면 adapter 완성!
public class AdapterMain {
    public static void main(String[] args) {
        ClientInterface adapter = new Adapter(new Service());

        adapter.method(1);
    }
}
