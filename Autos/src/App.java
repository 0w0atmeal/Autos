import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {

        Fuehrerschein KlasseB = new Fuehrerschein("B");
        Fuehrerschein KlasseBE = new Fuehrerschein("BE");
        Fuehrerschein KlasseC = new Fuehrerschein("C");
        Fuehrerschein KlasseCE = new Fuehrerschein("CE");
        Fuehrerschein KlasseD = new Fuehrerschein("D");

        Fahrer f1 = new Fahrer("A", 20);

        Lkw l1 = new Lkw("grau", 8, "2019", "Diesel", "MAN", 200, false);
        
        Pkw p1 = new Pkw("weiss", 4, "1999", "Diesel", "BMW", 200, true);
    
        Bus b1 = new Bus("rot", 6, "2021", "Strom", "VW", 200);
       

        ArrayList<Auto> autos = new ArrayList<>();
        autos.add(b1);
        autos.add(p1);
        autos.add(l1);

        for(Auto auto : autos){
            if(auto.getClass() == Lkw.class){
                Lkw lkw = (Lkw) auto;
                System.out.println(lkw.getBaujahr() + " " + lkw.getFarbe() + " " + lkw.getKraftstoff() + " "+ lkw.getMarke() + " "+lkw.getPs() + " " +lkw.getReifen() + " " + lkw.getUebernachtungsmoeglichkeit() + lkw.getTv());
            }
            if (auto.getClass() == Pkw.class);{
                Pkw pkw = (Pkw) auto;
                System.out.println(pkw.getBaujahr() + " " + pkw.getFarbe() + " " + pkw.getKraftstoff() + " "+ pkw.getMarke() + " "+ pkw.getPs() + " " + pkw.getReifen()); 
            } 
            if (auto.getClass() == Bus.class);{
                Bus bus = (Bus) auto;
                System.out.println(bus.getBaujahr() + " " + bus.getFarbe() + " " + bus.getKraftstoff() + " "+ bus.getMarke() + " "+ bus.getPs() + " " + bus.getReifen() + " " + bus.getMedienpacket() + bus.getToilette()); 
                
            }
        }
    }
}
