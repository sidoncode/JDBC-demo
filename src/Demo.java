import com.mysql.jdbc.Driver;

import java.sql.*;
public class Demo {
    public static void main(String args[]){

        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:8111/test","admin2","admin1");

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from empdata");
            while (resultSet.next()){
                System.out.println(resultSet.getInt(1) + " "+ resultSet.getString(2));

            }

            connection.close();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }

}
