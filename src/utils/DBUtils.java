package utils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.ArrayList;
import java.util.List;

import beans.Auditorii;
import beans.Rozklad;
import beans.Specialnosti;
import beans.Vikladachi;
import beans.Groups;
import beans.NavantazhenyaGroup;
import beans.NavantazhenyaVikladachiv;
import beans.Predmeti;


public class DBUtils {



    public static List<Rozklad> queryRozklad(Connection conn) throws SQLException {
        String sql = "select r.DayOfWeek, r.Para, g.Nazva, v.PIB, p.Nazva, a.Nazva , r.Week from Rozklad r, Groups g, Vikladachi v, Predmeti p, Auditorii a WHERE r.Grupa=g.Kod and r.Vikladach=v.Number and r.Predmet=p.Kod and r.Auditoria=a.Kod ";

        PreparedStatement pstm = conn.prepareStatement(sql);

        ResultSet rs = pstm.executeQuery();
        List<Rozklad> list = new ArrayList<Rozklad>();
        while (rs.next()) {
            //int Kod = rs.getInt("Kod");
            String DayOfWeek = rs.getString("DayOfWeek");
            int Para = rs.getInt("Para");
            int Grupa = rs.getInt("g.Nazva");
            int Vikladach = rs.getInt("v.PIB");
            int Predmet = rs.getInt("p.Nazva");
            int Auditoria = rs.getInt("a.Nazva");
            int Week = rs.getInt("Week");

            Rozklad rozklad = new Rozklad();
            //rozklad.setKod(Kod);
            rozklad.setDayOfWeek(DayOfWeek);
            rozklad.setPara(Para);
            rozklad.setGrupa(Grupa);
            rozklad.setVikladach(Vikladach);
            rozklad.setPredmet(Predmet);
            rozklad.setAuditoria(Auditoria);
            rozklad.setWeek(Week);

            list.equals(rozklad);
            list.add(rozklad);
            System.out.println(list);


        }
        pstm.close();
        return list;
    }

   /* public static Product findProduct(Connection conn, String code) throws SQLException {
        String sql = "Select a.Code, a.Name, a.Price from Product a where a.Code=?";

        PreparedStatement pstm = conn.prepareStatement(sql);
        pstm.setString(1, code);

        ResultSet rs = pstm.executeQuery();

        while (rs.next()) {
            String name = rs.getString("Name");
            float price = rs.getFloat("Price");
            Product product = new Product(code, name, price);
            return product;
        }
        return null;
    }

    public static void updateProduct(Connection conn, Product product) throws SQLException {
        String sql = "Update Product set Name =?, Price=? where Code=? ";

        PreparedStatement pstm = conn.prepareStatement(sql);

        pstm.setString(1, product.getName());
        pstm.setFloat(2, product.getPrice());
        pstm.setString(3, product.getCode());
        pstm.executeUpdate();
    }

    public static void insertProduct(Connection conn, Product product) throws SQLException {
        String sql = "Insert into Product(Code, Name,Price) values (?,?,?)";

        PreparedStatement pstm = conn.prepareStatement(sql);

        pstm.setString(1, product.getCode());
        pstm.setString(2, product.getName());
        pstm.setFloat(3, product.getPrice());

        pstm.executeUpdate();
    }

    public static void deleteProduct(Connection conn, String code) throws SQLException {
        String sql = "Delete From Product where Code= ?";

        PreparedStatement pstm = conn.prepareStatement(sql);

        pstm.setString(1, code);

        pstm.executeUpdate();
    }*/

}