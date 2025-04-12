package databaseconnection;

//Session class to store the username and usertype of user logged in
public class Session {
    public static String username;
    public static String userType;
    
    public static void setUser(String username, String userType){
        Session.username = username;
        Session.userType = userType;
    }
    
    public static String getUsername(){
        return username;
    }
    
    public static String getUserType(){
        return userType;
    }
    
    public static void clear(){
        username = null;
        userType = null;
    }
}
