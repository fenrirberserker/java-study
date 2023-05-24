package concepts.designpatterns.creational.factory;

import concepts.designpatterns.creational.factory.pages.CartPage;
import concepts.designpatterns.creational.factory.pages.ItemPage;

public class Shop extends Website{
    @Override
    public void createWebSite() {
        pages.add(new CartPage());
        pages.add(new ItemPage());
    }
}
