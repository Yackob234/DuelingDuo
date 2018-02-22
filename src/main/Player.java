package main;

public class Player {
    int x;
    int y;
    int lives = 2; 
    int ammo = 3;
    int timer = 50;
    boolean keyRight = false, keyLeft = false, keyUp = false, keyDown = false, keyAttack = false;
    boolean moveRight = true, moveLeft = true, moveUp = true, moveDown = true;
    int bulletDirection = 0, prevDir = 0;
    int width = 64;
    int height = 64;
}