package helper;

import java.util.DoubleSummaryStatistics;
import java.util.stream.Collector;

import bean.Stock;

public class StockStatistics {

    private DoubleSummaryStatistics profitStat = new DoubleSummaryStatistics();
    private DoubleSummaryStatistics actualStat = new DoubleSummaryStatistics();

    public void accept(Stock stock){
        profitStat.accept(stock.getProfit());
        actualStat.accept(stock.getActual());
    }

    public StockStatistics combine(StockStatistics other){
        profitStat.combine(other.getProfitStat());
        actualStat.combine(other.getActualStat());
        return this;
    }

    public static Collector<Stock, ?, StockStatistics> collector(){
        return Collector.of(StockStatistics::new, StockStatistics::accept, StockStatistics::combine);
    }

    public DoubleSummaryStatistics getProfitStat() {
        return profitStat;
    }

    public DoubleSummaryStatistics getActualStat() {
        return actualStat;
    }
  

    
}
