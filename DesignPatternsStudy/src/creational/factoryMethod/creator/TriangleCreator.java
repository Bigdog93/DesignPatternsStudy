package creational.factoryMethod.creator;

import creational.factoryMethod.product.Product;
import creational.factoryMethod.product.TriangleProduct;

public class TriangleCreator extends Creator{
    @Override
    public Product createProduct() {
        return new TriangleProduct();
    }
}
