public class Address
{
    private String streetNum;
    private String streetName;
    private String apt; //optional
    private String city;
    private String state;
    private String zip;

    public Address(String street, String streetN, String aptNum, String c, String s, String z)
    {
        streetNum = street;
        streetName = streetN;
        apt = aptNum;
        city = c;
        state = s;
        zip = z;
    }

    public Address(Address add)
    {
        this.streetNum = add.streetNum;
        this.streetName = add.streetName;
        this.apt = add.apt;
        this.city = add.city;
        this.state = add.state;
        this.zip = add.zip;
    }

    public Address(String addAsStr)
    {
        //
    }

    public String getStreetNum() 
    {
        return this.streetNum;
    }

    public void setStreetNum(String sNum) 
    {
        this.streetNum = sNum;
    }

    public String getStreetName() 
    {
        return this.streetName;
    }

    public void setStreetName(String sName) 
    {
        this.streetName = sName;
    }

    public String getApt() 
    {
        return this.apt;
    }

    public void setApt(String apt) 
    {
        this.apt = apt;
    }

    public String getCity() 
    {
        return this.city;
    }

    public void setCity(String city) 
    {
        this.city = city;
    }

    public String getState() 
    {
        return this.state;
    }

    public void setState(String state) 
    {
        this.state = state;
    }

    public String getZip() 
    {
        return this.zip;
    }

    public void setZip(String zip) 
    {
        this.zip = zip;
    }

}