package concepts.designpatterns.creational.factory;

public class FactoryTest {

    public static void main(String[] args) {

        Website blog = WebsiteFactory.getWebsite("blog");
        System.out.println(blog.pages);

        Website shop = WebsiteFactory.getWebsite("shop");
        System.out.println(shop.pages);
    }
}
