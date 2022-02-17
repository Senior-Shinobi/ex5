
public class BobsleighNews extends NewsItem{
    @Override
    public String toString(){
        return name + "\n" + tg.print() + fg.print() + sg.print();
    }
}