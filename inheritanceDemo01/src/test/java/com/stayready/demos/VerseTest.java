package com.stayready.demos;

import com.stayready.demos.song.components.Content;
import com.stayready.demos.song.components.Verse;
import org.junit.Assert;
import org.junit.Test;

public class VerseTest {

    @Test
    public void contructorTest(){
        String expected = "Hickory Dickory Dock";
        Content content = new Verse(expected);
        String actual = content.getContent();
        Assert.assertEquals(expected, actual);

    }
}
