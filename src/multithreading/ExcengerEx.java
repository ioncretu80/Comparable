package multithreading;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Exchanger;

public class ExcengerEx {
    public static void main(String[] args) {
        Exchanger<Action> exchanger = new Exchanger<>();
        List<Action> frend1Action = new ArrayList<>();
        frend1Action.add(Action.NOJNITSI);
        frend1Action.add(Action.BUMAGA);
        frend1Action.add(Action.NOJNITSI);


        List<Action> frend2Action = new ArrayList<>();
        frend2Action.add(Action.BUMAGA);
        frend2Action.add(Action.KAMENI);
        frend2Action.add(Action.KAMENI);

        new BestFriend("Vanya", frend1Action, exchanger);
        new BestFriend("Petya", frend2Action, exchanger);


    }
}


enum Action {
    KAMENI, NOJNITSI, BUMAGA;

}

class BestFriend extends Thread {
    private String name;
    private List<Action> myActions;
    private Exchanger<Action> exchanger;


    public BestFriend(String name, List<Action> myActions, Exchanger<Action> exchanger) {
        this.name = name;
        this.myActions = myActions;
        this.exchanger = exchanger;
        this.start();
    }

    private void whoWins(Action myAction, Action freundAction) {
        if (myAction == Action.KAMENI && freundAction == Action.NOJNITSI
                || myAction == Action.NOJNITSI && freundAction == Action.BUMAGA
                || myAction == Action.BUMAGA && freundAction == Action.KAMENI) {
            System.out.println(name + " wins");
        }

    }


    @Override
    public void run() {

        Action reply;

        for (Action action : myActions
        ) {
            try {
                reply = exchanger.exchange(action);
                whoWins(action, reply);
                sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }


    }
}
