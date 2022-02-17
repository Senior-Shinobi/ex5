
public class SkatingNews extends NewsItem{
    @Override
    public String toString(){
        String output="\n";
        if (a != null) {
            for (int i = 0; i < a.size(); i++) {
                output = output + "was translated to "+a.get(i) + "\n";
            }
        }
        return name + "\n" + tg.print() + fg.print() + sg.print() + output;
    }
}