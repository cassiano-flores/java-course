package exception_handling.model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import exception_handling.model.exceptions.DomainException;

//class Reservation for Exercise55
public class Reservation {
    
    private Integer roomNumber;
    private Date checkIn;
    private Date checkOut;

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    //"static" to not need to create several "sdf", we will use only one

    public long duration(){   //long because accepts more digits

        //getTime() returns the amount of time in milliseconds since a given default date 
        long diff = checkOut.getTime() - checkIn.getTime();
                                                             
        //long diff will be the milliseconds difference between the checkOut and checkIn 

        return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
        //TimeUnit is a Java package and with this we can convert the selected type into required type
        //TimeUnit.DAYS.convert -> want days  |  (diff, TimeUnit.MILLISECONDS) -> have "diff" "in milliseconds"
    }

    public void updateDates(Date checkIn, Date checkOut) throws DomainException{  //DomainException extends a Exception, so its always necessary to handle

        Date now = new Date();   //instance this exact moment
        if (checkIn.before(now) || checkOut.before(now)){  //if checkIn or checkOut is a before date then today,
                                                           //throw a DomainException exception with a message

            throw new DomainException("Reservation dates for update must be future dates");
        }
        if (!checkOut.after(checkIn)){  //if checkOut isnt after then checkIn, throw a DomainException again

            throw new DomainException("Check-out date must be after check-in date");
        }

        //if everything alright, the attributes receives the parameters
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    //constructor
    public Reservation(Integer roomNumber, Date checkIn, Date checkOut) throws DomainException {

        if (!checkOut.after(checkIn)){ //the same, if checkOut isnt after then checkIn, throw a DomainException

            throw new DomainException("Check-out date must be after check-in date");
        }

        this.roomNumber = roomNumber;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Date getCheckIn() {
        return checkIn;
    }

    public Date getCheckOut() {
        return checkOut;
    }

    @Override   //toString is an @Override method, so now, we gonna use this annotation every time
    public String toString() {

        return "Room "
            + roomNumber
            + ", check-in: "
            + sdf.format(checkIn)    //transform into (dd/MM/yyyy)
            + ", check-out: "
            + sdf.format(checkOut)   //transform into (dd/MM/yyyy)
            + ", "
            + duration()
            + " nights";
    }

    /* the method updateDates will setCheckIn and setCheckOut, so we dont need these setters

    public void setCheckIn(Date checkIn) {
        this.checkIn = checkIn;
    }

    public void setCheckOut(Date checkOut) {
        this.checkOut = checkOut;
    }

    */
}