//Josefin Rahm jora8899
public class Stock extends Valuable {
    /** FAILED: ValuableTest testStockMatchesClassDiagram: Testa att klassen Stock har rätt metoder
    java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0 **/
    
    private int quantity;
    private double rate;

    public Stock(String name, int quantity, double rate){
        super(name);
        this.quantity = quantity;
        this.rate = rate;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    @Override
    public double getValue(){
        return getQuantity() * getRate();
    }

    @Override
    public String toString(){
        return "Name: " + getName() + "\nValue exkl. VAT: " + getValue() + "\nValue incl. VAT: " + getValuePlusVAT() + "\nQuantity: " + getQuantity() + "\nRate: " + getRate();
    }
}
