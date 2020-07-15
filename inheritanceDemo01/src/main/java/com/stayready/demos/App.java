package com.stayready.demos;

import com.stayready.demos.artist.Artist;
import com.stayready.demos.artist.DrDre;
import com.stayready.demos.artist.Kanye;
import com.stayready.demos.artist.components.Hook;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList<Artist> aftermath = new ArrayList<>();
        ArrayList<Hook> singers = new ArrayList<>();
        Artist drDre = new DrDre();
        Kanye kanye = new Kanye();

        aftermath.add(drDre);
        aftermath.add(kanye);
        singers.add(kanye);

        Artist drDreClone = new DrDre();
        if (drDreClone.equals(kanye)){
            System.out.println("Same DUDE");
        }else{
            System.out.println("Different dude");
        }


    }
}
