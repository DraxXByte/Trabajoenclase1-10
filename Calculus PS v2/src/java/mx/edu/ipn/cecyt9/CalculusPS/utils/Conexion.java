package mx.edu.ipn.cecyt9.CalculusPS.utils;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class Conexion {
    
    Connection c=null;
    Statement s;  
    public Conexion(){
    }
    public void conecta(){
        try{
        Class.forName("com.mysql.jdbc.Driver").newInstance();
        c = DriverManager.getConnection("jdbc:mysql://localhost/lab3","root","n0m3l0");
        
        }catch(Exception e){
            System.out.print("Error");
        }
    }
    public void cierra() throws SQLException{
        c.close();
    }
    public int update(String update) throws SQLException{
        s = c.createStatement();
        return s.executeUpdate(update);
    }
    public ResultSet query(String query) throws SQLException{
        s = c.createStatement();
        return s.executeQuery(query);
    }
}
