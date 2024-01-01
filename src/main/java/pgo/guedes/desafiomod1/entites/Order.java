package pgo.guedes.desafiomod1.entites;

public class Order {

    public Order() {
    }

    public Order(Integer code, Double basic, Double discount) {
        this.code = code;
        this.basic = basic;
        this.discount = discount;
    }

    private Integer code;
    private Double basic;
    private Double discount;

    public Integer getCode() {
        return code;
    }

    public Double getBasic() {
        return basic;
    }

    public Double getDiscount() {
        return discount;
    }
}
