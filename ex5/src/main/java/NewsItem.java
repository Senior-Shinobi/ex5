import java.util.ArrayList;

public class NewsItem {
    String name;
    String com;
    TitleGenerator tg;
    FederationGenerator fg;
    SummaryGenerator sg;
    ArrayList a;

    void setName(String name) {
        this.name = name;
    }
    void setCom(String c) {
        this.com = c;
    }

    void update(String s,String l){
        if (s == "skating"){
            tg = new SkatingTitle(com,l);
            fg = new SkatingFed(com,l);
            sg = new SkatingSum(com,l);
        }
        if (s == "ski"){
            tg = new SkiTitle(com,l);
            fg = new SkiFed(com,l);
            sg = new SkiSum(com,l);
        }
        if (s == "bobsleigh"){
            tg = new BobsleighTitle(com,l);
            fg = new BobsleighFed(com,l);
            sg = new BobsleighSum(com,l);
        }
        if (s == "hockey"){
            tg = new HockeyTitle(com,l);
            fg = new HockeyFed(com,l);
            sg = new HockeySum(com,l);
        }
    }

    String getName() {
        return name;
    }

    public String toString(){
        return name;
    }

    public NewsItem addTranslation(ArrayList<String> strings) {
        a = strings;
        return this;
    }
}

