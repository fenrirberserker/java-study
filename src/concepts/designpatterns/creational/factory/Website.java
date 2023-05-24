package concepts.designpatterns.creational.factory;

import concepts.designpatterns.creational.factory.pages.Page;

import java.util.ArrayList;
import java.util.List;

public abstract class Website {

    protected List<Page> pages = new ArrayList<>();

    public Website(){
        this.createWebSite();
    }

    public abstract void createWebSite();
}
