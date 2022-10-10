package hr.java.production.main;

import hr.java.production.model.*;

import javax.print.DocFlavor;
import java.math.BigDecimal;
import java.util.Scanner;
import java.util.Vector;

public class Main {

    //calculate best item volume from factory
    static BigDecimal getBestVolume(Factory factory){
        Item[] items = factory.getItems();
        BigDecimal bestVolume = items[0].getLength().multiply(items[0].getHeight().multiply(items[0].getWidth()));
        for(int i=0;i<items.length;i++){
            BigDecimal tempVolume = items[i].getLength().multiply(items[i].getHeight().multiply(items[i].getWidth()));
            if(tempVolume.compareTo(bestVolume) > 0){
                bestVolume = tempVolume;
            }
        }
        return bestVolume;
    }

    static BigDecimal getCheapestPrice(Store store){
        Item[] items = store.getItems();
        BigDecimal cheapestPrice = items[0].getSellingPrice();
        for(int i=0;i< items.length;i++){
            BigDecimal tempPrice = items[i].getSellingPrice();
            if(tempPrice.compareTo(cheapestPrice) >0){
                cheapestPrice = tempPrice;
            }
        }
        return cheapestPrice;
    }

    static Address inputAddress(){
        Scanner input = new Scanner(System.in);
        Address tempAddress = new Address();

        System.out.println("Enter address street: ");
        tempAddress.setStreet(input.nextLine());

        System.out.println("Enter address houseNumber: ");
        tempAddress.setHouseNumber(input.nextLine());

        System.out.println("Enter address city: ");
        tempAddress.setCity(input.nextLine());

        System.out.println("Enter address postalCode: ");
        tempAddress.setPostalCode(input.nextLine());

        return tempAddress;
    }

    static Category inputCategory(){
        Scanner input = new Scanner(System.in); //Create a scanner

        Category tempCategory = new Category();

        System.out.println("Enter category name: ");
        tempCategory.setName(input.nextLine());

        System.out.println("Enter category description: ");
        tempCategory.setName(input.nextLine());

        return tempCategory;
    }

    static Item inputItem(){
        Scanner input = new Scanner(System.in);

        Item tempItem = new Item();

        System.out.println("Enter item name: ");
        tempItem.setName(input.nextLine());

        tempItem.setCategory(inputCategory());

        System.out.println("Enter item width: ");
        while (!input.hasNextBigDecimal()) {
            System.out.println("Invalid input!");
            input.next(); // this is important!
        }
        tempItem.setWidth(input.nextBigDecimal());

        System.out.println("Enter item height: ");
        while (!input.hasNextBigDecimal()) {
            System.out.println("Invalid input!");
            input.next(); // this is important!
        }
        tempItem.setHeight(input.nextBigDecimal());

        System.out.println("Enter item length: ");
        while (!input.hasNextBigDecimal()) {
            System.out.println("Invalid input!");
            input.next(); // this is important!
        }
        tempItem.setLength(input.nextBigDecimal());

        System.out.println("Enter item productionCost: ");
        while (!input.hasNextBigDecimal()) {
            System.out.println("Invalid input!");
            input.next(); // this is important!
        }
        tempItem.setProductionCost(input.nextBigDecimal());

        System.out.println("Enter item sellingPrice: ");
        while (!input.hasNextBigDecimal()) {
            System.out.println("Invalid input!");
            input.next(); // this is important!
        }
        tempItem.setSellingPrice(input.nextBigDecimal());

        return tempItem;
    }

    static Factory inputFactory(){
        int n;
        Scanner input = new Scanner(System.in); //Create a scanner

        Factory tempFactory = new Factory();

        System.out.println("Enter factory name: ");
        tempFactory.setName(input.nextLine());

        tempFactory.setAddress(inputAddress());

        System.out.println("How many items? ");
        int tempNumber;
        //validate input type that it's a whole positive number
        do{
            while (!input.hasNextInt()) {
                System.out.println("Invalid input!");
                input.next(); // this is important!
            }
            tempNumber = input.nextInt();
        } while(tempNumber <= 0);

        Item[] tempItems = new Item[tempNumber];
        for(int i=0;i<tempNumber;i++){
            tempItems[i] = inputItem();
        }
        tempFactory.setItems(tempItems);



        return tempFactory;
    }

    static Store inputStore(){
        Scanner input = new Scanner(System.in);
        Store tempStore = new Store();

        System.out.println("Enter store name: ");
        tempStore.setName(input.nextLine());

        System.out.println("Enter store webAddress: ");
        tempStore.setWebAddress(input.nextLine());

        System.out.println("How many items? ");
        int tempNumber;
        //validate input type that it's a whole positive number
        do{
            while (!input.hasNextInt()) {
                System.out.println("Invalid input!");
                input.next(); // this is important!
            }
            tempNumber = input.nextInt();
        } while(tempNumber <= 0);

        Item[] tempItems = new Item[tempNumber];
        for(int i=0;i<tempNumber;i++){
            tempItems[i] = inputItem();
        }
        tempStore.setItems(tempItems);



        return tempStore;
    }

    static Factory findBestVolumeFactory(Vector<Factory> factories){
        BigDecimal bestVolume = getBestVolume(factories.firstElement());
        int bestVolumeFactory = 0;
        for(int i=0;i<factories.size();i++){
            BigDecimal tempVolume = getBestVolume(factories.elementAt(i));
            if(tempVolume.compareTo(bestVolume) > 0){
                bestVolume = tempVolume;
                bestVolumeFactory = i;
            }
        }

        return factories.elementAt(bestVolumeFactory);
    }

    static Store findCheapestItemStore(Vector<Store> stores){
        BigDecimal cheapestPrice = getCheapestPrice(stores.firstElement());
        int cheapestItemStore = 0;
        for(int i=0;i<stores.size();i++){
            BigDecimal tempPrice = getCheapestPrice(stores.elementAt(i));
            if(tempPrice.compareTo(cheapestPrice) >0){
                cheapestPrice = tempPrice;
                cheapestItemStore = i;
            }
        }

        return stores.elementAt(cheapestItemStore);
    }

    public static void main(String args[]){
        //vectors to store objects
        Vector<Category> categories = new Vector<Category>(3);
        Vector<Item> items = new Vector<Item>(5);
        Vector<Factory> factories = new Vector<Factory>(2);
        Vector<Store> stores = new Vector<Store>(2);


        //input 3 Category objects
        for(int i=0;i<3;i++){
            categories.add(inputCategory());
        }

       //input 5 Item objects
        for(int i=0;i<5;i++){
            items.add(inputItem());
        }

        //input 2 Factory objects
        for(int i=0;i<2;i++){
            factories.add(inputFactory());
        }

        //input 2 Store objects
        for(int i=0;i<2;i++){
            stores.add(inputStore());
        }

        //find factory with best volume
        Factory bestVolumeFactory = findBestVolumeFactory(factories);
        System.out.println(bestVolumeFactory.getName());

        //find store with most cheap item
        Store cheapestItemStore = findCheapestItemStore(stores);
        System.out.println(cheapestItemStore.getName());

    }
}
