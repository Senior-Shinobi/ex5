
public class BobsleighFed implements FederationGenerator{
    String c;
    String length;
    public BobsleighFed(String com, String l) {
        c = com;
        length = l;
    }

    @Override
    public String print() {
        return length + " federation generated for " + c + "\n";
    }
}