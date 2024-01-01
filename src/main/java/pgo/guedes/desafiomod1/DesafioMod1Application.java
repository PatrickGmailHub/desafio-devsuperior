package pgo.guedes.desafiomod1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pgo.guedes.desafiomod1.entites.Order;
import pgo.guedes.desafiomod1.services.OrderService;
import pgo.guedes.desafiomod1.services.ShippingService;

import java.util.function.DoubleToIntFunction;

@SpringBootApplication
public class DesafioMod1Application implements CommandLineRunner {

    @Autowired
    private OrderService orderService;

    public static void main(String[] args) {

        SpringApplication.run(DesafioMod1Application.class, args);

    }

    @Override
    public void run(String... args) throws Exception {

        var order = new Order(1034, 150.0, 20.0);

        System.out.printf("Pedido código %d\n", order.getCode());
        System.out.printf("Valor total:  R$ %.2f", orderService.total(order));
    }
}
