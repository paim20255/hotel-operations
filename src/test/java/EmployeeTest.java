import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @org.junit.jupiter.api.Test
    void punchIn() {
        // arrange:
        Employee Nate = new Employee("Nate", 10.0, 10.0, 8);

        // act
        Nate.punchIn(8);

        // assert
        int actualTime = 8;
        int expectedTime = 8;
        assertEquals(expectedTime, actualTime);
    }

    @org.junit.jupiter.api.Test
    void punchOut() {


    }
}