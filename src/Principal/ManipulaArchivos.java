/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import cjb.ci.Mensaje;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import javax.swing.JFrame;

/**
 *
 * @author Liliana
 */
public class ManipulaArchivos
{

    public static String guarda(Object obj, String trayectoria, JFrame jf)
    {
        try
        {
            FileOutputStream fos = new FileOutputStream(trayectoria);
            try
            {
                ObjectOutputStream arch = new ObjectOutputStream(fos);
                arch.writeObject(obj);
                arch.close();
            } catch (IOException ex)
            {
                Mensaje.error(jf,"Error... de entrada salida");
            } catch (Exception ex)
            {
                Mensaje.error(jf,"Error..." + ex.toString());
            }
        } catch (FileNotFoundException ex)
        {
            Mensaje.error(jf,"Error... No se encontro el archivo");
        } catch (Exception ex)
        {
            Mensaje.error(jf,"Error..." + ex.toString());
        }
        return "Se guardo el archivo";
    }

    public static Object carga(String trayectoria, JFrame jf)
    {
        Object obj = null;
        try
        {
            FileInputStream fos = new FileInputStream(trayectoria);
            try
            {
                ObjectInputStream arch = new ObjectInputStream(fos);
                obj = arch.readObject();
                arch.close();
            } catch (IOException ex)
            {
                Mensaje.error(jf,"Error... de entrada salida");
            } catch (Exception ex)
            {
                Mensaje.error(jf,"Error..." + ex.toString());
            }
        } catch (FileNotFoundException ex)
        {
            Mensaje.error(jf,"Error... No se encontro el archivo");
        } catch (Exception ex)
        {
            Mensaje.error(jf,"Error..." + ex.toString());
        }
        return obj;
    }

    public static void guarda(Object[] obj, String trayectoria, JFrame jf)
    {
        try
        {
            FileOutputStream fos = new FileOutputStream(trayectoria);
            try
            {
                ObjectOutputStream arch = new ObjectOutputStream(fos);
                arch.writeObject(obj);
                arch.close();
            } catch (IOException ex)
            {
                Mensaje.error(jf,"Error... de entrada salida");
            } catch (Exception ex)
            {
                Mensaje.error(jf,"Error..." + ex.toString());
            }
        } catch (FileNotFoundException ex)
        {
            Mensaje.error(jf,"Error... No se encontro el archivo");
        } catch (Exception ex)
        {
            Mensaje.error(jf,"Error..." + ex.toString());
        }
    }

    public static Object[] carga(String trayectoria, boolean b, JFrame jf)
    {
        Object obj[] = null;
        try
        {
            FileInputStream fos = new FileInputStream(trayectoria);
            try
            {
                ObjectInputStream arch = new ObjectInputStream(fos);
                obj = (Object[]) arch.readObject();
                arch.close();
            } catch (IOException ex)
            {
                Mensaje.error(jf,"Error... de entrada salida");
            } catch (Exception ex)
            {
                Mensaje.error(jf,"Error..." + ex.toString());
            }
        } catch (FileNotFoundException ex)
        {
            Mensaje.error(jf,"Error... No se encontro el archivo");
        } catch (Exception ex)
        {
            Mensaje.error(jf,"Error..." + ex.toString());
        }
        return obj;
    }

}

/*

 */

