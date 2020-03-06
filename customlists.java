package customlist;

public class customlists {

   public static void main(String[] args) 
   {
       DataList<Integer> list = new DataList<>();

       list.add(1);
       list.add(2);
       list.add(3);
       for(int i=0;i<list.size();i++) {
           System.out.print(list.get(i));
       }
       System.out.println();
        
    
       list.remove(2);
       
       for(int i=0;i<list.size();i++) {
           System.out.print(list.get(i));
       }
    System.out.println();
       System.out.println( list.get(0) );
       System.out.println( list.get(1) );

       System.out.println(list.size());
   }
}
 class DataList<E> 
{
   
    private int size = 0;
     
    private Object elements[];
 
    //Default constructor
    public DataList() {
        elements = new Object[10];
    }
    public void add(E e) {
        elements[size++] = e;
    }
    public E get(int i) {
        return  (E)elements[i];
    }
     
    public E remove(int i) {
        if (i >= size || i < 0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
        }
        Object item = elements[i];
        int numElts = elements.length - ( i + 1 ) ;
        System.arraycopy( elements, i + 1, elements, i, numElts ) ;
        size--;
        return ((E) item);
    }
     
    public int size() {
        return size;
    }
 
        
}