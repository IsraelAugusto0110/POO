package com.fatec;

import java.sql.*;
import java.util.ArrayList;

public class DataBase {
	private String url;
    private String user;
    private String pass;
    private Connection conn;

    DataBase() throws ClassNotFoundException, SQLException{
        this.user = "postgres";
        this.pass = "postgres";
        this.url = "jdbc:postgresql://localhost:5432/MyDb";
        Class.forName("org.postgresql.Driver");
    }

    public void connect() throws SQLException {
        if(this.conn == null) {
                this.conn = DriverManager.getConnection(this.url, this.user, this.pass);
                System.out.println("Conectado com Sucesso");
        }
    }

    public void disconnect() throws SQLException {
        if(this.conn != null) {
                this.conn.close(); 
                this.conn = null;
                System.out.println("Desconectado com sucesso");
        }
    }

    public ArrayList<String> getTables() throws SQLException {
        connect();
        Statement stmt = conn.createStatement();
        ResultSet rst = stmt.executeQuery("SELECT tablename FROM pg_catalog.pg_tables WHERE schemaname = 'fatecsjc'");
        ArrayList<String> list = new ArrayList<String>();
        while(rst.next()) {
            list.add(rst.getString("tablename"));
        }
        disconnect();
        return list;
    }
    
    public void insereCliente(String nome) throws SQLException {
    	connect();
    	Statement stmt = conn.createStatement();
    	String sql = "INSERT INTO public.costumers (name) VALUES ('" + nome +"')";
    	stmt.executeUpdate(sql);
    	//conn.commit();
    	disconnect();
    }
}
