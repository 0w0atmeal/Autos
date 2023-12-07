public class Auto {
    String farbe;
    int reifen;
    String marke;
    String typ;
    String kraftstoff;
    int ps;
    String baujahr;

    
    public Auto(String farbe, int reifen, String baujahr, String kraftstoff, String marke, int ps){
        setFarbe(farbe);
        setReifen(reifen);
        setBaujahr(farbe);
        setKraftstoff(kraftstoff);
        setMarke(marke);
        setPs(ps);
        
        
    }

    public void setFarbe(String farbe){
        this.farbe = farbe;
    }

    public String getFarbe() {
        return farbe;
    }

    public void setReifen(int reifen) {
        this.reifen = reifen;
    }

    public int getReifen() {
        return reifen;
    }

    public void setBaujahr(String baujahr) {
        this.baujahr = baujahr;
    }

    public void setKraftstoff(String kraftstoff) {
        this.kraftstoff = kraftstoff;
    }
    public void setMarke(String marke) {
        this.marke = marke;
    }
    public void setPs(int ps) {
        this.ps = ps;
    }
    public void setTyp(String typ) {
        this.typ = typ;
    }
    public String getBaujahr() {
        return baujahr;
    }
    public String getKraftstoff() {
        return kraftstoff;
    }
    public String getMarke() {
        return marke;
    }
    public int getPs() {
        return ps;
    }
    public String getTyp() {
        return typ;
    }
    
}
