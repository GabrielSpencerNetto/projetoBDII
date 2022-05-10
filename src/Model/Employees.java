package Model;

import java.util.Date;

import javax.imageio.ImageIO;

public class Employees {
    
    public int EmployeeID;
    public String LastName;
    public String FirstName;
    public String Title;
    public String TitleOfCroustesy;
    public Date BirthDate;
    public Date HireDate;
    public String Address;
    public String City;
    public String Region;
    public String PostalCode;
    public String Country;
    public String HomePhone;
    public String Extension;
    public ImageIO Photo;
    public String Notes;
    public int ReportsTo; //FK de Employee
    public String PhotoPath;
    
    public Employees() {
    }

    public Employees(int employeeID, String lastName, String firstName, String title, String titleOfCroustesy,
            Date birthDate, Date hireDate, String address, String city, String region, String postalCode,
            String country, String homePhone, String extension, ImageIO photo, String notes, int reportsTo,
            String photoPath) {
        EmployeeID = employeeID;
        LastName = lastName;
        FirstName = firstName;
        Title = title;
        TitleOfCroustesy = titleOfCroustesy;
        BirthDate = birthDate;
        HireDate = hireDate;
        Address = address;
        City = city;
        Region = region;
        PostalCode = postalCode;
        Country = country;
        HomePhone = homePhone;
        Extension = extension;
        Photo = photo;
        Notes = notes;
        ReportsTo = reportsTo;
        PhotoPath = photoPath;
    }

    public int getEmployeeID() {
        return EmployeeID;
    }

    public void setEmployeeID(int employeeID) {
        EmployeeID = employeeID;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getTitleOfCroustesy() {
        return TitleOfCroustesy;
    }

    public void setTitleOfCroustesy(String titleOfCroustesy) {
        TitleOfCroustesy = titleOfCroustesy;
    }

    public Date getBirthDate() {
        return BirthDate;
    }

    public void setBirthDate(Date birthDate) {
        BirthDate = birthDate;
    }

    public Date getHireDate() {
        return HireDate;
    }

    public void setHireDate(Date hireDate) {
        HireDate = hireDate;
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

    public String getRegion() {
        return Region;
    }

    public void setRegion(String region) {
        Region = region;
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

    public String getHomePhone() {
        return HomePhone;
    }

    public void setHomePhone(String homePhone) {
        HomePhone = homePhone;
    }

    public String getExtension() {
        return Extension;
    }

    public void setExtension(String extension) {
        Extension = extension;
    }

    public ImageIO getPhoto() {
        return Photo;
    }

    public void setPhoto(ImageIO photo) {
        Photo = photo;
    }

    public String getNotes() {
        return Notes;
    }

    public void setNotes(String notes) {
        Notes = notes;
    }

    public int getReportsTo() {
        return ReportsTo;
    }

    public void setReportsTo(int reportsTo) {
        ReportsTo = reportsTo;
    }

    public String getPhotoPath() {
        return PhotoPath;
    }

    public void setPhotoPath(String photoPath) {
        PhotoPath = photoPath;
    }

    @Override
    public String toString() {
        return "Employees [Address=" + Address + ", BirthDate=" + BirthDate + ", City=" + City + ", Country=" + Country
                + ", EmployeeID=" + EmployeeID + ", Extension=" + Extension + ", FirstName=" + FirstName + ", HireDate="
                + HireDate + ", HomePhone=" + HomePhone + ", LastName=" + LastName + ", Notes=" + Notes + ", Photo="
                + Photo + ", PhotoPath=" + PhotoPath + ", PostalCode=" + PostalCode + ", Region=" + Region
                + ", ReportsTo=" + ReportsTo + ", Title=" + Title + ", TitleOfCroustesy=" + TitleOfCroustesy + "]";
    }

    

}
