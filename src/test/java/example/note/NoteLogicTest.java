package example.note;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class NoteLogicTest {

    @Test
    public void testAddCommand() {
        NoteLogic noteLogic = new NoteLogic();
        noteLogic.handleMessage("/add ABOBA");
        String expected = "Your notes: ABOBA";
        String actual = noteLogic.handleMessage("/notes");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testEditCommand(){
        NoteLogic noteLogic = new NoteLogic();
        noteLogic.handleMessage("/add AB0BA");
        noteLogic.handleMessage("/edit ABOBA");
        String expected = "Your notes: ABOBA";
        String actual = noteLogic.handleMessage("/notes");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testDeleteCommand(){
        NoteLogic noteLogic = new NoteLogic();
        noteLogic.handleMessage("/add ABOBA");
        noteLogic.handleMessage("/add aboba");
        noteLogic.handleMessage("/delete aboba");
        String expected = "Your notes: ABOBA";
        String actual = noteLogic.handleMessage("/notes");
        Assert.assertEquals(expected, actual);
    }
}