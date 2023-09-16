
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//defining the business logic  
@Service
public class SalesService {
    @Autowired
    SalesRepository salesRepository;

    // getting all books record by using the method findaAll() of CrudRepository
    public List<Sales> getAllSales() {
        List<Sales> books = new ArrayList<Sales>();
        salesRepository.findAll().forEach(sale1 -> sales.add(sale1));
        return books;
    }

    // getting a specific record by using the method findById() of CrudRepository
    public Sales getSalesById(int id) {
        return salesRepository.findById(id).get();
    }

    // saving a specific record by using the method save() of CrudRepository
    public void saveOrUpdate(Sales sales) {
        salesRepository.save(sales);
    }

    // deleting a specific record by using the method deleteById() of CrudRepository
    public void delete(int id) {
        salesRepository.deleteById(id);
    }

    // updating a record
    public void update(Sales sales, int salemanid) {
        salesRepository.save(sales);
    }
}
