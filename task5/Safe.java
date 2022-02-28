package task5;
import java.util.ArrayList;
public class Safe {
    private ArrayList<Thing> bestItems = null;
    private int maxSize;
    private int bestPrice;
    public Safe(int maxSize){
        this.maxSize = maxSize;
    }

    private int CalcWeigth(ArrayList<Thing> items)    //  размер списка предметов
    {
        int sumSize = 0;
        for (int i = 0; i < items.size(); i++){
            sumSize += items.get(i).getSize();
        }
        return sumSize;
    }
    private int CalcPrice(ArrayList<Thing> items)   // стоимость списка предметов
    {
        int sumPrice = 0;
        for (int i = 0; i < items.size(); i++){
            sumPrice += items.get(i).getValue();
        }
        return sumPrice;
    }

    private void CheckSet(ArrayList<Thing> items)  // сравнивание списка из сейфа со заданым списком
    {
        if (bestItems == null)
        {
            if (CalcWeigth(items) <= maxSize)
            {
                bestItems = items;
                bestPrice = CalcPrice(items);
            }
        }
        else
        {
            if(CalcWeigth(items) <= maxSize && CalcPrice(items) > bestPrice)
            {
                bestItems = items;
                bestPrice = CalcPrice(items);
            }
        }
    }

    public void MakeAllSets(ArrayList<Thing> items)         //перебирает все возможные наборы (перестановки) предметов
    {
        if (items.size() > 0)
            CheckSet(items);
        for (int i = 0; i < items.size(); i++)
        {
            ArrayList<Thing> newSet = new ArrayList<Thing>(items);
            newSet.remove(i);
            MakeAllSets(newSet);
        }

    }
    public ArrayList<Thing> GetBestSet()
    {
        return bestItems;
    }

    public void PrintSafe(){
        for (int i = 0; i < bestItems.size(); i++) {
            System.out.println(bestItems.get(i).name );
        }
    }

}
