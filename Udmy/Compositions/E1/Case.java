package Composition;

/**
 * Created by ahmetturkmen on 2/4/17.
 */
public class Case {

    private String model;
    private String manufacturer;
    private String powerSupply;
    private Dimension dimensions;


    public Case(String model, String manufacturer, String powerSupply, Dimension dimensions) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.powerSupply = powerSupply;
        this.dimensions = dimensions;
    }

    public void pressPowerButton(){

        System.out.println("Power button is pressed. ");
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getPowerSupply() {
        return powerSupply;
    }

    public Dimension getDimensions() {
        return dimensions;
    }
}
