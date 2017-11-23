package com.sample.hw;


import org.junit.Test;
import static org.junit.Assert.*;



/**
 * Unit test for simple App.
 */
public class AppTest
{
   @Test
    public void shouldSayHello(){
        App greeter = new App();
        String hello = greeter.sayHello();
        assertTrue(hello.equals("Hello World"));

   }
//   @Test
//   public void shouldSayHelloName(){
//        App greeter = new App();
//        String hello = greeter.sayHelloWithName("Abhi");
//        assertTrue(hello.equals("Hello Abhi"));
//
//   }
    
}
