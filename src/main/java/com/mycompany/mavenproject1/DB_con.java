
package com.mycompany.mavenproject1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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
    public ResultSet Ex_select(String usr, String psw)
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
                return rs;
            }
            else
            {
                return null;
            }
            
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(DB_con.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    //Funcion para hacer el registro de un nuevo usuario en la base de datos
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
            
            //Se ejecuta la modificacion de la base de datos segun el query
            //el numero de filas afectadas se guarda en 'filas'
            int filas = st.executeUpdate();
            
            //Se comprueba que haya filas actualizadas en la base de datos
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
    
    //Funcion para seleccionar una tabla de la base de datos facilmente
    public ResultSet Tbl_Extract(String tbl_name)
    {
        try 
        {
            Connection c = this.Get_conexion();
            
            //Se define el query de forma que sea navegable
            Statement sta = c.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            
            //Se selecciona toda la tabla del nombre buscado
            ResultSet rs = sta.executeQuery("SELECT * FROM " + tbl_name);
            
            //Se regresan los resultados de la busqueda
            return rs;
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(DB_con.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        
    }
    
    //Funcion para obtener un elemento especifico de una tabla conectada por id
    public String Adyacent_Element(String Element, String Table, String ID_Request)
    {
        int Tbl_index = 0;    
        String S_Output = null;
        ResultSet DB_Table = this.Tbl_Extract(Table);

        //Se abre un bucle hasta que se encuentre el elemento
        while(S_Output == null)
        {
            try 
            {
                //Se elige individualmente cada regitro de la tabla
                DB_Table.absolute(Tbl_index);
                
                //Se comprueba que el registro sea del usuario correcto
                if(ID_Request == DB_Table.getString("id_usuario"))
                {
                    //Se encuentra el elemento buscado
                    S_Output = DB_Table.getString(Element);
                }
                
                //En caso de no encontrarlo se cambia al siguiente espacio para buscar en el proximo bucle
                Tbl_index = Tbl_index + 1;
            } 
            catch (SQLException ex) 
            {
                Logger.getLogger(DB_con.class.getName()).log(Level.SEVERE, null, ex);
                return null;
            }
        }
        //Se envia de regreso el elemento encontrado
        return S_Output;
    }

    public String Check_Unique(String Id_user, String email)
    {
        
        try {
            int NUM_Id = 0, NUM_Mail = 0;
            
            Connection c = this.Get_conexion();
            Statement sta = c.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            
            ResultSet Ids = sta.executeQuery("SELECT * FROM Usuario WHERE id_usuario = " + Id_user);
            ResultSet Emails = sta.executeQuery("SELECT * FROM Usuario WHERE correo = " + email);
            
            while(Ids.next())
            {
                NUM_Id++;
            }
            
            while(Emails.next())
            {
                NUM_Mail++;
            }
            
            if (NUM_Id != 0)
            {
                return "Id ya en uso";
            }
            
            if(NUM_Mail != 0)
            {
                return "Correo ya en uso";
            }
            
            if (NUM_Id == 0 && NUM_Mail == 0)
            {
                return "";
            }
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(DB_con.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
