
package com.mycompany.mavenproject1;

import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
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
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 *
 * @author Vicente193373
 */        
public class DB_con 
{
    //*
    ///Estos strings tienen la funcion de contener los detalles de la conexio a la base de datos
    ///Lo ideal es usar el SQL del equipo para que este cree la base de datos segun la estructura requerida
    ///En caso de que la base de datos que se utilize tenga un nombre distinto este debe introducirse en DB_name:
    public String DB_name = "DB_Twitter";
    public String dbpass = "";      
    
    //Los String estan configurados para el estado predeterminado de nuevas bases de Datos
    public String connectionstring = "jdbc:mysql://localhost:3306/" + DB_name + "?serverTimezone=America/Mexico_City&zeroDateTimeBehavior=CONVERT_TO_NULL";
    public String dbhost = "root";  
    
    //Define una conexion dentro de este recurso aun por configurar
    Connection conn = null;
    
    //*/ Esta funcion se encargara de configurar la conexion con la base de datos y comprobar que conecte
    public void Conectar()
    {
        Connection conn = null;
        try 
        {
            this.conn = DriverManager.getConnection(connectionstring, dbhost, dbpass);
            System.out.print("\n   Conexion exitosa\n\n"); //Print
        } 
        catch (SQLException ex) 
        {
            System.out.print("\n   Error de conexion\n\n"); //Print
            Logger.getLogger(DB_con.class.getName()). log(Level.SEVERE, null, ex);
        }
    }//*/
    
    //*/ Función para referenciar la conexion definida fuera de este recurso
    public Connection Get_conexion()
    {
        this.Conectar();
        return this.conn;
    }//*/
    
    //*/ Esta funcion busca encontrar un registro con nombre y contraseña validos
    public ResultSet Ex_select(String usr, String psw)
    {
        try 
        {
            //Se establece la conexion ya definida en esta funcion
            Connection c = this.Get_conexion();
            
            if (c == null) 
            {
                System.out.println("\n   Error Ex_select: La conexión no se estableció.\n\n");
                return null; // Salir de la función si no hay conexión
            }
            else
            {
                System.out.println("\n   La conexión en Ex_select() se estableció exitosamente.\n\n");
            }
            
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
                System.out.println("\n   Usuario encontrado existosamente.\n\n");
                return rs;
            }
            else
            {
                System.out.println("\n   Error Ex_select: No se obtuvo resultado al buscar el usuario.\n\n");
                return null;
            }
            
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(DB_con.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("\n   Error Ex_select: SQLException\n\n");
        }
        
        return null;
    }//*/
    
