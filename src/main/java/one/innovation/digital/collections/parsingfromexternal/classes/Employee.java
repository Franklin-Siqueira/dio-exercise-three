package one.innovation.digital.collections.parsingfromexternal.classes;

import java.util.Deque;

/**
 * Employee
 *
 */
public class Employee {
    private final String id;
    private final String firstName;
    private final String lastName;
    private final String location;
    private final String email;

    public Employee(String id, String firstName, String lastName, String location, String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.location = location;
        this.email = email;
    }

    @Override
    public String toString() {
        return "(" + id + ") " + firstName + " " + lastName + " | " + location + "| " + email;
    }

    public String getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getLocation() {
        return location;
    }
}
