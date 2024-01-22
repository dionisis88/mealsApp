package Classes;

import java.util.ArrayList;


public class CategoryList {
 
    
    private String meals;
    private ArrayList<String> strMeal;  

    public CategoryList(String meals, ArrayList<String> strMeal) {
        this.meals = meals;
        this.strMeal = strMeal;
    }

    public String getMeals() {
        return meals;
    }

    public ArrayList<String> getStrMeal() {
        return strMeal;
    }

    public void setCategories(String meals) {
        this.meals = meals;
    }

    public void setStrMeals(ArrayList<String> strMeal) {
        this.strMeal = strMeal;
    }

    
} 

 
    
    


    
    

