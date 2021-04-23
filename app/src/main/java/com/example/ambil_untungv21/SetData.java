package com.example.ambil_untungv21;

public class SetData {
    String title;
    String description;
    String image;

    SetData(String title, String description, String image)
    {
        this.title = title;
        this.description = description;
        this.image = image;
    }

    public String getTitle()
    {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getImage() {
        return image;
    }
}
