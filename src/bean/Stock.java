package bean;

public class Stock {
    private double actual;
    private double profit;
    private double profitPercentage;

    public Stock(){}

    public Stock(double actual, double profit, double profitPercentage){
        this.actual = actual;
        this.profit = profit;
        this.profitPercentage = profitPercentage;
    }

    public double getActual() {
        return actual;
    }

    public void setActual(double actual) {
        this.actual = actual;
    }

    public double getProfit() {
        return profit;
    }

    public void setProfit(double profit) {
        this.profit = profit;
    }

    public double getProfitPercentage() {
        return profitPercentage;
    }

    public void setProfitPercentage(double profitPercentage) {
        this.profitPercentage = profitPercentage;
    }

    @Override
    public String toString() {
        return "{actual=" + actual + ", profit=" + profit + ", profitPercentage=" + profitPercentage + "}";
    }

    
    
}
