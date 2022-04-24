package Model;

public class Shippers {
    
    private int ShipperID; //pk
    private String CompanyName;
    private String Phone;
    
    public Shippers() {
    }

    public Shippers(int shipperID, String companyName, String phone) {
        ShipperID = shipperID;
        CompanyName = companyName;
        Phone = phone;
    }

    public int getShipperID() {
        return ShipperID;
    }

    public void setShipperID(int shipperID) {
        ShipperID = shipperID;
    }

    public String getCompanyName() {
        return CompanyName;
    }

    public void setCompanyName(String companyName) {
        CompanyName = companyName;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    @Override
    public String toString() {
        return "Shippers [CompanyName=" + CompanyName + ", Phone=" + Phone + ", ShipperID=" + ShipperID + "]";
    }


}
