package factoryMethod.creator;

import factoryMethod.product.Product;
import factoryMethod.product.SquareProduct;

public class SquareCreator extends Creator{
    @Override
    public Product createProduct() {
        return new SquareProduct();
    }
}
