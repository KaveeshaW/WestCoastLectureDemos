package com.stayready.demos.artist;

import org.junit.Assert;
import org.junit.Test;

public class ArtistTest {

    @Test
    public void constructorTest(){
        String expectedName = "Andre Benjamin";
        String expectedAlias = "Andre 3000";
        Integer expectedAge = 45;

        Artist artist = new DrDre() ;

        String expectedString = expectedName + " " + expectedAlias + " " + expectedAge;

        Assert.assertTrue(expectedString.equals(artist.toString()));
    }
}
