//Josefin Rahm jora8899
public abstract class Valuable {

    private String name;
    private double vat;

    public Valuable(String name){
        this.name = name;
        vat = 0.25;
    }

    public String getName(){
        return name;
    }

    public abstract double getValue();

    public double getValuePlusVAT(){
        return getValue() + getValue() * vat;
    }

    public void setVAT(double newVAT){
        this.vat = newVAT;
    }

    @Override
    public String toString(){
        return "Name: " + getName() + "\nValue exkl. VAT: " + getValue() + "\nValue incl. VAT: " + getValuePlusVAT();
    }

}
