package creational.abstractFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class abstractFactoryMain {
    public static void main(String[] args) throws IOException {
        FactoryCondition con = null;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("OS 가 무엇입니까?");
        System.out.println("1. Win");
        System.out.println("2. Mac");

        String answer = br.readLine();

        if(answer.equals("1")) {
            con = FactoryCondition.WIN;
        }else if(answer.equals("2")) {
            con = FactoryCondition.MAC;
        }else {
            System.out.println("잘못된 입력입니다.");
            return;
        }

        AbsFactoryApplication absFactory = new AbsFactoryApplication(con);

        absFactory.createCheckBox();
        absFactory.createButton();
        absFactory.paintButton();
        absFactory.paintCheckBox();
    }
}
