package day55_polymorphism.shopping;

public interface Shipping {

    /*
    Create an interface Shipping
    -Declare an abstract methods:
    payForShipping(boolean)
     */

   String country = "US"; // Price is the instance variable country is static variable

   void payForShipping(boolean b);

}
