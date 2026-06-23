package Labaratory_23;

import java.util.ArrayList;
import java.util.List;

public class ObserverPattern {
    public static void main(String[] args) {
        Group groupDev = new Group("Java Developers");
        Group groupGame = new Group("Геймеры");
        Group groupCook = new Group("Кулинары");
        Group groupTravel = new Group("Путешественники");

        User userA = new User("Алексей");
        User userB = new User("Мария");

        groupDev.subscribe(userA);
        groupCook.subscribe(userA);
        groupGame.subscribe(userA);
        groupTravel.subscribe(userA);

        groupCook.subscribe(userB);
        groupDev.subscribe(userB);
        groupTravel.subscribe(userB);
        groupGame.unsubscribe(userB);

        System.out.println();
        groupDev.publishPost("Вышел новая библеотека!");
        System.out.println();
        groupGame.publishPost("Вышла новая игра!");
        System.out.println();
        groupCook.publishPost("Мы добавили новый рецепт!");


    }
}
interface Observer
{
    void getANotification(String groupName, String message);
}

interface Subject
{
    void subscribe(Observer observer);
    void unsubscribe(Observer observer);
    void notifyObservers(String message);
}
class User implements Observer {
    private final String name;

    public User(String name) {
        this.name = name;
    }
    @Override
    public void getANotification(String name, String message) {
        System.out.println("Пользователь " + this.name + " получил оповещение из группы [" + name + "]: " + message);
    }
}
class Group implements Subject {
    String name;
    private List<Observer> subscribers = new ArrayList<>();

    public Group(String name) {
        this.name = name;
    }

    @Override
    public void subscribe(Observer observer) {
        subscribers.add(observer);
    }

    @Override
    public void unsubscribe(Observer observer) {
        if(subscribers.contains(observer)){
            subscribers.remove(observer);
        }else {
            System.out.println("Вы не подписаны на данную группу");
        }
    }

    @Override
    public void notifyObservers(String message) {
        for (Observer observer : subscribers) {
            observer.getANotification(name, message);
        }
    }

    public void publishPost(String postContent) {
        System.out.println("Группа [" + name + "] опубликовала: '" + postContent + "'");
        notifyObservers(postContent);
    }
}
