import java.util.*;

public class RecentlyUsedList<E> {
    private ArrayList<E> listOfElements = new ArrayList<E>();
    private int sizeOfList;

    public RecentlyUsedList(int sizeOfList) {
        this.sizeOfList = sizeOfList;
    }

    public List<E> getListOfElements() {
        return listOfElements;
    }

    public void addObjectToList(E element){

        deleteDuplicate(element);

        int index = 0;
        listOfElements.add(index,element);

        int currentSizeOfList = listOfElements.size();
        if(sizeOfList<currentSizeOfList){
            listOfElements.remove(currentSizeOfList-1);
        }
    }
    
    public void deleteDuplicate(E element) {
        ListIterator<E> iterator = listOfElements.listIterator();

        while(iterator.hasNext()){
            if(iterator.next().getClass()==element.getClass()){
                iterator.remove();

            }
        }
    }
}




