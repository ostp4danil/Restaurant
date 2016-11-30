package daoandmodels.stock;

import org.hibernate.SessionFactory;

import java.util.List;

/**
 * Created by mokujin on 29.11.16.
 */
public class IStockDAO implements StockDAO {

    SessionFactory sessionFactory;
    public List<Stock> getAll() {
        return null;
    }

    public Stock get(Integer id) {
        return null;
    }

    public void add(Stock stock) {

    }

    public void delete(Integer id) {

    }

    public void edit(Stock stock) {

    }
}
