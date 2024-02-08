package CleanCode;

public class Main {
    public static void main(String[] args) {
        //ürünler
        Product product1 = new Product(1,"Kitap",120.0);
        Product product2 = new Product(2,"Defter",75.0);
        //bir normal müşteri, bir öğrenci
        Customer customer1 = new Customer(1,"Burak Anadol");
        Student customer2 = new Student(2,"Engin Demiroğ");

        IBankService iBankService = new CentralBankService();
        ProductManager productManager = new ProductManager(iBankService);
        System.out.println("************");


        productManager.sell(product1,customer1);


    }

}