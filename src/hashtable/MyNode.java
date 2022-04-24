package hashtable;

public interface MyNode<K> {

	 K getKey();
	    void setKey();

	    MyNode getNext();
	    void setNext(MyNode<K> tempNode);
}
