package creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class Employees implements Cloneable{

    private List<String> empList;

    public Employees() {
        empList = new ArrayList<>();
    }
    public Employees(List<String> list) {
        this.empList = list;
    }

    public void loadData() {
        empList.add("Ann");
        empList.add("David");
        empList.add("John");
        empList.add("Methew");
    }

    public List<String> getEmpList() {
        return empList;
    }

    @Override
    public Employees clone() {
//        List<String> origin = this.getEmpList();
//        List<String> copy = new ArrayList<>(origin);
//        return new Employees(copy);
        return new Employees(new ArrayList<>(this.getEmpList()));
    }
}
