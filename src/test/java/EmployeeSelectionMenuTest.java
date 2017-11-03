import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class EmployeeSelectionMenuTest {
    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void checkEmployeeExistence_NotNull_ById() throws Exception {
        Employee expected = new Employee("Andrew", "Kutchen", "123", "Home");
        EmployeeWareHouse.addEmployee(expected);

        Employee actual = EmployeeSelectionMenu.INSTANCE.checkEmployeeExistence(expected, "Id number");
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void checkEmployeeExistence_NotNull_ByLastName() throws Exception {
        Employee expected = new Employee("Andrew", "Kutchen", "123", "Home");
        EmployeeWareHouse.addEmployee(expected);

        Employee actual = EmployeeSelectionMenu.INSTANCE.checkEmployeeExistence(expected, "last name");
        Assert.assertEquals(expected,actual);
    }
}