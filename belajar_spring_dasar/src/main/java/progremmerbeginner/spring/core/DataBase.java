package progremmerbeginner.spring.core;

public class DataBase {

    private static DataBase dataBase;

    public static DataBase getInstance(){
        if (dataBase == null){
            dataBase = new DataBase();
        }
        return dataBase;
    }
    private DataBase() {
    }
}
