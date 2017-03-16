/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacesexercises;

/**
 *
 * @author LuisGuillermo
 */
public class MovableRectangle implements Movable{
     private MovablePoint topLeft;
    private MovablePoint bottomRight;

    public MovableRectangle(int x1, int x2, int y1, int y2, int xSpeed, int ySpeed) {
        this.topLeft = new MovablePoint (x1,y1,xSpeed,ySpeed);
        this.bottomRight = new MovablePoint (x2, y2, xSpeed, ySpeed);
    }

    @Override
    public String toString() {
        return "MovableRectangle{" + "topLeft=" + topLeft + ", bottomRight=" + bottomRight + '}';
    }

    @Override
    public void moveUp() {
        topLeft.moveUp();
        bottomRight.moveUp();
    }

    @Override
    public void moveDown() {
       topLeft.moveDown();
       bottomRight.moveDown();
    }

    @Override
    public void moveRight() {
        topLeft.moveDown();
        bottomRight.moveDown();
    }

    @Override
    public void moveLeft() {
        topLeft.moveLeft();
        bottomRight.moveLeft();
}
}
