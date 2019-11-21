package ru.itvitality.sbrf.cu.library;

import ru.itvitality.sbrf.cu.library.dao.ClientDao;
import ru.itvitality.sbrf.cu.library.dao.impl.ClientDaoImpl;
import ru.itvitality.sbrf.cu.library.entities.Client;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Starter {
    public static void main( String args[] ) {


        try {
            Class.forName("org.h2.Driver");
            Connection conn = DriverManager.getConnection("jdbc:h2:/Users/administrator/IdeaProjects/sbercurs/181119workV2/hw181119_v2_sb_ku_2019_10_materials/db/h2-1.3.175.jar", "test", "test");
            Statement st = conn.createStatement();
            String script = "create table employee\n" +
                    "(first varchar(15),\n" +
                    " last varchar(20),\n" +
                    " age number(3),\n" +
                    " address varchar(30),\n" +
                    " city varchar(20),\n" +
                    " state varchar(20));";
            st.execute(script);
            //st.execute("create table book(name varchar(20)");
            System.out.println("create table successfully...PASS");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }


        ClientDao clientDao = new ClientDaoImpl();

        Client client = new Client();
        client.setName( "Иван" );
        client.setPhone("8800100");
        client.setAddress("Советский союз");
        clientDao.insert( client );

        /*client = new Client();
        client.setName( "test2" );
        clientDao.insert( client );*/

        clientDao.list().forEach( c -> System.out.println( c ) );
    }
}
