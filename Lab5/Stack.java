public class Stack {
    private LinkedList pile = new LinkedList();
    public Stack(){}
    public void push(String data){
        pile.add(data);
    }
    public void pop(){
        pile.pull();
    }
    public String peek(){
        return pile.peak();
    }
    public String peekFirst(){return pile.peakFirst();}
    public void popFirst(){pile.pullFirst();}
    public boolean isEmpty() {return pile.isEmpty();
    }
}
