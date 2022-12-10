public class Kunde {
    String FirstName;
    String LastName;

    public Kunde(
            String firstName,
            String lastName)
    {
        FirstName = firstName;
        LastName = lastName;
    }

    public void PrintName()
    {
        System.out.println(FirstName + " " + LastName);
    }
}
