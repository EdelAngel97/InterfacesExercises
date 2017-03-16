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
public class MovableCircle implements Movable {
    private int radius;
    private MovablePoint center ;

    public MovableCircle(int radius, MovablePoint center) {
        this.radius = radius;
        this.center = center;
    }

    @Override
    public String toString() {
        return "MovableCircle{" + "radius=" + radius + ", center=" + center + '}';
    }


    @Override
    public void moveUp() {
        this.center.y += this.center.ySpeed;
    }

    @Override
    public void moveDown() {
        this.center.y -= this.center.ySpeed;
    }

    @Override
    public void moveRight() {
        this.center.x += this.center.xSpeed;
    }

    @Override
    public void moveLeft() {
        this.center.x -= this.center.xSpeed;
}
}
