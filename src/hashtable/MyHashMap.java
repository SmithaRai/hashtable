package hashtable;

public class MyHashMap<K,V> {

	MyLinkedList<K> myLinkedList;


    public MyHashMap () {
        this.linkedlist = new linkedlist;

    }
    public V get(K key) {
        MyMapNode<K, V> myMapNode = (MyMapNode<K,V>) this.myLinkedList.search(key);
        return (myMapNode == null) ? null : myMapNode.getValue();


    }

    public  void add(K key,  V value) {
        MyMapNode<K,V> myMapNode = (MyMapNode<K,V>) this.myLinkedList.search(key);
        if (myMapNode == null) {
            myMapNode = new MyMapNode<>(key, value);
            this.linkedlist.append(myMapNode);
        }
        else {
            myMapNode.setValue(value);
        }
    }
    public void remove(K key){
        MyMapNode<K,V> myMapNode = (MyMapNode<K,V>) this.myLinkedList.search(key);
        if(myMapNode != null) {
            this.linkedlist.delete(myMapNode);
        }
    }

    public void printHashMap()
    {
        linkedlist.printMyNodes();
    }

    @Override
    public String toString() {
        return "MyHashmapNodes{" + linkedlist+'}';
    }

}
