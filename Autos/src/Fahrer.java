import java.util.ArrayList;

public class Fahrer {
    String name;
    int alter;

    
    public Fahrer(String name, int alter){
        setName(name);
        setAlter(alter);
        setFuehrerscheine(new ArrayList<Fuehrerscheine>());
    }

    public void addFuehrerschein(Fuehrerschein fuehrerschein){
        getFuehrerscheine().add(fuehrerschein);
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public ArrayList<> getFuehrerscheine(){
        return fuehrerscheine;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }
    public int getAlter() {
        return alter;
    }
}