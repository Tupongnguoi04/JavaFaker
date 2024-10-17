package nguoi.dev.data.seeder;

import nguoi.dev.data.dao.Database;
import nguoi.dev.data.dao.DatabaseDao;
import nguoi.dev.data.dao.UserDao;
import nguoi.dev.data.model.User;

import com.github.javafaker.Faker;

public class UserSeeder {
	// Khai báo thuộc tính userDao
    private UserDao userDao;

    // Khởi tạo đối tượng Faker
    private Faker faker;
    
	public UserSeeder(UserDao userDao) {
		 this.faker = new Faker();
	     this.userDao = userDao;
	}
	
	public void seedUsers(int numberOfUsers) {
        for (int i = 0; i < numberOfUsers; i++) {
            // Fake Java
            String email = faker.internet().emailAddress();
            String password = faker.internet().password();
            String role = faker.job().position();

            User user = new User(email, password, role);
            userDao.insert(user);
            //Print Fake Users
            System.out.println("Inserted User: " + email + " | " + password + " | " + role);
        }
    }
	
}