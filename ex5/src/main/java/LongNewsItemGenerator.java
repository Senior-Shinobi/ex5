

public class LongNewsItemGenerator implements NewsItemGenerator {


    public LongNewsItemGenerator(){

    }

    @Override
    public NewsItem publish(String a, String b){
        if (a == "skating"){
            System.out.println("preparing figure skating news");
            NewsItem n = new SkatingNews();
            System.out.println("editing news item");
            n.setName("long figure skating news item");
            n.setCom(b);
            n.update(a,"long");
            System.out.println("finalizing item");
            return n;
        }
        if (a == "ski"){
            System.out.println("preparing skiing news");
            NewsItem n = new SkiNews();
            System.out.println("editing news item");
            n.setName("long skiing news item");
            n.setCom(b);
            n.update(a,"long");
            System.out.println("finalizing item");
            return n;
        }
        if (a == "bobsleigh"){
            System.out.println("preparing bobsleigh news");
            NewsItem n = new BobsleighNews();
            System.out.println("editing news item");
            n.setName("long bobsleigh news item");
            n.setCom(b);
            n.update(a,"long");
            System.out.println("finalizing item");
            return n;
        }
        if (a == "hockey"){
            System.out.println("preparing hockey news");
            NewsItem n = new HockeyNews();
            System.out.println("editing news item");
            n.setName("long hockey news item");
            n.setCom(b);
            n.update(a,"long");
            System.out.println("finalizing item");
            return n;
        }


        return null;
    }

}

