package songs;

import java.util.*;

public class Main {
    private static ArrayList<Album> albums = new ArrayList<Album>();
    private static boolean forward = true;

    public static void main(String[] args){
        Album album = new Album("X Infinity", "Watsky");
        album.addSong("Tiny Glowing Screens, Pt3", 3.53);
        album.addSong("Talking to Myself", 3.41);
        album.addSong("Chemical Angel", 2.31);
        album.addSong("Little Slice", 3.24);
        album.addSong("Springtime in New York", 2.23);
        album.addSong("Pink Lemonade", 3.17);
        album.addSong("Don't be nice", 3.18);
        album.addSong("Yes Britannia", 3.37);
        album.addSong("Love Letters", 4.24);
        album.addSong("Stick to Your Guns", 4.05);
        album.addSong("Brave New World", 4.04);
        album.addSong("Going Down", 5.16);
        album.addSong("Midnight Heart", 4.37);
        album.addSong("Lovely Things Suite: Conversations", 3.40);
        album.addSong("Lovely Things Suite: Knots", 3.06);
        album.addSong("Lovely Things Suite: Roses", 4.09);
        album.addSong("Lovely Things Suite: Theories", 6.17);
        album.addSong("Exquisite Corpse", 9.40);
        albums.add(album);

        album = new Album("A Change of Seasons", "Dream Theater");
        album.addSong("A Change of Seasons", 23.09);
        album.addSong("Funeral for a Friend/Love Lies Bleeding", 10.46);
        album.addSong("Perfect Strangers", 5.33);
        album.addSong("'The Rover' / 'Achilles Last Stand' / 'The Song Remains the Same' (Led Zeppelin cover)", 7.30);
        album.addSong("The Big Medley", 10.32);
        albums.add(album);


        LinkedList<Song> playlist = new LinkedList<Song>();
        albums.get(0).addPlaylist("Little Slice", playlist);
        albums.get(0).addPlaylist("Going Down", playlist);
        albums.get(0).addPlaylist("Lovely Things Suite: Death", playlist); //Doesn't exist
        albums.get(0).addPlaylist(18, playlist);
        albums.get(1).addPlaylist(1, playlist);
        albums.get(1).addPlaylist(3, playlist);
        albums.get(1).addPlaylist(10, playlist);//Doesn't exist

        play(playlist);

    }


    private static void play(LinkedList<Song> playlist){
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        ListIterator<Song> listIterator = playlist.listIterator();
        if(playlist.size() == 0){
            System.out.println("No songs in your playlist!");
            return;
        } else {
            System.out.println("Now playing: " + listIterator.next().toString());
            printMenu();
        }

        while(!quit){
            int action = scanner.nextInt();
            scanner.nextLine();
            switch(action){
                case 0:
                    System.out.println("Exiting playlist...");
                    quit = true;
                    break;
                case 1:
                    nextSong(listIterator);
                    break;
                case 2:
                    previousSong(listIterator);
                    break;
                case 3:
                    repeatSong(listIterator);
                    break;
                case 4:
                    printList(playlist);
                    break;
                case 5:
                    removeSong(playlist, listIterator);
                    break;
                case 6:
                    printMenu();
                    break;
            }
        }
    }

    private static void printMenu(){
        System.out.println("Actions:\npress");
        System.out.println("0 to quit \n" +
                "1 to play next song\n" +
                "2 to play previous song\n"+
                "3 to replay current song\n"+
                "4 to list songs in playlist\n" +
                "5 to remove current song from playlist\n" +
                "6 to print actions");
    }

    private static void printList(LinkedList<Song> playlist){
        Iterator<Song> iterator = playlist.iterator();
        System.out.println("-------------------------------");
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("-------------------------------");
    }

    private static void nextSong(ListIterator<Song> listIterator){
        if(!forward){
            if(listIterator.hasNext()){
                listIterator.next();
            }
            forward = true;
        }
        if(listIterator.hasNext()){
            System.out.println("Now playing: " + listIterator.next().toString());
        } else {
            System.out.println("You have finished your playlist.");
        }
    }

    private static void previousSong(ListIterator<Song> listIterator){
        if(forward){
            if(listIterator.hasPrevious()){
                listIterator.previous();
            }
            forward = false;
        }
        if(listIterator.hasPrevious()){
            System.out.println("Now playing: " + listIterator.previous().toString());
        } else {
            System.out.println("You have finished your playlist.");
        }
    }

    private static void repeatSong(ListIterator<Song> listIterator){
        if(forward){
            if(listIterator.hasPrevious()){
                System.out.println("Now playing: " + listIterator.previous().toString());
                forward = false;
            } else {
                System.out.println("You have reached the start your playlist.");
            }
        } else {
            if(listIterator.hasNext()){
                System.out.println("Now playing: " + listIterator.next().toString());
                forward = true;
            } else {
                System.out.println("You have finished your playlist.");
            }
        }
    }

    private static void removeSong(LinkedList<Song> playlist, ListIterator<Song> listIterator){
        if(playlist.size() > 0){
            listIterator.remove();
            if(listIterator.hasNext()){
                System.out.println("Now playing: " + listIterator.next().toString());
            } else if (listIterator.hasPrevious()) {
                System.out.println("Now playing: " + listIterator.previous().toString());
            }
        }
    }

}
