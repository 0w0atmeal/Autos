public class Pkw extends Auto{
    
    boolean isofix;

    public Pkw(String farbe, int reifen, String baujahr, String kraftstoff, String marke, int ps, boolean isofix){
        super(farbe, reifen, baujahr, kraftstoff, marke, ps);
        setIsofix(isofix);
    }

    public void setIsofix(boolean isofix) {
        this.isofix = isofix;
    }
    public boolean getIsofix() {
        return isofix;
    }

    public void getInfo
}
