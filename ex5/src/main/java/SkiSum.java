
public class SkiSum implements SummaryGenerator{
    String c;
    String length;
    public SkiSum(String com, String l) {
        c = com;
        length = l;
    }

    @Override
    public String print() {
        return length + " summary generated for " + c + "\n";
    }
}