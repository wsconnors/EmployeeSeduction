import org.junit.Assert;
import org.junit.Test;

public class PersonTest {

    Person newPerson = new Person("wes","connors", "123", "Home");

    @Test
    public void IdTest(){
        int expected = 100;
        newPerson.setId(expected);

        int actual = newPerson.getId();

        Assert.assertEquals(expected,actual);


    }


    @Test       // Set and get test
    public void FirstNameTest(){
        String expected = "bob";
        newPerson.setFirstName(expected);

        String actual = newPerson.getFirstName();

        Assert.assertEquals(expected,actual);
    }


    @Test       // Set and get test
    public void LastNameTest(){
        String expected = "billy";
        newPerson.setLastName(expected);

        String actual = newPerson.getLastName();

        Assert.assertEquals(expected,actual);
    }

    @Test       // Set and get test
    public void PhoneNumberTest(){
        String expected = "1234567890";
        newPerson.setPhoneNumber(expected);

        String actual = newPerson.getPhoneNumber();

        Assert.assertEquals(expected,actual);
    }

    @Test       // Set and get test
    public void AddressTest(){
        String expected = "1 Main Street";
        newPerson.setAddress(expected);

        String actual = newPerson.getAddress();

        Assert.assertEquals(expected,actual);
    }
}
