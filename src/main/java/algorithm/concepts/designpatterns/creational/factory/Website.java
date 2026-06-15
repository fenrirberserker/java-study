package algorithm.concepts.designpatterns.creational.factory;

import algorithm.concepts.designpatterns.creational.factory.pages.Page;

import java.util.ArrayList;
import java.util.List;

public abstract class Website {

    protected List<Page> pages = new ArrayList<>();

    public Website(){
        this.createWebSite();
    }

    public abstract void createWebSite();
}
