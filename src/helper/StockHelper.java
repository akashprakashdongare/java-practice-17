package helper;

import java.util.ArrayList;
import java.util.List;

import bean.Stock;

public class StockHelper {

    public static List<Stock> geStocks(){
        List<Stock> stocks = new ArrayList<>();
        stocks.add(new Stock(100, 120, 10));
        stocks.add(new Stock(50, 100, 100));
        return stocks;
    }
    
}
