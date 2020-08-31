package br.com.facade;

import br.com.facade.domain.Cart;
import br.com.facade.domain.Product;
import br.com.facade.repository.ProductRepository;
import br.com.facade.repository.CartRepository;
import br.com.facade.repository.StockRepository;
import org.junit.Test;

public class FacadeTest {

    @Test
    public void test_facade(){
        Product ps3 = new Product();
        ps3.setId(1L);
        ps3.setDescription("PS3");

        Product game = new Product();
        game.setId(2L);
        game.setDescription("The Last Of Us");

        Cart cart = new Cart();
        cart.addItem(ps3);
        cart.addItem(game);

        ISellFacade sellFacade = new SellFacadeImpl(new ProductRepository(), new CartRepository(), new StockRepository());
        sellFacade.makeSell(cart);

    }
}
