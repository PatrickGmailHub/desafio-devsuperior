package pgo.guedes.desafiomod1.services;

import org.springframework.stereotype.Service;
import pgo.guedes.desafiomod1.entites.Order;

@Service
public class ShippingService {

   public double shipment(Order order) {
        if(order.getBasic() < 100) {
            return 20.0;
        } else if (order.getBasic() >= 100 && order.getBasic() < 200) {
            return 12.0;
        } else {
            return 0.0;
        }
    }

}
