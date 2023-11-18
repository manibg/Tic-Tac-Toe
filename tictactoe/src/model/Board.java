package model;

import java.util.List;

public class Board {
    private int size;
    private List<List<Cell>> cells;

    public Board(int dimension) {
        this.size = dimension;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public List<List<Cell>> getCells() {
        return cells;
    }

    public void setCells(List<List<Cell>> cells) {
        this.cells = cells;
    }
}
