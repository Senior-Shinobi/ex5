
public class SkatingSum implements SummaryGenerator{
    String c;
    String length;
    public SkatingSum(String com, String l) {
        c = com;
        length = l;
    }

    @Override
    public String print() {
        return length + " summary generated for " + c + "\n";
    }
}