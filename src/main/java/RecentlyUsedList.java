import java.util.*;

public class RecentlyUsedList<E> {
    private List listOfElements = new ArrayList<E>();
    private static int sizeOfList = 3;


//    public RecentlyUsedList(List listOfElements, int sizeOfList) {
//        this.listOfElements = listOfElements;
//        this.sizeOfList = sizeOfList;
//    }


    public List<E> getListOfElements() {
        return listOfElements;
    }

    public void addObjectToList(E element){
        checkIfDuplicate(element);
        int index =0;
        listOfElements.add(index,element);
    }

    public void getAllElements(List<E> listOfElements){
        Iterator<E> eIterator = listOfElements.iterator();

        while(eIterator.hasNext()){
            E currentElement = eIterator.next();
            printElementAndItsType(currentElement);
        }
    }

    public List<E> removeDuplicateElements(List<E> listOfElements){
        List<E> newListOfElements = new ArrayList<E>();
        for(E element: listOfElements){

            if(!newListOfElements.contains(element)){
                newListOfElements.add(element);
            }
        }
        return newListOfElements;
    }

    public void printElementAndItsType(E element){
        System.out.println(element);
        System.out.println(element.getClass());
    }

    public boolean checkIfDuplicate(E element){
        Iterator<E> eIterator = this.listOfElements.iterator();

        while(eIterator.hasNext()){
            E currentElement = eIterator.next();
            if (currentElement.getClass() == element.getClass()){
                return true;
            }
        }
        return false;
    }
    public E returnDuplicateElement(E element){
        Iterator<E> eIterator = this.listOfElements.iterator();

        while(eIterator.hasNext()){
            E currentElement = eIterator.next();
            if (currentElement.getClass() == element.getClass()){
                return currentElement;
            }
        }
        return null;
    }

    public boolean checkSizeOfList(List<E> listOfElements){
        if (listOfElements.size()<=sizeOfList){
            return true;
        }
        return false;
    }

    public void controller(List<E> listOfElements, E element){
        if (checkSizeOfList(listOfElements)){
            if (!checkIfDuplicate(element)){
                addObjectToList(element);
            }
            E duplicateElement = returnDuplicateElement(element);
            listOfElements.remove(duplicateElement);

        }
    }


































}



