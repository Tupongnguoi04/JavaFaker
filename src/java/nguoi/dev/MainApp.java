/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nguoi.dev;

import nguoi.dev.data.dao.CategoryDao;
import nguoi.dev.data.dao.Database;
import nguoi.dev.data.model.Category;
import nguoi.dev.data.impl.CategoryImpl;
import nguoi.dev.data.model.Order;
import nguoi.dev.data.model.OrderItem;
import nguoi.dev.data.model.Product;
import nguoi.dev.data.dao.DatabaseDao;
import nguoi.dev.data.dao.OrderDao;
import nguoi.dev.data.dao.OrderItemDao;
import nguoi.dev.data.dao.ProductDao;
import nguoi.dev.data.dao.UserDao;
import nguoi.dev.data.impl.UserImpl;
import nguoi.dev.data.model.User;
import nguoi.dev.data.seeder.CategorySeeder;
import nguoi.dev.data.seeder.ProductSeeder;
import nguoi.dev.data.seeder.UserSeeder;

import java.util.List;
import java.util.Locale;
import com.github.javafaker.Faker;
import nguoi.dev.data.seeder.OrderSeeder;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
                DatabaseDao.init(new Database());
                Faker faker = new Faker();
		//Insert User	
	        UserDao userDao = DatabaseDao.getInstance().getUserDao();
	        UserSeeder userSign = new UserSeeder(userDao);
	        userSign.seedUsers(5);        
//	        //Insert Category
//	        CategoryDao categoryDao = DatabaseDao.getInstance().getCategoryDao();
//	        CategorySeeder categorySeeder = new CategorySeeder(categoryDao);
//	        categorySeeder.seedCategories(5);
//	        //Insert Product
//	        ProductDao productDao = DatabaseDao.getInstance().getProductDao();
//	        ProductSeeder productSeeder = new ProductSeeder(productDao, categoryDao);
//	        productSeeder.seedProducts(10);
//	        //Insert Order
//              OrderDao orderDao = DatabaseDao.getInstance().getOrderDao();
//	        OrderSeeder orderSeeder = new OrderSeeder(orderDao, userDao);
//	        orderSeeder.seedOrders(5);
                //Insert OrderItem
                
	        System.out.println("Seeded fake users successfully!");
			
	}
	
}