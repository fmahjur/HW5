package repository;

import entity.User;
import service.ApplicationConstant;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserRepository {
    public void insert(User user) throws SQLException,Exception{
        String sqlInsert = "INSERT INTO user (id, username,nationalCode,birthday, password) " +
                "VALUES ('\"+user.id+\"','\"+user.username+\"','\"+user.nationalCode+\"','\"+user.birthday+\"','\"+user.password+\"')";
    }

    public void delete(User User) throws SQLException{
        String deleteQuery = "DELETE FROM persons WHERE person_id = ?";
        PreparedStatement preparedStatement = ApplicationConstant.getConnection().prepareStatement(deleteQuery);

    }


}
