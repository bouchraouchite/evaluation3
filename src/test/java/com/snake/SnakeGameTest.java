package com.snake;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class SnakeGameTest {
    @Test
    public void testDirectionChange() {
        SnakeGame game = new SnakeGame();

        assertEquals(Direction.RIGHT, game.getDirection());

        game.setDirection(Direction.UP);
        assertEquals(Direction.UP, game.getDirection());

        game.setDirection(Direction.LEFT);
        assertEquals(Direction.LEFT, game.getDirection());

        game.setDirection(Direction.DOWN);
        assertEquals(Direction.DOWN, game.getDirection());
    }

    @Test
    public void testInitialSnakeSize() {
        SnakeGame game = new SnakeGame();
        assertEquals(1, game.getSnake().size());
    }

    @Test
    public void testMove() {
        SnakeGame game = new SnakeGame();
        game.setDirection(Direction.RIGHT);
        game.move();
        assertEquals(1, game.getSnake().size());
    }

    @Test
    public void testGameOver() {
        SnakeGame game = new SnakeGame();
        assertFalse(game.isGameOver());
    }

    @Test
    public void testCreateFood() {
        SnakeGame game = new SnakeGame();
        assertNotNull(game.getFood());
    }
}