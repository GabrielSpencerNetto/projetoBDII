package Model;

public class OrderDetails {
    
    public int OrderID; // pk e fk
    public int ProductID; //pk e fk
    public double UnitPrice;
    public double Quantity;
    public double Discount;
    
    public OrderDetails() {
    }

    public OrderDetails(int orderID, int productID, double unitPrice, double quantity, double discount) {
        OrderID = orderID;
        ProductID = productID;
        UnitPrice = unitPrice;
        Quantity = quantity;
        Discount = discount;
    }

    public int getOrderID() {
        return OrderID;
    }

    public void setOrderID(int orderID) {
        OrderID = orderID;
    }

    public int getProductID() {
        return ProductID;
    }

    public void setProductID(int productID) {
        ProductID = productID;
    }

    public double getUnitPrice() {
        return UnitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        UnitPrice = unitPrice;
    }

    public double getQuantity() {
        return Quantity;
    }

    public void setQuantity(double quantity) {
        Quantity = quantity;
    }

    public double getDiscount() {
        return Discount;
    }

    public void setDiscount(double discount) {
        Discount = discount;
    }

    @Override
    public String toString() {
        return "OrderDetails [Discount=" + Discount + ", OrderID=" + OrderID + ", ProductID=" + ProductID
                + ", Quantity=" + Quantity + ", UnitPrice=" + UnitPrice + "]";
    }


}
