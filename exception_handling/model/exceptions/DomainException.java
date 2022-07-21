package exception_handling.model.exceptions;

//class DomainException is a personalized Exception type made for me
//DomainException is extended by Exception (default class Java)
public class DomainException extends Exception{

    //this is a constructor, we are just saying when this class is called, we need to enter a message
    public DomainException(String msg) {
        super(msg);  //in this case, super refers to Exception class
    }
}