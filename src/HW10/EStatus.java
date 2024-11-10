package HW10;

public enum EStatus {
    NotCreated("Привет", ""),
    Work(""),
    Fail("");

    private String message;

    private String second;

    EStatus(String message){
        this.message=message;
    }

    EStatus(String message, String second){
        this.message=message;
        this.second=second;
    }

    String getMessage(){
        return message;
    }

    String getSecond(){
        return second;
    }

    void setSecond(String second){
        this.second=second;
    }
}
