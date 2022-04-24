package Model;

public class Region {
    
    private int RegionID; //pk
    private String RegionDescription;
    
    public Region() {
    }

    public Region(int regionID, String regionDescription) {
        RegionID = regionID;
        RegionDescription = regionDescription;
    }

    public int getRegionID() {
        return RegionID;
    }

    public void setRegionID(int regionID) {
        RegionID = regionID;
    }

    public String getRegionDescription() {
        return RegionDescription;
    }

    public void setRegionDescription(String regionDescription) {
        RegionDescription = regionDescription;
    }

    @Override
    public String toString() {
        return "Region [RegionDescription=" + RegionDescription + ", RegionID=" + RegionID + "]";
    }

    

}
