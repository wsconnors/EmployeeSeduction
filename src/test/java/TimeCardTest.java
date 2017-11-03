import org.junit.Assert;
import org.junit.Test;
import workerRelatedClasses.Employee.TimeCard;

import java.util.Date;

public class TimeCardTest {
    Date clockIn = new Date();
    TimeCard timecard = new TimeCard(clockIn);

    @Test
    public void clockInTest(){
        Date expected = clockIn;

        Date actual = timecard.getClockIn();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void clockOutTest(){
        Date clockOut = new Date();
        Date expected = clockOut;

        timecard.setClockOut(clockOut);

        Date actual = timecard.getClockOut();

        Assert.assertEquals(expected,actual);

    }

}
