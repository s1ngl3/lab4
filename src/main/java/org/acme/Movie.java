package org.acme;

public class Movie {
    private long id;
    private String title;

    public Movie() {

    }

    public Movie(long id, String title) {
        this.id = id;
        this.title = title;
    }

    public Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id = id;
    }

    public String getTitle(){
        return title;
    }
    public void setTitle(String title){
        this.title = title;
    }
}
