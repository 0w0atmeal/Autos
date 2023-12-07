public class Lkw extends Auto{
    boolean uebernachtungsmoeglichkeit;
    boolean tv;

    public Lkw(String farbe, int reifen, String baujahr, String kraftstoff, String marke, int ps, boolean uebernachtungsmoeglichkeit){
        super(farbe, reifen, baujahr, kraftstoff, marke, ps);
        setUebernachtungsmoeglichkeit(uebernachtungsmoeglichkeit);
    }

    public void setUebernachtungsmoeglichkeit(boolean uebernachtungsmoeglichkeit) {
        this.uebernachtungsmoeglichkeit = uebernachtungsmoeglichkeit;
    }
    public boolean getUebernachtungsmoeglichkeit() {
        return uebernachtungsmoeglichkeit;
    }

    public void setTv(boolean tv) {
        this.tv = tv;
    }
    public boolean getTv() {
        return tv;
    }
}
