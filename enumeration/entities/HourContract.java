package enumeration.entities;

import java.util.Date;

//class HourContract represents a Worker association
//Worker can have many contracts, each one with their respective totalValue
public class HourContract {
    
    private Date date;
    private double valuePerHour;
    private Integer hours;

    public double totalValue(){
        return valuePerHour * hours;
    }

    public HourContract(){
    }

    public HourContract(Date date, double valuePerHour, Integer hours) {
        this.date = date;
        this.valuePerHour = valuePerHour;
        this.hours = hours;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getValuePerHour() {
        return valuePerHour;
    }

    public void setValuePerHour(double valuePerHour) {
        this.valuePerHour = valuePerHour;
    }

    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }
}