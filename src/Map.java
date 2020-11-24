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
    private getIndex(K key) {
        int hashcode = key.hashCode();
        int index = hashcode % hexArrayCapacity;
        return
    }
    public String getValue(String  identifier) {

        return identifier;
    }
}
