package app;

public class Treasure { 
    private int value;
    private String title;
  
    public Treasure(String title, int value) {
      this.title = title;
      this.value = value;
    }
  
    public Treasure(String title) {
      this(title, 50);
    }
  
    public int value() {
      return this.value; 
    }

    public String title() {
        return this.title; 
    }
  
    public void value(int value) {
      this.value = value;
    }
    
    public void title(String title) {
        this.title = title;
    }

    // UTILITIES
    
    @Override
    public String toString() {
        return this.title + " (" + this.value + "gold)";
    }
  }