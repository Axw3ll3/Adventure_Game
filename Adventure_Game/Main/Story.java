package Adventure_Game.Main;
public class Story {
    public Story(Player player){
        this.player = player;
    }
        public void prologue(){
            Slowprint.slowPrintln(player.getName()+" wake up in the middle of a road. You have no memory of how you got here. You are all alone.\n" +
            "At your left, you spot the buildings of what seems to have once been a small city full of life, with\n" +
            "a police station, a hospital, and a mall, now completely abandoned. Most of what's left of the\n" +
            "windows are now just holes, with broken glass on the street. It's as if someone has been in such a\n" +
            "rush, they've just jumped right out of the window. The cars are parked in the middle of the road,\n" +
            "doors open, as if someone did not even have the time to close them. As you stand a bit away from\n" +
            "the cars, it's hard to tell, but you can't help but see the spots on one of the car's back window.\n" +
            "It really looks like... blood.\n\n" +
            "At your right, you get a glimpse of the tall dark trees, barely visible as the mist slowly surrounds it.\n" +
            "It is quiet, too quiet, except for the occasional sounds of something... Scraping? Or is it footsteps\n" +
            "amongst the leaves? It's cold outside, and you could really use some heat, but just the thought of\n" +
            "going into one of the houses gives you the creeps. You don't know what awaits you either way, but\n" +
            "maybe the forest at least could offer you some sort of shelter, away from the eerie city.\n" +
            "Do you choose to [1] go to the city or [2] go into the forest? ");
            }

        
 
        
        public void prologueContinue(){
            Slowprint.slowPrintln("As you leave the policestation behind, you look around to the remaining houses. Besides the\n" +
        "residential buildings, there are two buildings rising above the others. One looks like a mall and\n" +
        "the other a hospital. Both could host even more gruesome creatures, but they could also contain a\n" +
        "better chance to escape, or some sort of a lifeline.\n\n" +
        "Which one would be the better choice? The mall [1] or the hospital [2]?\n" +
        "Enter your choice...");
        }
    }

