package algorithm.concepts.designpatterns.creational.factory;

import algorithm.concepts.designpatterns.creational.factory.pages.AboutPage;
import algorithm.concepts.designpatterns.creational.factory.pages.CommentPage;
import algorithm.concepts.designpatterns.creational.factory.pages.PostPage;

public class Blog extends Website{
    @Override
    public void createWebSite() {
        pages.add(new PostPage());
        pages.add(new CommentPage());
        pages.add(new AboutPage());
    }
}
