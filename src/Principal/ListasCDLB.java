/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JFrame;

/**
 *
 * @author LIPM
 */
public class ListasCDLB
{

    //public static final long SerialVersionUID =; 
    private NodoListas r = null;

    /**
     * @return the r
     */
    public NodoListas getR()
    {
        return r;
    }

    /**
     * @param r the r to set
     */
    public void setR(NodoListas r)
    {
        this.r = r;
    }

    public boolean inserta(NodoListas n)
    {
        if (n == null)
        {
            JFrame JFrame = null;
            System.out.println("No se puede insertar");
            return false;
        } else
        {
            if (r == null) //Cuando es el primer elemento
            {
                r = n;
                r.setSig(n);
                r.setAnt(n);
            } else
            {
                if (r.getSig().getEt().compareTo(n.getEt()) > 0 || r.getEt().compareTo(n.getEt()) < 0) //Cuando es el primero o es el ultimo
                {
                    n.setSig(r.getSig());
                    r.setSig(n);
                    n.setAnt(r);
                    n.getSig().setAnt(n);
                    if (r.getEt().compareTo(n.getEt()) < 0)
                    {
                        r = n;
                    }
                } else
                {
                    boolean b = true;
                    NodoListas aux = r.getSig();
                    do
                    {
                        if (aux.getEt().compareTo(n.getEt()) < 0 && aux.getSig().getEt().compareTo(n.getEt()) > 0)//Cuando va en medio
                        {
                            n.setSig(aux.getSig());
                            aux.setSig(n);
                            n.setAnt(aux);
                            n.getSig().setAnt(n);
                            b = false;
                        } else
                        {
                            aux = aux.getSig();
                        }
                    } while (aux != r && b);
                }
            }
        }
        return true;
    }

    public NodoListas elimina(String s)
    {
        JFrame jf = null;
        if (r == null)
        {
            System.out.println("Lista vacía");
            return null;
        } else
        {
            NodoListas n = null;
            if (r.getSig().getEt().compareTo(s) > 0 || r.getEt().compareTo(s) < 0)
            {
                System.out.println("No se encuentra en la lista");
            } else
            {
                if (r.getSig().getEt().equals(s))
                {
                    n = r.getSig();
                    r.setSig(n.getSig());
                    n.getSig().setAnt(n.getAnt());
                    n.setAnt(null);
                    n.setSig(null);
                    if (n == r)
                    {
                        r = null;
                    }
                } else
                {
                    boolean b = true;
                    NodoListas aux = r.getSig();
                    while (aux != r && b)
                    {
                        if (aux.getSig().getEt().equals(s))
                        {
                            n = aux.getSig();
                            aux.setSig(n.getSig());
                            n.getSig().setAnt(n.getAnt());
                            n.setSig(null);
                            n.setAnt(null);
                            b = false;
                            if (n == r)
                            {
                                r = aux;
                            }
                        } else
                        {
                            if (aux.getSig().getEt().compareTo(s) > 0)
                            {
                                break;
                            } else
                            {
                                aux = aux.getSig();
                            }
                        }
                    }
                    if (b)
                    {
                        System.out.println("No se encuentra el dato");
                    }
                }
            }
            return n;
        }
    }

    public String desp()
    {
        String s = "";
        if (r != null)
        {
            NodoListas aux = r.getSig();
            do
            {
                s += aux.getEt() + " Anterior " + aux.getAnt().getEt() + "\n";
                aux = aux.getSig();
            } while (aux != r.getSig());

        }
        return s;
    }

    public NodoListas busca(String s)
    {
        if (r.getAnt().getEt().compareTo(s) < 0 || r.getEt().compareTo(s) > 0)
        {
            return null;
        }
        if (r != null)
        {
            NodoListas aux = r.getSig();
            do
            {
                if (aux.getEt().equals(s))
                {
                    return aux;
                }
                if (aux.getEt().compareTo(s) > 0)
                {
                    return null;
                }
                aux = aux.getSig();
            } while (aux != r.getSig());
        }
        return null;
    }

    public String despI()
    {
        String s = "";
        if (r != null)
        {
            NodoListas aux = r;
            do
            {
                s += aux.getEt() + "\n";
                aux = aux.getAnt();
            } while (aux != r);
        }
        return s;
    }

    public JComboBox combo()
    {
        JComboBox jc = null;
        if (r != null)
        {
            NodoListas aux = r;
            do
            {
                jc.addItem(aux.getEt());
                aux = aux.getSig();
            } while (aux != r);
        }
        return jc;
    }

    public NodoListas muestra(String s)
    {
        if (r != null)
        {
            NodoListas aux = r.getSig();
            do
            {
                if (aux.getEt().equals(s))
                {
                    return aux;
                } else
                {
                    aux = aux.getSig();
                }
            } while (aux != r.getSig());
        }
        return null;
    }

    public Object[] toArrayF()
    {
        ArrayList arr = new ArrayList();
        if (r != null)
        {
            NodoListas aux = r.getSig();
            do
            {
                arr.add(aux.getEt());
                aux = aux.getSig();
            } while (aux != r.getSig());
        }
        return arr.toArray();
    }

    public Object[] toArrayC(String f)
    {
        ArrayList arr = new ArrayList();
        if (r != null)
        {
            NodoListas aux = r.getSig();
            do
            {
                if (f.equals(aux.getEt()) && aux.getAbj() != null)
                {
                    NodoListas cd = aux.getAbj();
                    do
                    {
                        arr.add(cd);
                        cd = cd.getSig();
                    } while (cd != aux.getAbj());
                } else
                {
                    aux = aux.getSig();
                }
            } while (aux != r.getSig());
        }
        return arr.toArray();
    }
}
