package cn.itcast.ssm.pojo;

import java.util.Date;

// 对应的是订单实体
public class Item {
    private int id;
    private String name;
    private float price;
    private Date cretetime;
    private String detail;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Date getCretetime() {
        return cretetime;
    }

    public void setCretetime(Date cretetime) {
        this.cretetime = cretetime;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    @Override
    public String toString() {
        return "item{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", cretetime=" + cretetime +
                ", detail='" + detail + '\'' +
                '}';
    }
}
