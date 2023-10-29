package factoryMethod;

import factoryMethod.creator.Creator;
import factoryMethod.creator.SquareCreator;
import factoryMethod.creator.TriangleCreator;
import factoryMethod.product.Product;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class FactoryMethodMain {
    public static void main(String[] args) throws Exception {
        Creator factory;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("제품 형태를 선택하세요. \n 1. 사각형 \n 그 외. 삼각형");
        String number = br.readLine();

        // 팩토리 메서드 패턴을 사용했을 경우

        if(number.equals("1")) {
            factory = new SquareCreator();
        }else {
            factory = new TriangleCreator();
        }

        System.out.println("공장이 완성되었습니다.");
        factory.someOperation();

        Product product = factory.createProduct();

        product.doStuff();

        // 만약 팩토리 메서드 패턴을 사용하지 않는다면?
/*
        if(number.equals("1")) {
            SquareProduct squareProduct = new SquareProduct();
            squareProduct.doStuff();
        }else {
            TriangleProduct triangleProduct = new TriangleProduct();
            triangleProduct.doStuff();
        }
*/

    }
}
