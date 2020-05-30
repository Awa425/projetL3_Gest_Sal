/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author The_Pirate
 */
public class Connexion {
    public static Connection con=null;
    public static Connection getCo(){
    try{
    Class.forName("com.mysql.jdbc.Driver").newInstance();
    String url="jdbc:mysql://localhost/mabase?user=root";
    if(con==null){
    con=DriverManager.getConnection(url);
    }}
    catch(Exception e){}
    return con;
    }
}
  
