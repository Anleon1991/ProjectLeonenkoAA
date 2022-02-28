package task5;
import java.util.ArrayList;
public class WorkSafe {
    public static void main(String[] args){
        ArrayList<Thing> items = new ArrayList<Thing>();
        items.add(new Thing("цепочка", 1, 5000));
        items.add(new Thing("слиток", 3, 10000));
        items.add(new Thing("Папка с докуменатми", 2, 100));
        items.add(new Thing("Ноутбук", 2, 7000));
        items.add(new Thing("телефон", 1, 2000));
        Safe valburg = new Safe(3);
        valburg.MakeAllSets(items);
        valburg.GetBestSet();
        for (int i = 0; i < items.size(); i++) {
            System.out.println(items.get(i).name );
        }
        System.out.println("----------------------");
        valburg.PrintSafe();

    }

}
