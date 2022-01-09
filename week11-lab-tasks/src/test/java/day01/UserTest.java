package day01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {


    @Test
    void testNormalUser(){
        NormalUser normalUser = new NormalUser("example","example@gmail.com");
        assertEquals("example",normalUser.getPassword());
        assertEquals("example@gmail.com",normalUser.getUserEmail());
    }

    @Test
    void testAdminUser(){
        AdminUser adminUser = new AdminUser("admin@gmail.com","admin");
        assertEquals("admin@gmail.com",adminUser.getUserEmail());
        assertEquals("*****",adminUser.getPassword());
    }

}