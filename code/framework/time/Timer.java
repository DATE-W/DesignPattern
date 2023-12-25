package framework.time;

import java.util.ArrayList;

public class Timer {
    // 单例模式
    private static volatile Timer instance = null;  // 保证instance在所有线程中同步
    private Timer() {
        // private 避免类在外部被实例化
    }
    public static synchronized Timer getInstance(){
        // getInstance方法前增加同步s
        if (instance == null) {
            instance = new Timer();
        }
        return instance;
    }

    // 观察者模式
    // 当系统时间发生变化时 被食材观测到 影响食材的新鲜度
    private ArrayList<TimerObserver> observers = new ArrayList<>();
    public void tick(){
        // 每次更新对所有观察者进行更新
        for(TimerObserver to : observers){
            to.update();
        }
    }
    public void addObserver(TimerObserver to){
        // 添加观察者
        observers.add(to);
    }

    public void removeObserver(TimerObserver to) {
        // 删除观察者
        observers.remove(to);
    }

}
