package com.kristoffer.demo.test;

import com.kristoffer.demo.Player;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {

    Player player;

    @BeforeEach
    public void beforeEachTest() {
         player = new Player(
                5,
                5,
                5,
                50,
                2,
                5
        );

        System.out.println("READY TO WORK!");
    }




    @Test
    public void reducePlayerHealth() {
        player.takeDamage(5);
        System.out.println(player.getHealth());

        assertEquals(45, player.getHealth());
    }

    @Test
    public void reducePlayerLevel() {
        player.setLevel(player.getLevel() - 1);

        assertEquals(1, player.getLevel());
    }

    @Test
    public void checkStartingHealth() {

        System.out.println(player.getHealth());

        assertEquals(50, player.getHealth());
    }

}