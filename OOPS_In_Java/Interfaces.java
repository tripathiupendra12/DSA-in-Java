public class Interfaces {
    public static void main(String[] args) {
        // Queen q = new Queen();
        // q.moves();
        Bear b = new Bear();
        b.eat();
    }
}

interface ChessPlayer {
    void moves();
}

class Queen implements ChessPlayer {
    public void moves() {
        System.out.println("up, down, left, rigth, diagonal(in all direction) ");
    }
}

class Rook implements ChessPlayer {
    public void moves() {
        System.out.println("up, down, left, rigth");
    }
}

class King implements ChessPlayer {
    public void moves() {
        System.out.println("up, down, left, rigth, diagonal(by one step) ");
    }
}

interface Harbivore {
    void eat();
}

interface Carnivore {
    void eat();
}

class Bear implements Harbivore, Carnivore {
    public void eat() {
        System.out.println("eat grass and meet both");
    }
}