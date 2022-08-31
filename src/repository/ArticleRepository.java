package repository;

import entity.Article;
import entity.User;
import service.ApplicationConstant;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ArticleRepository {
    public Article published() throws SQLException {
        String sqlSelect = "SELECT * FROM article WHERE publishStatus = true";
        Statement published = (Statement) ApplicationConstant.getConnection();
        ResultSet resultSet = published.executeQuery(sqlSelect);
        while (resultSet.next()) {
            System.out.print(resultSet.getString("title") + ", ");
            System.out.println(resultSet.getDate("createDate" + ", "));

        }
        return null;
    }
}
