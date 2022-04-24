package Model;

public class Territories {
 
    private int TerritoryID; //pk
    private String TerritoryDescription;
    private int RegionID; //fk
    
    public Territories() {
    }

    public Territories(int territoryID, String territoryDescription, int regionID) {
        TerritoryID = territoryID;
        TerritoryDescription = territoryDescription;
        RegionID = regionID;
    }

    public int getTerritoryID() {
        return TerritoryID;
    }

    public void setTerritoryID(int territoryID) {
        TerritoryID = territoryID;
    }

    public String getTerritoryDescription() {
        return TerritoryDescription;
    }

    public void setTerritoryDescription(String territoryDescription) {
        TerritoryDescription = territoryDescription;
    }

    public int getRegionID() {
        return RegionID;
    }

    public void setRegionID(int regionID) {
        RegionID = regionID;
    }

    @Override
    public String toString() {
        return "Territories [RegionID=" + RegionID + ", TerritoryDescription=" + TerritoryDescription + ", TerritoryID="
                + TerritoryID + "]";
    }


    

}
