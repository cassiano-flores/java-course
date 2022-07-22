package exception_handling.model.exceptions;

//class WithdrawException is a personalized Exception type made for me
//WithdrawException is extended by Exception (default class Java)
public class WithdrawException extends Exception{

    //this is a constructor, we are just saying when this class is called, we need to enter a message
    public WithdrawException(String msg) {
        super(msg);  //in this case, super refers to Exception class
    }
}