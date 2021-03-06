package Model;

public class Suppliers {
    
    public int SupplierID; //pk
    public String CompanyName;
    public String ContactName;
    public String ContactTitle;
    public String Address;
    public String City;
    public String Reion;
    public String PostalCode;
    public String Country;
    public String Phone;
    public String Fax;
    public String HomePage;
    
    public Suppliers() {
    }

    public Suppliers(int supplierID, String companyName, String contactName, String contactTitle, String address,
            String city, String reion, String postalCode, String country, String phone, String fax, String homePage) {
        SupplierID = supplierID;
        CompanyName = companyName;
        ContactName = contactName;
        ContactTitle = contactTitle;
        Address = address;
        City = city;
        Reion = reion;
        PostalCode = postalCode;
        Country = country;
        Phone = phone;
        Fax = fax;
        HomePage = homePage;
    }

    public int getSupplierID() {
        return SupplierID;
    }

    public void setSupplierID(int supplierID) {
        SupplierID = supplierID;
    }

    public String getCompanyName() {
        return CompanyName;
    }

    public void setCompanyName(String companyName) {
        CompanyName = companyName;
    }

    public String getContactName() {
        return ContactName;
    }

    public void setContactName(String contactName) {
        ContactName = contactName;
    }

    public String getContactTitle() {
        return ContactTitle;
    }

    public void setContactTitle(String contactTitle) {
        ContactTitle = contactTitle;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getReion() {
        return Reion;
    }

    public void setReion(String reion) {
        Reion = reion;
    }

    public String getPostalCode() {
        return PostalCode;
    }

    public void setPostalCode(String postalCode) {
        PostalCode = postalCode;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getFax() {
        return Fax;
    }

    public void setFax(String fax) {
        Fax = fax;
    }

    public String getHomePage() {
        return HomePage;
    }

    public void setHomePage(String homePage) {
        HomePage = homePage;
    }

    @Override
    public String toString() {
        return "Suppliers [Address=" + Address + ", City=" + City + ", CompanyName=" + CompanyName + ", ContactName="
                + ContactName + ", ContactTitle=" + ContactTitle + ", Country=" + Country + ", Fax=" + Fax
                + ", HomePage=" + HomePage + ", Phone=" + Phone + ", PostalCode=" + PostalCode + ", Reion=" + Reion
                + ", SupplierID=" + SupplierID + "]";
    }


}
