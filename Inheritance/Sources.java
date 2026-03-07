class Content {
    String title;
    int duration;
    String artist;

    Content(String title, int duration, String artist) {
        this.title = title;
        this.duration = duration;
        this.artist = artist;
    }

    void play() {
        System.out.println("Playing " + title);
    }
}

class Song extends Content {
    String genre;

    Song(String title, int duration, String artist, String genre) {
        super(title, duration, artist);
        this.genre = genre;
    }

    void display() {
        System.out.println("Song: " + title + " Genre: " + genre);
    }
}

class Podcast extends Content {
    int episode;

    Podcast(String title, int duration, String artist, int episode) {
        super(title, duration, artist);
        this.episode = episode;
    }

    void display() {
        System.out.println("Podcast: " + title + " Episode: " + episode);
    }
}

class Audiobook extends Content {
    int chapters;

    Audiobook(String title, int duration, String artist, int chapters) {
        super(title, duration, artist);
        this.chapters = chapters;
    }

    void display() {
        System.out.println("Audiobook: " + title + " Chapters: " + chapters);
    }
}

public class Sources {
    public static void main(String[] args) {

        Song s = new Song("Melody", 4, "Arjun", "Pop");
        Podcast p = new Podcast("TechTalk", 30, "Host A", 5);
        Audiobook a = new Audiobook("Java Guide", 120, "Author B", 12);

        s.display();
        p.display();
        a.display();
    }
}
