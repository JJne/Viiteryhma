/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example.References;

import java.util.List;

public class Article {
    //required:
    //List luultavasti järkevämpi kuin pelkkä String, erityisesti kun myöhemmin listataan viitteet
    private List<String> author;
    private String title;
    private String journal;
    //int? String? Year?
    private String year;
    //int? String?
    private String volume;
    
    //optional:
    //int?
    private String number;
    private String pages;
    private String month;
    private String note;
    //A hidden field used for specifying or overriding the alphabetical order of entries
    //(when the "author" and "editor" fields are missing). Note that this is very
    //different from the key (mentioned just after this list) that is used to cite
    //or cross-reference the entry. (https://en.wikipedia.org/wiki/BibTeX)
    private String key;
    
    //or Article(String title, String journal, int year, String volume, String... author) ?
    public Article(List<String> author, String title, String journal, String year, String volume) {
        this.author = author;
        this.title = title;
        this.journal = journal;
        this.year = year;
        this.volume = volume;
        
        this.number = "";
        this.pages = "";
        this.month = "";
        this.note = "";
        this.key = "";
    }
    
    public void setNumber(String number) {
        this.number = number;
    }
    
    public void setPages(String pages) {
        this.pages = pages;
    }
    
    public void setMonth(String month) {
        this.month = month;
    }
    
    public void setNote(String note) {
        this.note = note;
    }
    
    public void setKey(String key) {
        this.key = key;
    }

    public List<String> getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public String getJournal() {
        return journal;
    }

    public String getYear() {
        return year;
    }

    public String getVolume() {
        return volume;
    }

    public String getNumber() {
        return number;
    }

    public String getPages() {
        return pages;
    }

    public String getMonth() {
        return month;
    }

    public String getNote() {
        return note;
    }

    public String getKey() {
        return key;
    }
    
    //testaukseen ehkä kiva...
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        
        builder.append("Authors: " + this.author.get(0));
        int numberOfAuthors = this.author.size(); 
        for(int i = 1; i < numberOfAuthors; i++) {
            if(i == numberOfAuthors - 1) {
                builder.append(" and " + this.author.get(i));
                break;
            }
            builder.append(", " + this.author.get(i));
        }
        builder.append("\n");
        
        builder.append("Title: " + this.title + "\n");
        builder.append("Journal: " + this.journal + "\n");
        builder.append("Year: " + this.year + "\n");
        builder.append("Volume: " + this.volume + "\n");
        
        if(!this.number.isEmpty()) {
            builder.append("Number: " + this.number + "\n");
        }
        
        if(!this.pages.isEmpty()) {
            builder.append("Pages: " + this.pages + "\n");
        }
        
        if(!this.month.isEmpty()) {
            builder.append("Month: " + this.month + "\n");
        }
        
        if(!this.note.isEmpty()) {
            builder.append("Note: " + this.note + "\n");
        }
        
        //necessary?
        if(!this.key.isEmpty()) {
            builder.append("Key: " + this.key + "\n");
        }
        
        builder.append("\n");        
        return builder.toString();
    }
}
