package hr.java.production.main;

import hr.java.production.model.Category;
import hr.java.production.model.Factory;
import hr.java.production.model.Item;

import java.util.Scanner;
import java.util.Vector;

public class Main {
    public static void main(String args[]){
        Vector<Category> categories = new Vector<Category>(3);
        Vector<Item> items = new Vector<Item>(5);
        Vector<Factory> factories = new Vector<Factory>(2);

        Scanner input = new Scanner(System.in); //Create a scanner

        //input 3 Category objects
        for(int i=0;i<3;i++){
            Category tempCategory = new Category();

            System.out.println("Enter name of " + i + " category: ");
            tempCategory.setName(input.nextLine());

            System.out.println("Enter description of  " + i + " category: ");

            tempCategory.setDescription(input.nextLine());
            categories.add(tempCategory);
        }
//       for(Category category : categories){
//           System.out.println(category.getName());
//       }

        //input 5 Item objects
        for(int i=0;i<5;i++){
            Item tempItem = new Item();
            Category tempItemCategory = new Category();

            System.out.println("Enter name of " + i + " item: " );
            tempItem.setName(input.nextLine());

            System.out.println("Enter category name of " + i + " item: " );
            tempItemCategory.setName(input.nextLine());
            System.out.println("Enter category description of " + i + " item: " );
            tempItemCategory.setDescription(input.nextLine());
            tempItem.setCategory(tempItemCategory);

            System.out.println("Enter width of " + i + " item: " );
            tempItem.setWidth(input.nextBigDecimal());

            System.out.println("Enter height of " + i + " item: " );
            tempItem.setHeight(input.nextBigDecimal());

            System.out.println("Enter length of " + i + " item: " );
            tempItem.setLength(input.nextBigDecimal());

            System.out.println("Enter productionCost of " + i + " item: " );
            tempItem.setProductionCost(input.nextBigDecimal());

            System.out.println("Enter sellingPrice of " + i + " item: " );
            tempItem.setSellingPrice(input.nextBigDecimal());

        }

        //input 2 factories

    }
}
