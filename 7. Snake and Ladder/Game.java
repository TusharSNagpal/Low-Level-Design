import java.util.LinkedList;
import java.util.Queue;

import java.util.concurrent.ThreadLocalRandom;

public class Game {
    private Board board;
    private Queue<Player> playerList;

    Game(int noOfPlayers){
        this.board = new Board(10, 5, 3);
        this.playerList = new LinkedList<>();
        int cur = 1;
        while(noOfPlayers>0) {
            this.playerList.add(new Player(cur));
            cur++;
            noOfPlayers--;
        }
    }

    public Cell getCell(int ind){
        return board.getCell(ind);
    }

    public int getBoardSize(){
        return this.board.getSize();
    }

    public int diceRoll() {
        return ThreadLocalRandom.current().nextInt(1, 6);
    }

    public Player playerTurn(){
        Player player = this.playerList.element();
        this.playerList.remove();
        this.playerList.add(player);
        return player;
    }
}
