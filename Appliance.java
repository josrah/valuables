//Josefin Rahm jora8899
public class Appliance extends Valuable {
    /** FAILED: ValuableTest testApplianceMatchesClassDiagram: Testa att klassen Appliance har rätt metoder
    java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0 **/

    private double price;
    private int wear;

    public Appliance(String name, double price, int wear){
        super(name);
        this.price = price;
        this.wear = wear;
    }

    public double getPrice(){
        return price;
    }

    public int getWear(){
        return wear;
    }

    @Override
    public double getValue(){
        return getPrice() * (getWear()/10.00);
    }

    @Override
    public String toString(){
        return "Name: " + getName() + "\nValue exkl. VAT: " + getValue() + "\nValue incl. VAT: " + getValuePlusVAT() + "\nPrice: " + getPrice() + "\nWear: " + getWear();
    }
}
