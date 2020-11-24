import java.util.ArrayList;

public class Map<K, V> {
    private ArrayList<HashNode<K,V>> hexArray;
    private int hexArrayCapacity;
    private int size;

    public Map() {
        hexArray = new Arraylist<>();
        hexArrayCapacity = 10;
        size = 0;

        for(int i =0; i < hexArrayCapacity; i++)
        {
            hexArray.add(null);
        }
    }

    public int getSize()
    {
        return size;
    }
    public boolean isEmpty()
    {
        return (getSize() == 0);
    }

    private int getIndex(K key) {
        int hashcode = key.hashCode();
        int index = hashcode % hexArrayCapacity;
        return index;
    }
    public V removeKey (K key)
    {
        int index = getIndex(key);
        HashNode<K,V> head = hexArray.get(index);
        HashNode<K,V> prev = null;
        while(head != null)
        {
            if(head.key.equals(key))
            {
                break;
            }
            prev = head;
            head = head.next;
        }
        if(head == null)
        {
            return null;
        }
        size--;
        if(prev!=null)
            prev.next=head.next;
        else {
            hexArray.set(index,head.next);
        }
        return head.value;
    }
    public V getValue(K key)
    {
        int index = getIndex(key);
        HashNode<K,V> head = hexArray.get(index);

        while(head != null) {
            if(head.key.equals(key))
                return head.value;
            head = head.next;
        }
        return null;
    }
    public void addKeyValue(K key, V value)
    {
        int index = getIndex(key);
        HashNode<K,V> head = hexArray.get(index);

        while(head==null)
        {
            if (head.key.equals(key))
            {
                head.value = value;
            }

        }


    public String getValue(String  identifier) {

        return identifier;
    }
}
