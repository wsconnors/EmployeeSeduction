package workerRelatedClasses.Employee;

import java.util.Date;

public class TimeCard {
    private Date clockIn;
    private Date clockOut;

    public TimeCard(Date clockIn){
        this.clockIn = clockIn;
    }

    public Date getClockIn(){
        return this.clockIn;
    }

    public void setClockOut(Date clockOut){
        this.clockOut = clockOut;
    }

    public Date getClockOut(){
        return this.clockOut;
    }
}
