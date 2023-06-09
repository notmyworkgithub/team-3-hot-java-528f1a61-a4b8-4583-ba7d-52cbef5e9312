package com.levelup.forestsandmonsters.features;

import static org.junit.Assert.assertEquals;

import com.levelup.forestsandmonsters.GameController;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StartGameSteps {

    GameController testObj;

    @When("the game is started")
    public void whenTheCharacterSetsTheirName() {
        testObj = new GameController();
        testObj.createCharacter("Character");
        testObj.startGame();
    }

    @Then("the Game has {int} positions")
    public void thenTheGameSetsTheCharactersName(int numPositions) {
        assertEquals(numPositions, testObj.getTotalPositions());
    }

    @Then("the Game sets the character's X position to {int}")
    public void checkXPosition(int xPosition)
    {
        assertEquals(true, (testObj.getStatus().currentPosition.x >= 0));
        assertEquals(true, (testObj.getStatus().currentPosition.x <= 10));
        
    }

    @Then("the Game sets the character's Y position to {int}")
    public void checkYPosition(int yPosition) 
    {
        assertEquals(true, (testObj.getStatus().currentPosition.y >= 0));
        assertEquals(true, (testObj.getStatus().currentPosition.y <= 10));
    }

    @Then("the move count is {int}")
    public void checkMoveCount(int moveCount) 
    {
        assertEquals(moveCount, testObj.getMoveCount());
    }

}
