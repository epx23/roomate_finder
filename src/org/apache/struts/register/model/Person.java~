package org.apache.struts.register.model;


/**
 * Models a Person who registers.
 * @author bruce phillips
 *
 */
public class Person
{
    private String firstName;
    private String lastName;
    private String email;
    private String username;
    private String password;

    public Person()
    {
      firstName = lastName = email = username = password = "";
    }
    
    public Person(String fname, String lname, String email, String username, String password)
    {
      this.firstName = fname;
      this.lastName = lname;
      this.email = email;
      this.username = username;
      this.password = password;
    }
    
    public Person(Person other)
    {
      this.firstName = other.getFirstName();
      this.lastName = other.getLastName();
      this.email = other.getEmail();
      this.username = other.getUsername();
      this.password = other.getPassword();
    }
    
    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public void setUsername(String username)
    {
        this.username = username;
    }
    
    public String getUsername(){
      return this.username;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    public String getPassword(){
      return this.password;
    }
    
    public String toString()
    {
        return "First Name: " + getFirstName() + " Last Name:  " + getLastName() + 
        " Email:      " + getEmail() + " Username:      " + getUsername() + 
        "Password:        " + getPassword();
    }
}
