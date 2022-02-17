
public class SkiNews extends NewsItem{
    @Override
    public String toString(){
        return name + "\n" + tg.print() + fg.print() + sg.print();
    }
}