package Wlasne;

public class NotSortedArrayException extends RuntimeException{

    public NotSortedArrayException(){
        super("Podane tablice są nieposortowane !");
    }
    public NotSortedArrayException(String message){
        super(message);
    }
}
