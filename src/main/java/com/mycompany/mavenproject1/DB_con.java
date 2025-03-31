
package com.mycompany.mavenproject1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
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
        this.Conectar();
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
        }
        
        return null;
    }
    
    //Funcion para hacer el registro de un nuevo usuario en la base de datos
    public Boolean Registrar_Usr(String id_u, String name, String last, String email, String phone, String birth, String gender, String home, String pass)
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
    public String Adyacent_Element(String Element, String Table, String Id_Request, String Id_type)
    {
        int Tbl_index = 0;    
        String S_Output = null;
        ResultSet DB_Table = this.Tbl_Extract(Table);
        
        try 
        {
            //Se abre un bucle hasta que se encuentre el elemento
            while(S_Output == null)
            {
            
                //Se elige individualmente cada regitro de la tabla
                DB_Table.absolute(Tbl_index);
                
                //Se comprueba que el registro sea del usuario correcto
                if(Id_Request == DB_Table.getString(Id_type))
                {
                    //Se encuentra el elemento buscado
                    S_Output = DB_Table.getString(Element);
                }
                
                //En caso de no encontrarlo se cambia al siguiente espacio para buscar en el proximo bucle
                Tbl_index = Tbl_index + 1;
            
            }
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(DB_con.class.getName()).log(Level.SEVERE, null, ex);
            return S_Output;
        }
        
        //Se envia de regreso el elemento encontrado
        return S_Output;
    }

    public String Check_Unique_User(String Id_user, String email)
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
    
    public int Check_Number(ResultSet rs)
    {
        int count = 0;
        
        try 
        {
            
            while(rs.next())
            {
                count++;
            }
            
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(DB_con.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return count;
    }
    
    public Boolean Publicar(String Id_user, String content)
    {
        try {
            //Se establece la conexion ya definida dentro de esta funcion
            Connection cn = this.Get_conexion();
            int created = Check_Number(this.Tbl_Extract("Tweet"));
            Date mark = new Date();
            SimpleDateFormat formatee = new SimpleDateFormat("yyMMdd");
            String Id_tweet = formatee.format(mark) + created;
            
            //Se realiza un query para insertar valores en la base de datos
            //Particularmente agregarlos a la tabla 'usr'
            String query = "INSERT INTO Tweet VALUES(?, ?, ?)";
            PreparedStatement st = cn.prepareStatement(query);
            
            st.setString(1, Id_tweet);
            st.setString(2, Id_user);
            st.setString(3, content);
            
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
        }
        
        return false;
        
    }
    
    public Boolean Repostear(String Id_user, String type, String Id_tweet, String content)
    {
        try 
        {
            //Se establece la conexion ya definida dentro de esta funcion
            Connection cn = this.Get_conexion();
            int number = Check_Number(this.Tbl_Extract(type));
            Date mark = new Date();
            SimpleDateFormat formatee = new SimpleDateFormat("yyMMdd");
            String Id_re = formatee.format(mark) + number;
            
            //Se realiza un query para insertar valores en la base de datos
            //Particularmente agregarlos a la tabla 'usr'
            String query = "INSERT INTO ? VALUES(?, ?, ?)";
            PreparedStatement st = cn.prepareStatement(query);
            
            st.setString(1, type);
            st.setString(2, Id_re);
            st.setString(3, Id_user);
            st.setString(4, Id_tweet);
            
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
                this.Publicar(Id_user, content);
                return true;
            }
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(DB_con.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
    }
    
    public Boolean NewLike(String Id_user, String Id_tweet)
    {
        
        try 
        {
            //Se establece la conexion ya definida dentro de esta funcion
            Connection cn = this.Get_conexion();
            int number = Check_Number(this.Tbl_Extract("MeGusta"));
            Date mark = new Date();
            SimpleDateFormat formatee = new SimpleDateFormat("yyMMdd");
            String Id_re = formatee.format(mark) + number;
            
            //Se realiza un query para insertar valores en la base de datos
            //Particularmente agregarlos a la tabla 'usr'
            String query = "INSERT INTO MeGusta VALUES(?, ?, ?)";
            PreparedStatement st = cn.prepareStatement(query);
            
            st.setString(1, Id_re);
            st.setString(2, Id_user);
            st.setString(3, Id_tweet);
            
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
    
    public int Numero_en_tweet(String Id_tweet, String Table)
    {
        try
        {
            Connection c = this.Get_conexion();
            //String tweet = this.Adyacent_Element( "id_tweet", "Tweet", TXT_Content.getText(), "contenido");
            Statement sta = c.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet answer = sta.executeQuery("SELECT * FROM" + Table + "WHERE id_tweet = " + Id_tweet);
            return this.Check_Number(answer);
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(DB_con.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }
}
