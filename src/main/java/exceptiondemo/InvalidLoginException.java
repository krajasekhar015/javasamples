package exceptiondemo;

public class InvalidLoginException extends Exception {
    public InvalidLoginException(String s){
            super(s);
    }
}
