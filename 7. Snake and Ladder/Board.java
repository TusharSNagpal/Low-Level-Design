import java.util.concurrent.ThreadLocalRandom;
//Push
public class Board {
    private Cell[][] cells;
    Board(int size, int snakes, int ladders){
        initializeCells(size);
        addSnakes(snakes);
    }

    public int getSize(){
        return cells.length;
    }

    private void initializeCells(int size){
        cells = new Cell[size][size];

        for(int i = 0; i<size; i++){
            for(int j = 0; j<size; j++) {
                cells[i][j] = new Cell();
            }
        }
    }

    public Cell getCell(int ind){
        return cells[ind/cells.length][ind%cells.length];
    }

    private void addSnakes(int n){
        int start = ThreadLocalRandom.current().nextInt(1, cells.length * cells.length - 1);
        int end = ThreadLocalRandom.current().nextInt(1, cells.length * cells.length - 1);
        while(n>0){
            if(start>end) {
                n--;
                Snake snake = new Snake();
                snake.start = start;
                snake.end = end;
                Cell cellObj = getCell(start);
                cellObj.snake = snake;
                cellObj.select = 1;
            }
        }
    }

    private void addLadder(int n){
        int start = ThreadLocalRandom.current().nextInt(1, cells.length * cells.length - 1);
        int end = ThreadLocalRandom.current().nextInt(1, cells.length * cells.length - 1);
        while(n>0){
            if(start<end) {
                n--;
                Ladder ladder = new Ladder();
                ladder.start = start;
                ladder.end = end;
                Cell cellObj = getCell(start);
                cellObj.ladder = ladder;
                cellObj.select = 2;
            }
            start = ThreadLocalRandom.current().nextInt(1, cells.length * cells.length - 1);
            end = ThreadLocalRandom.current().nextInt(1, cells.length * cells.length - 1);
        }
    }
}
