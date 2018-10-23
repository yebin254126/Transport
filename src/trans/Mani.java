package trans;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class Mani {

    public static  void main(String [] args)
    {
         List<Transport> list=new ArrayList<>();
         list.add(new Car());
        list.add(new Airplane());
         list.add(new High_speedrail());
        for(Iterator<Transport>it=list.iterator();it.hasNext();)
        {
             it.next().input();
        }
    }
}
