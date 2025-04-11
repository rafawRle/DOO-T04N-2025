package src.Entities.ValueObjects;

public class Address implements src.Interfaces.IPresentate
{
    public String state;
    public String city;
    public String neighborhood;
    public String street;
    public String number;
    public String complement;

    public String presentate()
    {
        return "Estado: " + this.state + "\nCidade: " + this.city + "\nBairro: " + this.neighborhood +
                "\nRua: " + this.street + "\nNúmero: " + this.number + "\nComplemento: " + this.complement;
    }
}
