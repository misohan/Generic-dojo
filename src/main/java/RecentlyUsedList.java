import java.util.*;

public class RecentlyUsedList<E> {
    private List listOfElements = new ArrayList<E>();

    public List<E> getListOfElements() {
        return listOfElements;
    }

    public List<E> addObjectList(E e){


        listOfElements.add(e);

        return listOfElements;
    }

    public void removeDuplicteElements(List<E> listOfElements){

        Iterator<E> eIterator = listOfElements.iterator();
        int secondElementIndex = 0;
        while(eIterator.hasNext()){
            E currentElement = eIterator.next();
            System.out.println(currentElement);
            if(currentElement.getClass()== listOfElements.get(1).getClass()){
                listOfElements.remove(eIterator);
                System.out.println("Element removed");
            } else{
                System.out.println("No same element found so far");
                secondElementIndex++;

            }


        }
    }


}
