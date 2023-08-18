public class Main {
    public static void main(String[] args) {
        Game game = new Game(3);

        Player player = game.playerTurn();

        int boardSize = game.getBoardSize();

        while(player.curPos != boardSize*boardSize-1){
            int move = game.diceRoll();
            if(player.curPos + move > boardSize*boardSize-1) {
                player = game.playerTurn();
                continue;
            }
            player.curPos += move;
            Cell cell = game.getCell(player.curPos);
            if(cell.select == 1){
                System.out.println("SNAKE!");
                player.curPos = cell.snake.end;
                System.out.println("Now at: " + player.curPos);
            }
            else if(cell.select == 2){
                System.out.println("LADDER!");
                player.curPos = cell.ladder.end;
                System.out.println("Now at: " + player.curPos);
            }

            if(player.curPos == boardSize*boardSize-1){
                System.out.println("Player with id:" + player.getId() + " WON!");
                break;
            }
            player = game.playerTurn();
        }

        System.out.println("Thanks for playing this game!");
    }
}
