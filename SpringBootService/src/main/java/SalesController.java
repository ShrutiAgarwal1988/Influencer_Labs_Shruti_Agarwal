
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

//mark class as Controller  
@RestController
public class SalesController {
    // autowire the BooksService class
    @Autowired
    SalesController Salesservice;

    // creating a get mapping that retrieves all the books detail from the database
    @GetMapping("/Sales")
    private List<Sales> getAllSales() {
        return Salesservice.getAllSales();
    }

    // creating a get mapping that retrieves the detail of a specific book
    @GetMapping("/Sales/{salesmanid}")
    private Sales getSales(@PathVariable("salesmanid") int salemanid) {
        return Salesservice.getSalesById(salemanid);
    }

    // creating a delete mapping that deletes a specified book
    @DeleteMapping("/Sales/{salesmanid}")
    private void deleteSale(@PathVariable("salesmanid") int salemanid) {
        Salesservice.delete(salemanid);
    }

    // creating post mapping that post the book detail in the database
    @PostMapping("/Sales")
    private int saveSale(@RequestBody Sales sales) {
        Salesservice.saveOrUpdate(sales);
        return Sales.getsalesmanid();
    }

    // creating put mapping that updates the book detail
    @PutMapping("/Sales")
    private Sales update(@RequestBody Sales sales) {
        Salesservice.saveOrUpdate(sales);
        return sales;
    }
}