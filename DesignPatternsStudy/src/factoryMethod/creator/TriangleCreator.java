package factoryMethod.creator;

import factoryMethod.product.Product;
import factoryMethod.product.TriangleProduct;

public class TriangleCreator extends Creator{
    @Override
    public Product createProduct() {
        return new TriangleProduct();
    }
}
