
class Stack{
    Node start;
    int size;
    
    public Stack(){
        start = null;
        size = 0;
    }

    public void push(Object item){
        Node element = new Node(item);
        
        if (start == null){
            start = element;
            size++;
        } else {
            Node pointer = start;

            while (pointer.link != null)
                pointer = pointer.link;

            pointer.link = element;
            size++;
        }
    }

    public Object pop(){
        if (start != null){
            Node pointer = start;
            Object lastItem;

            //The stack has one item
            if (size == 1){
                start = null;
                size--;
                return pointer.data;
            } else {
            //The stack has multiple items
                while (pointer.link.link != null){
                    pointer = pointer.link;    
                }

                lastItem = pointer.link.data; //Get the last item
                pointer.link = null; //Delete the last item from stack
                size--;

                return lastItem;
            }
        }else 
            //The stack is empty
            return null;
    }

    public Object getItemAt(int position) throws StackIndexOutOfBoundsException{

        if (position < size){
            Node pointer = start;

            for (int i = 1; i <= position; i++){
                pointer = pointer.link;
            }
            return pointer.data;
        }else 
            throw new StackIndexOutOfBoundsException("Index " + position + " out of bounds for length " + size);
    }

}

class StackIndexOutOfBoundsException extends Exception {
    public StackIndexOutOfBoundsException(String message) {
        super(message);
    }
}
