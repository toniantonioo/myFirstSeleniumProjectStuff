
public class Main {

    public static void main(String[] args) {



        LoginTest lt = new LoginTest();
        WishListTest wlt = new WishListTest();
        RegisterTest rt = new RegisterTest();
        rt.registerTest();
        lt.loginWithValidCredentials();
        wlt .addToWishlist();

    }
}
