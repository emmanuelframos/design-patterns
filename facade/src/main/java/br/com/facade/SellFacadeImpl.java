package br.com.facade;

import br.com.facade.domain.Cart;
import br.com.facade.repository.ProductRepository;
import br.com.facade.repository.CartRepository;
import br.com.facade.repository.StockRepository;

public class SellFacadeImpl implements ISellFacade {

    private ProductRepository productRepository;
    private CartRepository cartRepository;
    private StockRepository stockRepository;

    public SellFacadeImpl(ProductRepository productRepository, CartRepository cartRepository, StockRepository stockRepository) {
        this.productRepository = productRepository;
        this.cartRepository = cartRepository;
        this.stockRepository = stockRepository;
    }

    @Override
    public void makeSell(Cart cart) {
        cartRepository.createSell();

        cart.getItems().forEach(item -> {
            System.out.printf("Processing item: %d - %s\n", item.getId(), item.getDescription());
            productRepository.attach();
            stockRepository.update();
        });
    }
}