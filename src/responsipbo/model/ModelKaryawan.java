package responsipbo.model;

import java.sql.*;
import responsipbo.Connector;

/**
 *
 * @author user
 */
public class ModelKaryawan {
    Karyawan data[] = new Karyawan[500]; 
    Connector connector = new Connector();  
    
    
    public Karyawan[] getAll(){
         try{
            int jmlData = 0; //menampung jumlah data sebanyak jumlah data yang ada, defaultnya 0
            String query = "Select * from `karyawan`"; //proses pengambilan data
            connector.statement = connector.koneksi.createStatement();
            ResultSet resultSet = connector.statement.executeQuery(query); //result isinya tabel belum berupa string
            while(resultSet.next()){ //konversi tabel ke string
                int id = resultSet.getInt("id");
                String name = resultSet.getString("nama");
                int age = resultSet.getInt("usia");
                double salary = resultSet.getInt("gaji");
                data[jmlData] = new Karyawan(id, name, age, salary);
                jmlData++;
            }
            connector.statement.close();
        }catch(SQLException e){
            System.out.println(e.getMessage());
            System.out.println("SQL Error");
        }
    return data;
    }
    
    public Karyawan getOne(int id){
         try{
            String query = "Select * from `karyawan` where `id` ='"+id+"'"; //proses pengambilan data
            connector.statement = connector.koneksi.createStatement();
            ResultSet resultSet = connector.statement.executeQuery(query); //result isinya tabel belum berupa string
            while(resultSet.next()){ //konversi tabel ke string
                //int id = resultSet.getInt("id");
                String name = resultSet.getString("nama");
                int age = resultSet.getInt("age");
                double salary = resultSet.getDouble("salary");
                data[0] = new Karyawan(id,name,age,salary);
            }
            connector.statement.close();
        }catch(SQLException e){
            System.out.println(e.getMessage());
            System.out.println("SQL Error");
        }
    return data[0];
    }
    
     public String create(Karyawan karyawan){
         String message = "Bad Request";
         try{
                String name = karyawan.getName();
                int age = karyawan.getAge();
                double salary = karyawan.getSalary();

            String query = "INSERT INTO `karyawan`(`nama`, `usia`,`gaji`) VALUES ('"+name+"','"+age+"','"+salary+"')"; 
            connector.statement = connector.koneksi.createStatement();
            connector.statement.executeUpdate(query); 
            message = "Queri Berhasil";
            connector.statement.close();
        }catch(SQLException e){
            System.out.println(e.getMessage());
            System.out.println("SQL Error");
        }
    return message;
    }
     
        public String delete(int id) {
        String message = "Bad Request";
        try {
            String query = "DELETE FROM karyawan WHERE id = '" + id + "'";
            connector.statement = connector.koneksi.createStatement();
            connector.statement.executeUpdate(query);
            message = "Queri Berhasil";
            connector.statement.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            System.out.println("SQL Error");
        }
        return message;
    }

}