/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import javax.swing.JComboBox;

/**
 *
 * @author LIPM
 */
public class Multilistas
{

    private NodoListas r = null;

    public NodoListas getR()
    {
        return r;
    }

    public void setR(NodoListas r)
    {
        this.r = r;
    }

    public NodoListas inserta(NodoListas rn, NodoListas n, String s[], int nivel)
    {
        if (nivel == s.length - 1)
        {
            ListasCDLB list = new ListasCDLB();
            list.setR(rn);
            list.inserta(n);
            return list.getR();
        } else
        {
            ListasCDLB list = new ListasCDLB();
            list.setR(rn);
            NodoListas aux = list.busca(s[nivel]);
            if (aux != null)
            {
                aux.setAbj(inserta(aux, n, s, nivel + 1));
            }
            return r;
        }
    }

    public void elimina(NodoListas r, String s[], int nivel, NodoListas arr[])
    {

        if (nivel == s.length - 1)
        {
            ListasCDLB list = new ListasCDLB();
            list.setR(r);
            arr[0] = list.getR();
            arr[1] = list.elimina(s[nivel]);
        } else
        {
            ListasCDLB list = new ListasCDLB();
            list.setR(r);
            NodoListas aux = list.busca(s[nivel]);
            if (aux != null && aux.getAbj() != null)
            {
                elimina(aux.getAbj(), s, nivel + 1, arr);
                aux.setAbj(arr[0]);
            } else
            {
                System.out.println("No se encontró el dato");
            }
            arr[0] = r;
        }
    }

    public Object[] comboF(NodoListas rn)
    {
        Object aux[] = null;
        ListasCDLB list = new ListasCDLB();
        list.setR(rn);
        aux = list.toArrayF();
        return aux;
    }
    
    public Object[] comboC(NodoListas rn, String f)
    {
        Object aux[] = null;
        ListasCDLB list = new ListasCDLB();
        list.setR(rn);
        aux = list.toArrayC(f);
        return aux;
    }
}