    //*/ Funcion para hacer el registro de un nuevo usuario en la base de datos
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
                System.out.println("\n   Algo fallo en el registro de usuario\n\n");
                return false;
            }
            else
            {
                //exito
                System.out.println("\n   Registro de usuario completado exitosamente\n\n");
                return true;
            }

        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(DB_con.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }//*/
    
    //*/ Funcion para seleccionar una tabla de la base de datos facilmente
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
        
    }//*/
    
    //*/ Funcion para obtener un String especifico de una tabla conectada por id
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

    //*/ Esta funcion comprueba que no exista ya un usuario con un id & email especificos
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
    }//*/
    
    //*/ Con esta funcion se comprueba el numero de registros que un query obtiene
    public int Check_Number(ResultSet rs)
    {
        int count = 0; //La cuenta empieza con cero
        
        try 
        {
            
            while(rs.next())//este proceso se repite hasta haber comprobado todos los registros
            {
                count++; //Por cada elemento presente se aumenta en 1 la cuenta
            }
            
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(DB_con.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return count;
    }//*/
    
    //*/ Funcion que se encarga de registrar una nueva publicacion
    public Boolean Publicar(String Id_user, String content)
    {
        try {
            //Se establece la conexion ya definida dentro de esta funcion
            Connection cn = this.Get_conexion();
            
            //Se crea un nuevo Id unico
            int created = Check_Number(this.Tbl_Extract("Tweet"));
            Date mark = new Date();
            SimpleDateFormat formatee = new SimpleDateFormat("yyMMdd");
            String Id_tweet = formatee.format(mark) + created;
            
            //Se realiza un query para insertar valores en la base de datos
            String query = "INSERT INTO Tweet VALUES(?, ?, ?)";
            PreparedStatement st = cn.prepareStatement(query);
            
            st.setString(1, Id_tweet);  //Id unico de la publicacion
            st.setString(2, Id_user);   //Usuario que hizo la publicacion
            st.setString(3, content);   //Contenido de la publicacion
            
            //Ejecuta el insert y guarda cuantas filas fueron afectadas
            int filas = st.executeUpdate();
            
            //Se comprueba que haya filas actualizadas en la base de datos
            if(filas == 0)
            {
                //Fallo insert
                System.out.println("\n   Algo fallo en la publicacion\n\n");
                return false;
            }
            else
            {
                //exito
                System.out.println("\n   Publicacion completada exitosamente\n\n");
                return true;
            }
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(DB_con.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return false;
        
    }//*/
    
    //*/ Esta funcion se encarga de registrar un nuevo reposteo, refiriendose a retweets y respuestas/comentarios
    public Boolean Repostear(String Id_user, String type, String Id_tweet, String content)
    {
        try 
        {
            //Se establece la conexion ya definida dentro de esta funcion
            Connection cn = this.Get_conexion();
            
            //Se crea un nuevo Id unico
            int number = Check_Number(this.Tbl_Extract(type));
            Date mark = new Date();
            SimpleDateFormat formatee = new SimpleDateFormat("yyMMdd");
            String Id_re = formatee.format(mark) + number;
            
            //Se realiza un query para insertar valores en la base de datos
            String query = "INSERT INTO ? VALUES(?, ?, ?)";
            PreparedStatement st = cn.prepareStatement(query);
            
            st.setString(1, type);      //Tabla en que sera registrado el reposteo
            st.setString(2, Id_re);     //Id unico del reposteo
            st.setString(3, Id_user);   //Id del usario que reposteo
            st.setString(4, Id_tweet);  //Id del tweet que fue reposteado
            
            //Se guarda cuantas filas se actualizaron con el insert
            int filas = st.executeUpdate();
            
            //Se comprueba que haya filas actualizadas en la base de datos
            if(filas == 0)
            {
                //Fallo insert
                System.out.println("\n   Algo fallo en el reposteo\n\n");
                return false;
            }
            else
            {
                //exito
                System.out.println("\n   Reposteo completado exitosamente\n\n");
                this.Publicar(Id_user, content);
                return true;
            }
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(DB_con.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
    }//*/
    
    //*/ Funcion que registra un nuevo me gusta en un tweet
    public Boolean NewLike(String Id_user, String Id_tweet)
    {
        try 
        {
            //Se establece la conexion ya definida dentro de esta funcion
            Connection cn = this.Get_conexion();
            
            //Se crea un Id unico
            int number = Check_Number(this.Tbl_Extract("MeGusta"));
            Date mark = new Date();
            SimpleDateFormat formatee = new SimpleDateFormat("yyMMdd");
            String Id_re = formatee.format(mark) + number;
            
            //Se realiza un query para insertar valores en la base de datos
            String query = "INSERT INTO MeGusta VALUES(?, ?, ?)";
            PreparedStatement st = cn.prepareStatement(query);
            
            st.setString(1, Id_re);     //Id unico del me gusta
            st.setString(2, Id_user);   //Id del usuario que dio me gusta
            st.setString(3, Id_tweet);  //Id del tweet al que se le dio me gusta
            
            int filas = st.executeUpdate();
            
            //Se comprueba que haya filas actualizadas en la base de datos
            if(filas == 0)
            {
                //Fallo insert
                System.out.println("\n   Algo fallo en el registro del megusta\n\n");
                return false;
            }
            else
            {
                //exito
                System.out.println("\n   Megusta registrado completado exitosamente\n\n");
                return true;
            }
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(DB_con.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }//*/
    
    //*/ Esta funcion comprueba los contadores especificos de un tweet, como sus megusta o retweets
    public int Numero_en_tweet(String Id_tweet, String Table)
    {
        try
        {
            Connection c = this.Get_conexion();
            Statement sta = c.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet answer = sta.executeQuery("SELECT * FROM " + Table + " WHERE id_tweet = " + Id_tweet);
            return this.Check_Number(answer);
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(DB_con.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }//*/
    
    //*/ Esta funcion crea un nuevo perfil con valores predeterminados
    public Boolean New_Profile(String Id_user)
    {
        try 
        {
            Connection c = this.Get_conexion();
            FileInputStream foto_perfil = null;
            
            String query = "INSERT INTO Perfil VALUES(?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement sta;
            sta = c.prepareStatement(query);
            
            int number = Check_Number(this.Tbl_Extract("Perfil"));
            Date mark = new Date();
            SimpleDateFormat formatee = new SimpleDateFormat("yyMMdd");
            String Id_perfil = formatee.format(mark) + number;
            
            File archivoImagen = new File("/src/main/java/images/newer.png");
            try 
            {
                foto_perfil = new FileInputStream(archivoImagen);
            } 
            catch (FileNotFoundException ex) 
            {
                Logger.getLogger(DB_con.class.getName()).log(Level.SEVERE, null, ex);
                return false;
            }
            
            String biografia = "Por editar";
            
            sta.setString(1, Id_perfil);
            sta.setString(2, Id_user);
            sta.setBinaryStream(3, foto_perfil, (int) archivoImagen.length());
            sta.setString(4, biografia);
            sta.setInt(5, 0);
            sta.setInt(6, 0);
            sta.setString(6, this.Adyacent_Element("pais", "Usuario", Id_user, "id_usuario"));
            
            int filas = sta.executeUpdate();
            
            //Se comprueba que haya filas actualizadas en la base de datos
            if(filas == 0)
            {
                //Fallo inset
                System.out.println("\n   Algo fallo en el registro del perfil\n\n");
                return false;
            }
            else
            {
                //exito
                System.out.println("\n   Registro del perfil completado exitosamente\n");
                return true;
            }
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(DB_con.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }//*/
    
    //*/ Esta funcion se encarga de modificar un campo compatible con String de la base de datos facilmente
    public Boolean Update_String(String Id_type, String Id_object, String Table, String E_type, String Element)
    {
        try 
        {
            PreparedStatement sta;
            Connection c = this.Get_conexion();
            
            String query = "UPDATE ? SET ? = ? WHERE ? = ?";
            sta = c.prepareStatement(query);
            
            sta.setString(1, Table);     //Nombre de la tabla donde esta el campo a actualizar
            sta.setString(2, E_type);    //Nombre del campo cuyo valor sera actualizado
            sta.setString(3, Element);   //Nuevo string que sera insertado en el campo
            sta.setString(4, Id_type);   //Tipo de id principal de la tabla
            sta.setString(5, Id_object); //Id del registro especifico a actualizar
            
            //Se guarda cuantas filas se actualizaron con el update
            int filas = sta.executeUpdate();
            
            //Se comprueba que haya filas actualizadas en la base de datos
            if(filas == 0)
            {
                //Fallo update
                System.out.println("\n   Algo fallo en actualizar el string\n\n");
                return false;
            }
            else
            {
                //exito
                System.out.println("\n   String actualizado exitosamente\n\n");
                return true;
            }
            
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(DB_con.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return false;
    }//*/
    
    //Sirve para extraer una foto de perfil como icono
    public ImageIcon Prfl_Photo(String Id_user, int height, int width)
    {
        try 
        {
            //Consulta SQL para obtener la foto de perfil
            String query = "SELECT foto_perfil FROM Perfil WHERE id_usuario = ?";
            PreparedStatement sta = conn.prepareStatement(query);
            
            sta.setString(1, Id_user);  //Usa el Id del usuario para encontrar el perfil
            
            //Se ejecuta el query
            ResultSet rs = sta.executeQuery();

            //Se comprueba que haya dado resultado
            if (rs.next()) 
            {
                // Obtener el flujo de bytes de la imagen (BLOB)
                InputStream is = rs.getBinaryStream("foto_perfil");

                // Convertir el InputStream en una imagen
                Image image;
                image = ImageIO.read(is);

                // Ajustar el tamaño de la imagen si es necesario (por ejemplo, 100x100)
                ImageIcon icon = new ImageIcon(image.getScaledInstance(width, height, Image.SCALE_DEFAULT));

                // Retornar el icono de la imagen
                return icon;
            }
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(DB_con.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (IOException ex) 
        {
            Logger.getLogger(DB_con.class.getName()).log(Level.SEVERE, null, ex);        
        }
        
        return null;
    }
    
    //*/ Esta funcion es para cambiar una imagen que se haya guardado en la base de datos
    public Boolean Update_Photo(String Id_user, String Image_Path)
    {
        try 
        {
            PreparedStatement sta;
            Connection c = this.Get_conexion();
            File Image = new File(Image_Path);
            FileInputStream fis = new FileInputStream(Image);
            
            String query = "UPDATE Perfil SET foto_perfil = ? WHERE id_usuario = ?";
            sta = c.prepareStatement(query);
            
            sta.setBinaryStream(1, fis, (int) Image.length());   
            sta.setString(2, Id_user); //Id del registro especifico a actualizar
            
            //Se guarda cuantas filas se actualizaron con el update
            int filas = sta.executeUpdate();
            
            //Se comprueba que haya filas actualizadas en la base de datos
            if(filas == 0)
            {
                //Fallo update
                System.out.println("\n   Algo fallo en actualizar la foto\n\n");
                return false;
            }
            else
            {
                //exito
                System.out.println("\n   Foto actualizada exitosamente\n\n");
                return true;
            }
            
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(DB_con.class.getName()).log(Level.SEVERE, null, ex);
        } 
        catch (FileNotFoundException ex) 
        {
            Logger.getLogger(DB_con.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return false;
    }//*/
}
