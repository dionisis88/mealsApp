
package Classes;

import java.util.ArrayList;


public class CategoryListData {
 
    
    private String categories;
    private ArrayList<String> strCategory;  

    public CategoryListData(String categories, ArrayList<String> strCategory) {
        this.categories = categories;
        this.strCategory = strCategory;
    }

    public String getCategories() {
        return categories;
    }

    public ArrayList<String> getStrCategory() {
        return strCategory;
    }

    public void setCategories(String categories) {
        this.categories = categories;
    }

    public void setStrCategory(ArrayList<String> strCategory) {
        this.strCategory = strCategory;
    }

    
} 

 
    
    

