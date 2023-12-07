public class Bus extends Auto{
    
    boolean medienpacket;
    boolean toilette;

    public Bus(String farbe, int reifen, String baujahr, String kraftstoff, String marke, int ps){
        super(farbe, reifen, baujahr, kraftstoff, marke, ps);
        setMedienpacket(medienpacket);
        setToilette(toilette);
    }

    public void setMedienpacket(boolean medienpacket) {
        this.medienpacket = medienpacket;
    }
    public void setToilette(boolean toilette) {
        this.toilette = toilette;
    }
    public boolean getMedienpacket() {
        return medienpacket;
    }
    public boolean getToilette() {
        return toilette;
    }
}
