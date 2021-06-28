//Josefin Rahm jora8899
public class Jewellery extends Valuable {
    /**FAILED: ValuableTest testJewelleryMatchesClassDiagram: Testa att klassen Jewellery har rätt metoder
    java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0 **/

    private int jewels;
    private Material material;

    public enum Material{
        Guld, Silver;
    }

    public Jewellery(String name, int numberOfJewels, String material){
        super(name);
        this.jewels = numberOfJewels;
        this.material = Material.valueOf(material);
    }

    public int getJewels() {
        return jewels;
    }

    public Material getMaterial(){ 
        return material;
    }

    @Override
    public double getValue(){
        if (material == Material.Guld){
            return 2000 + getJewels() * 500;
        } else if (material == Material.Silver){
            return 700 + getJewels() * 500;
        }
        return 0;
    }

    @Override
    public String toString(){
        return "Name: " + getName() + "\nValue exkl. VAT: " + getValue() + "\nValue incl. VAT: " + getValuePlusVAT() + "\nNumber of jewels: " + getJewels() + "\nMaterial: " + getMaterial();
    }
}
