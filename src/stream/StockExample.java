package stream;

import helper.StockHelper;
import helper.StockStatistics;
import utils.PrintMessageUtil;

public class StockExample {
    public static void main(String[] args) {
        PrintMessageUtil.printMsg("two sum in single stream");
        StockStatistics statistics = StockHelper.geStocks().stream().collect(StockStatistics.collector());
        System.out.println("Sum of actual : " + statistics.getActualStat().getSum());
        System.out.println("Sum of profit : " + statistics.getProfitStat().getSum());

    }
}
