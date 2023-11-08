package creational.factoryMethod.creator;

import creational.factoryMethod.product.Product;
import creational.factoryMethod.product.SquareProduct;

public class SquareCreator extends Creator{
    @Override
    public Product createProduct() {
        return new SquareProduct();
    }
}
