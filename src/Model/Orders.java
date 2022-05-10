package Model;

import java.util.Date;

public class Orders {
    
    public int OrderID; //pk
    public int CustomerID; //fk
    public int EmployeeID; //fk
    public Date OrderDate;
    public Date RequiredDate;
    public Date ShippedDate;
    public int ShipVia; //fk
    public double Freigth;
    public String ShipName;
    public String ShipAddress;
    public String ShipCity;
    public String ShipRegion;
    public String ShipPostalCode;
    public String ShipCountry;
    
    public Orders() {
    }

    public Orders(int orderID, int customerID, int employeeID, Date orderDate, Date requiredDate, Date shippedDate,
            int shipVia, double freigth, String shipName, String shipAddress, String shipCity, String shipRegion,
            String shipPostalCode, String shipCountry) {
        OrderID = orderID;
        CustomerID = customerID;
        EmployeeID = employeeID;
        OrderDate = orderDate;
        RequiredDate = requiredDate;
        ShippedDate = shippedDate;
        ShipVia = shipVia;
        Freigth = freigth;
        ShipName = shipName;
        ShipAddress = shipAddress;
        ShipCity = shipCity;
        ShipRegion = shipRegion;
        ShipPostalCode = shipPostalCode;
        ShipCountry = shipCountry;
    }

    public int getOrderID() {
        return OrderID;
    }

    public void setOrderID(int orderID) {
        OrderID = orderID;
    }

    public int getCustomerID() {
        return CustomerID;
    }

    public void setCustomerID(int customerID) {
        CustomerID = customerID;
    }

    public int getEmployeeID() {
        return EmployeeID;
    }

    public void setEmployeeID(int employeeID) {
        EmployeeID = employeeID;
    }

    public Date getOrderDate() {
        return OrderDate;
    }

    public void setOrderDate(Date orderDate) {
        OrderDate = orderDate;
    }

    public Date getRequiredDate() {
        return RequiredDate;
    }

    public void setRequiredDate(Date requiredDate) {
        RequiredDate = requiredDate;
    }

    public Date getShippedDate() {
        return ShippedDate;
    }

    public void setShippedDate(Date shippedDate) {
        ShippedDate = shippedDate;
    }

    public int getShipVia() {
        return ShipVia;
    }

    public void setShipVia(int shipVia) {
        ShipVia = shipVia;
    }

    public double getFreigth() {
        return Freigth;
    }

    public void setFreigth(double freigth) {
        Freigth = freigth;
    }

    public String getShipName() {
        return ShipName;
    }

    public void setShipName(String shipName) {
        ShipName = shipName;
    }

    public String getShipAddress() {
        return ShipAddress;
    }

    public void setShipAddress(String shipAddress) {
        ShipAddress = shipAddress;
    }

    public String getShipCity() {
        return ShipCity;
    }

    public void setShipCity(String shipCity) {
        ShipCity = shipCity;
    }

    public String getShipRegion() {
        return ShipRegion;
    }

    public void setShipRegion(String shipRegion) {
        ShipRegion = shipRegion;
    }

    public String getShipPostalCode() {
        return ShipPostalCode;
    }

    public void setShipPostalCode(String shipPostalCode) {
        ShipPostalCode = shipPostalCode;
    }

    public String getShipCountry() {
        return ShipCountry;
    }

    public void setShipCountry(String shipCountry) {
        ShipCountry = shipCountry;
    }

    @Override
    public String toString() {
        return "Orders [CustomerID=" + CustomerID + ", EmployeeID=" + EmployeeID + ", Freigth=" + Freigth
                + ", OrderDate=" + OrderDate + ", OrderID=" + OrderID + ", RequiredDate=" + RequiredDate
                + ", ShipAddress=" + ShipAddress + ", ShipCity=" + ShipCity + ", ShipCountry=" + ShipCountry
                + ", ShipName=" + ShipName + ", ShipPostalCode=" + ShipPostalCode + ", ShipRegion=" + ShipRegion
                + ", ShipVia=" + ShipVia + ", ShippedDate=" + ShippedDate + "]";
    }


}
