/**
 * Created by H4x0r on 27/03/20
 * Project - Creating Sports Teams using Generics
 */

package Generics_Example;

import java.util.ArrayList;

public class Main {

    // Generics is used to finding errors early in code at compile time rather than at runtime
    public static void main(String[] args) {
        Football joe = new Football("Joe");
        Baseball pat = new Baseball("Pat");
        Soccor beckham = new Soccor("Beckham");

        Team<Football> adelaideCrows = new Team<>("Adelaide Crows");
        adelaideCrows.addPlayer(joe);
//        adelaideCrows.addPlayer(pat);
//        adelaideCrows.addPlayer(beckham);

        System.out.println(adelaideCrows.numPlayers());

        Team<Baseball> baseballTeam = new Team<>("Chicago Cubs");
        baseballTeam.addPlayer(pat);

        Team<Soccor> brokenTeam = new Team<>("this won't work");
        brokenTeam.addPlayer(beckham);

        Team<Football> melbourne = new Team<>("Melbourne");
        Football banks = new Football("Gordon");
        melbourne.addPlayer(banks);

        Team<Football> hawthorn= new Team<>("Hawthorn");
        Team<Football> fremantle= new Team<>("Fremantle");

        hawthorn.matchResult(fremantle, 1, 0);
        hawthorn.matchResult(adelaideCrows, 3, 8);

        adelaideCrows.matchResult(fremantle, 2, 1);
//        adelaideCrows.matchResult(baseballTeam, 1, 1);

        System.out.println("Rankings");
        System.out.println(adelaideCrows.getName() + " : " + adelaideCrows.ranking());
        System.out.println(melbourne.getName() + " : " + melbourne.ranking());
        System.out.println(fremantle.getName() + " : " + fremantle.ranking());
        System.out.println(hawthorn.getName() + " : " + hawthorn.ranking());

        System.out.println(adelaideCrows.compareTo(melbourne));
        System.out.println(adelaideCrows.compareTo(hawthorn));
        System.out.println(hawthorn.compareTo(adelaideCrows));
        System.out.println(melbourne.compareTo(fremantle));

        ArrayList<Team> teams;
       // Collections.sort(teams);
    }
}