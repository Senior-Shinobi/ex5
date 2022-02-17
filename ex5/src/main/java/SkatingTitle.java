

public class SkatingTitle implements TitleGenerator{
    String c;
    String length;
    public SkatingTitle(String com, String l) {
        c = com;
        length = l;
    }

    @Override
    public String print() {
        return length + " title generated for " + c + "\n";
    }
}