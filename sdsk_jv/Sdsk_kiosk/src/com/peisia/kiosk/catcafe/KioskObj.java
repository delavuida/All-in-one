package src.com.peisia.kiosk.catcafe;

import src.com.peisia.kiosk.catcafe.product.Dessert;
import src.com.peisia.kiosk.catcafe.product.Drink;
import src.com.peisia.kiosk.catcafe.product.Product;

import java.util.ArrayList;
import java.util.Scanner;

public class KioskObj {
	public static ArrayList<src.com.peisia.kiosk.catcafe.Order> basket = new ArrayList<>();	//주문들
	public static ArrayList<Product> products = new ArrayList<>();	//상품들
	public static Scanner sc = new Scanner(System.in);
	public static String cmd;
	
	public static void productLoad() {
		products.add(new Drink("커피",1000));	////	상품목록 처리	////
		products.add(new Drink("오렌지쥬스",2000));
		products.add(new Dessert("마카롱",3000));
//		products.add(new Product("키티피규어",10000));
	}
}