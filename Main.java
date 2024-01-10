public class Main {
    public static void main(String[] args) {
        Board board = new Board("Chess Game", 1000,1000);
        //Main Event Loop
        while (true){
            Piece[][] pieces = board.getPieces();
            for (Piece[] row : pieces){
                for(Piece piece : row){
                    if (piece != null){
                        if (piece.isPressed()){
                        }
                    }
                }
            }

        }
    }
}