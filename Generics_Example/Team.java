package Generics_Example;

import java.util.ArrayList;

// Extending allows to directly use methods of Player in line 26 and 31
// Can extends to interfaces also - T extends Player & Coach & Manager
public class Team<T extends Player> implements  Comparable<Team <T>>{
    private String name;
    int played=0;
    int won=0;
    int lost=0;
    int tied=0;

    private ArrayList<T> members= new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // To add player
    public boolean addPlayer( T player){
        if(members.contains(player)) {
            System.out.println(player.getName() + " already present");
            return false;
        }
        else{
            members.add(player);
            System.out.println(player.getName()+" player added");
            return true;
        }
    }

    // Return number of players
    public int numPlayers(){
        return this.members.size();
    }

    // To update scores
    public void matchResult(Team<T> opponent, int ourScore, int theirScore) {
        String message;
        if (ourScore > theirScore) {
            won++;
            message = "beat";
        } else if (ourScore == theirScore) {
            tied++;
            message = "tied to";
        } else {
            lost++;
            message = "lost to";
        }
        played++;

        // To increase opponent score and also ensuring it executes just once
        if (opponent != null) {
            System.out.println(this.getName() + message + opponent.getName());
            opponent.matchResult(null, theirScore, ourScore);
        }
    }
    // Return ranking
    public int ranking(){
        return (won*2)+tied;
    }


    // Collections sort can be used to0
    @Override
    public int compareTo(Team<T> team) {
        if(this.ranking() > team.ranking()) {
            return -1;
        }
        else if(this.ranking() < team.ranking()) {
            return 1;
        }
        else
            return 0;
    }
}
