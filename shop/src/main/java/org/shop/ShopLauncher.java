package org.shop;


import org.shop.api.OrderService;
import org.shop.api.SellerService;
import org.shop.api.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * The ShopLauncher class.
 */
public class ShopLauncher {
    
    /**
     * The main method.
     *
     * @param args the arguments
     */
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        ProposalInitializer proposalInitializer = (ProposalInitializer) ctx.getBean("proposalInitializer");
        OrderService orderService = ctx.getBean(OrderService.class);
        SellerService sellerService = ctx.getBean("sellerService", SellerService.class);
        UserService userService = (UserService) ctx.getBean("uS");

    }
}
