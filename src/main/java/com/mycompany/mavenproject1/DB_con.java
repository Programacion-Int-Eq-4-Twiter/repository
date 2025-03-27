
package com.mycompany.mavenproject1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Vicente193373
 */        
public class DB_con 
{
    //*
    ///Estos strings tienen la funcion de contener los detalles de la conexio a la base de datos
    ///Hasta tener mas instrucciones cada miembro del equipo debe de crear una base de datos
    ///en su computadora y anotar los detalles de este aqui
    //public String connectionstring = "jdbc:sqlserver://localhost---";
    public String connectionstring = "jdbc:mysql://localhost:3306/BD_Twitter";
    public String dbhost = "host";
    public String dbpass = "";
    
    //Define una conexion dentro de este recurso
    Connection conn = null;
    
    //Esta funcion se encargara de configurar la conexion con la base de datos y comprobar que conecte
    public void Conectar()
    {
        Connection conn = null;
        try 
        {
            this.conn = DriverManager.getConnection(connectionstring, dbhost, dbpass);
            System.out.print("Conexion exitosa"); //Print
        } 
        catch (SQLException ex) 
        {
            System.out.print("Error de conexion"); //Print
            Logger.getLogger(DB_con.class.getName()). log(Level.SEVERE, null, ex);
        }
    }
    
    //Función para referenciar la conexion definida fuera de este recurso
    public Connection Get_conexion()
    {
        return this.conn;
    }

    //Esta funcion busca encontrar un registro con nombre y contraseña validos
    public boolean Ex_select(String usr, String psw)
    {
        try 
        {
            //Se establece la conexion ya definida en esta funcion
            Connection c = this.Get_conexion();
            
            //Se define una variable de tipo string para contener un query de SQL
            //Particularmente busca en la tabla 'usr' un registro con cierto nombre y contraseña
            String query = "SELECT * FROM Usuario WHERE correo = ? AND clave = ?";
            
            //Se define "sta" como el contenedor del query
            PreparedStatement sta;
            sta = c.prepareStatement(query);
            
            //Se inserta el string 'usr' en el primer "?" del query
            sta.setString(1, usr);
            
            //Se inserta el string 'psw' en el segundo "?" del query
            sta.setString(2, psw);

            //Ejecuta el query y guarda el resultado en 'rs'
            ResultSet rs = sta.executeQuery();
            
            //En este caso se ejecuta un query que busca un registro en la base de datos
            //que contengan el nombre de usuario y su contraseña correctos

            if(rs.next()) //Si hay mas, revisa siguiente registro enlistado en 'rs'
            {
                //se hizo login
                //se guarda en 'name' el nombre del registro encontrado por el query
                String email = rs.getString("correo");
                //se guarda en 'contra' la contraseña del registro encontrado por el query
                String pass = rs.getString("clave");                
                return true;
            }
            else
            {
                return false;
            }
            
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(DB_con.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    //Funcion para hacer un nuevo registro en la base de datos
    public Boolean Registrar(String id_u, String name, String last, String email, String phone, String birth, String gender, String home, String pass)
    {
        try 
        {    
            //Se establece la conexion ya definida dentro de esta funcion
            Connection cn = this.Get_conexion();
            
            //Se realiza un query para insertar valores en la base de datos
            //Particularmente agregarlos a la tabla 'usr'
            String query = "INSERT INTO Usuario VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement st = cn.prepareStatement(query);
            
            //Se define lo que sera introducido en el campo del primer "?"
            st.setString(1, id_u);
            
            //Se define lo que sera introducido en el campo del segundo "?"
            st.setString(2, name);
            
            //Se define lo que sera introducido en el campo del tercer "?"
            st.setString(3, last);
            
            //Se define lo que sera introducido en el campo del cuarto "?"
            st.setString(4, email);
            
            //Se define lo que sera introducido en el campo del quinto "?"
            st.setString(5, phone);
            
            //Se define lo que sera introducido en el campo del sexto "?"
            st.setString(6, birth);
            
            //Se define lo que sera introducido en el campo del septimo "?"
            st.setString(7, gender);
            
            //Se define lo que sera introducido en el campo del octavo "?"
            st.setString(8, home);
            
            //Se define lo que sera introducido en el campo del noveno "?"
            st.setString(9, pass);
            
            //st.setInt(3, 29); //Si el tipo de dato a introducir es entero 
            
            //Se ejecuta la modificacion de la base de datos segun el query
            //el numero de filas afectadas se guarda en 'filas'
            int filas = st.executeUpdate();
            
            //if filas = st.executeUpdate();
            if(filas == 0)
            {
                //Fallo inset
                System.out.println("Algo fallo en el registro");
                return false;
            }
            else
            {
                //exito
                System.out.println("Registro completado exitosamente");
                return true;
            }

        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(DB_con.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    //*/
}
