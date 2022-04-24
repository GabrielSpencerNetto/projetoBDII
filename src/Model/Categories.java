package Model;

import javax.imageio.ImageIO;

public class Categories {
    
    public int CategoryID;
    public String CategoryName;
    public String Description;
    public ImageIO Picture; //Verificar se esse é o tipo certo para se referenciar a imagem
    
    public Categories() {
    }

    public Categories(int categoryID, String categoryName, String description, ImageIO picture) {
        CategoryID = categoryID;
        CategoryName = categoryName;
        Description = description;
        Picture = picture;
    }

    public int getCategoryID() {
        return CategoryID;
    }

    public void setCategoryID(int categoryID) {
        CategoryID = categoryID;
    }

    public String getCategoryName() {
        return CategoryName;
    }

    public void setCategoryName(String categoryName) {
        CategoryName = categoryName;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public ImageIO getPicture() {
        return Picture;
    }

    public void setPicture(ImageIO picture) {
        Picture = picture;
    }

    @Override
    public String toString() {
        return "Categories [CategoryID=" + CategoryID + ", CategoryName=" + CategoryName + ", Description="
                + Description + ", Picture=" + Picture + "]";
    }

}
