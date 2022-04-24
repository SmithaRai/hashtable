package hashtable;

public class linkedlist<K> {

	public MyNode head;
    public MyNode tail;

    public linkedlist() {
        this.head=null;
        this.tail=null;
    }

    public void append(MyNode myNode) {
        if (this.head==null){
            this.head=myNode;
        }
        if (this.tail==null){
            this.tail=myNode;
        } else {
            this.tail.setNext(myNode);
            this.tail=myNode;
        }
    }

    public MyNode pop () {
        MyNode tempNode = this.head;
        this.head = head.getNext();
        return tempNode;
    }
    public boolean search(MyNode key) {
        MyNode tempNode = head;
        boolean found = false;
        while(tempNode.getNext() != null) {
            if(tempNode.getKey() == key.getKey()) {
                found = true;
            }
            tempNode = tempNode.getNext();
        }
        return found;
    }

    public void delete(MyNode deleteNode) {
        linkedlist linkedList = new linkedlist();
        MyNode tempNode = head;
        boolean inserted = false;
        while(tempNode.getNext() != null) {
            if(tempNode.getKey() == deleteNode.getKey()) {
                linkedList.pop();
            }
            tempNode = tempNode.getNext();
        }
    }

    public void printMyNodes(){
        StringBuffer myNodes=new StringBuffer("My Nodes :");
        MyNode tempNode=head;
        while (tempNode.getNext()!=null){
            myNodes.append(tempNode.getKey());
            if (!tempNode.equals(tail))myNodes.append("->");
            tempNode=tempNode.getNext();
        }
        myNodes.append(tempNode.getKey());
        System.out.println(myNodes);
    }

}
