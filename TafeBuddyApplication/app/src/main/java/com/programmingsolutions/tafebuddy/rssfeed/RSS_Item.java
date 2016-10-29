package com.programmingsolutions.tafebuddy.rssfeed;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by Matthew Shinkfield on 10/29/2016.
 */

public class RSS_Item {

    private static SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ");

    public final String title;
    public final String description;
    public final String link;
    public final Date date;
    public List<String> categories;

    public RSS_Item(String title, String description, String link, String date) {
        this.title = title;
        this.description = description;
        this.link = link;
        Date formatteddate;
        try {
            formatteddate = formatter.parse(date.replaceAll("Z$", "+0000"));
        } catch (ParseException e) {
            formatteddate = new Date();
            e.printStackTrace();
        }
        this.date = formatteddate;
    }

    public static SimpleDateFormat getFormatter() {
        return formatter;
    }

    public static void setFormatter(SimpleDateFormat formatter) {
        RSS_Item.formatter = formatter;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getLink() {
        return link;
    }

    public Date getDate() {
        return date;
    }

    public List<String> getCategories() {
        return categories;
    }

    public void setCategories(List<String> categories) {
        this.categories = categories;
    }

    public void addCategory(String category){
        this.categories.add(category);
    }
}
