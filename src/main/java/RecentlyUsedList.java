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

    public void getAllElements(List<E> listOfElements){

        Iterator<E> eIterator = listOfElements.iterator();

        while(eIterator.hasNext()){
            E currentElement = eIterator.next();
            System.out.println(currentElement);

            }


        }
    }



