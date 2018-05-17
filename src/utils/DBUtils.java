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
        String sql = "select r.DayOfWeek, r.Para, g.Nazva, v.PIB, p.Nazva, r.Auditoria , r.Week from Rozklad r, Groups g, Vikladachi v, Predmeti p, Auditorii a WHERE r.Grupa=g.Kod and r.Vikladach=v.Number and r.Predmet=p.Kod and r.Auditoria=a.Kod ";

        PreparedStatement pstm = conn.prepareStatement(sql);

        ResultSet rs = pstm.executeQuery();
        List<Rozklad> list = new ArrayList<Rozklad>();
        while (rs.next()) {
            //int Kod = rs.getInt("Kod");
            String DayOfWeek = rs.getString("DayOfWeek");
            int Para = rs.getInt("Para");
            String Grupa = rs.getString("g.Nazva");
            String Vikladach = rs.getString("v.PIB");
            String Predmet = rs.getString("p.Nazva");
            int Auditoria = rs.getInt("Auditoria");
            int Week = rs.getInt("Week");

            Rozklad rozklad = new Rozklad( DayOfWeek, Para, Grupa, Vikladach, Predmet, Auditoria, Week);
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
    public static List<Rozklad> findRozklad(Connection conn, String Grupa) throws SQLException {
        String sql = "select r.DayOfWeek, r.Para, g.Nazva, v.PIB, p.Nazva, r.Auditoria , r.Week from Rozklad r, Groups g, Vikladachi v, Predmeti p, Auditorii a WHERE r.Grupa=g.Kod and r.Vikladach=v.Number and r.Predmet=p.Kod and r.Auditoria=a.Kod and g.Nazva=?";

        PreparedStatement pstm = conn.prepareStatement(sql);
        pstm.setString(1, String.valueOf(Grupa));

        ResultSet rs = pstm.executeQuery();
        List<Rozklad> list = new ArrayList<Rozklad>();
        while (rs.next()) {
            String DayOfWeek = rs.getString("DayOfWeek");
            int Para = rs.getInt("Para");
            String Vikladach = rs.getString("v.PIB");
            String Predmet = rs.getString("p.Nazva");
            int Auditoria = rs.getInt("Auditoria");
            int Week = rs.getInt("Week");
            Rozklad rozklad= new Rozklad(DayOfWeek, Para, Grupa, Vikladach, Predmet, Auditoria, Week);

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

        //return null;
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

   */

}