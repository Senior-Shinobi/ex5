
public class BobsleighTitle implements TitleGenerator{
    String c;
    String length;
    public BobsleighTitle(String com, String l) {
        c = com;
        length = l;
    }

    @Override
    public String print() {
        return length + " title generated for " + c + "\n";
    }
}