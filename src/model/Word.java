package model;

public class Word {
    private String key;
    private String value;
    boolean isShowed;

    public Word(String key,String value){
        setKey(key);
        setValue(value);
    }

    public String getValue(){
        return value;
    }

    public void setKey(String key) {
        this.key = key.trim().toLowerCase();
    }

    public void setValue(String value){
        this.value=value.trim().toLowerCase();
    }
}
