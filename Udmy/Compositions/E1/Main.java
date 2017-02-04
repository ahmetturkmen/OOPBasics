package Composition;

/**
 * Created by ahmetturkmen on 2/4/17.
 */
public class Main {

    public static void Main(String[] args) {

        Dimension dimension= new Dimension(20 , 20,5);
        Case theCase = new Case("220B", "Dell","240",dimension);
        Monitor monitor = new Monitor("27 inch Beast","Acer",27,new Resolution(2540,1440));
        Motherboard motherboard = new Motherboard("BJ-200","ASUS",4,6,"V2.5");

        PC pc = new PC(theCase,monitor,motherboard);

        pc.getMonitor().drawPixelAt(1500,1200,"blue");
        pc.getMotherboard().loadProgram("Windows 10");
        pc.getTheCase().pressPowerButton();

    }
}
