
import org.springframework.data.repository.CrudRepository;
import java.util.List;

//repository that extends CrudRepository  
public interface SalesRepository extends CrudRepository<Sales, Integer> {
    int deleteById(Sales sales);

    int delete(Sales sales);

    List<Sales> findAll();

    int save(Sales sales);

    public int saveorUpdate(Sales sales);

    List<Sales> getAllSales();
}
