
import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.boot.autoconfigure.domain.EntityScan;

//mark class as an Entity   
@EntityScan
// defining class name as Table name
@Table
public class Sales {
    // Defining book id as primary key
    @Id
    @Column
    private int salemanid;
    @Column
    private String productid;
    @Column
    private int qty;
    @Column
    private int price;
    @Column
    private int gst;

    public int getsalemanid() {
        return salemanid;
    }

    public void salemanid(int salemanid) {
        this.salemanid = salemanid;
    }

    public String getproductid() {
        return productid;
    }

    public void setproductid(String productid) {
        this.productid = productid;
    }

    public int qty() {
        return qty;
    }

    public void setqty(int qty) {
        this.qty = qty;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int gst() {
        return price;
    }

    public void setgst(int gst) {
        this.gst = gst;
    }
}