package creational.prototype;

import java.util.List;

public class ProtoTypeMain {
    public static void main(String[] args) {
        Employees emp = new Employees();
        emp.loadData();

        Employees proto1 = emp.clone();
        Employees proto2 = emp.clone();

        List<String> list1 = proto1.getEmpList();
        List<String> list2 = proto2.getEmpList();

        list1.add("Peter");
        list2.remove("John");

        System.out.println("emps : " + emp.getEmpList());
        System.out.println("proto1 : " + proto1.getEmpList());
        System.out.println("proto2 : " + proto2.getEmpList());
    }
}
