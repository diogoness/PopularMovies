package app.com.example.android.popularmovies;

public class Movie {
    private String id;
    private String title;
    private String overview;
    private String posterPath;

    public Movie(String id, String title, String overview, String posterPath){
        this.id = id;
        this.title = title;
        this. overview = overview;
        this.posterPath = posterPath;
    }

    public String getId(){
        return id;
    }

    public String getTitle(){
        return title;
    }

    public String getOverview (){
        return overview;
    }

    public String getPosterPath(){
        return posterPath;
    }
}