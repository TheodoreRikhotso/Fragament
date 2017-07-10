package com.example.admin.fragament;

/**
 * Created by Admin on 6/21/2017.
 */

public class French {
    private String englishWord;
    private String frenchWord;
    private int image;
    private int imageButton;
    private int sound;

    public French() {

    }

    public French(String englishWord, String frenchWord, int image, int imageButton) {
        this.englishWord = englishWord;
        this.frenchWord = frenchWord;
        this.imageButton = imageButton;
        this.image = image;
    }

    public int getImageButton() {
        return imageButton;
    }

    public void setImageButton(int imageButton) {
        this.imageButton = imageButton;
    }

    public String getFrenchWord() {
        return frenchWord;
    }

    public void setFrenchWord(String frenchWord) {
        this.frenchWord = frenchWord;
    }

    public String getEnglishWord() {
        return englishWord;
    }

    public void setEnglishWord(String englishWord) {
        englishWord = englishWord;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
