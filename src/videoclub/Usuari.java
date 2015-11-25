/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package videoclub;

import java.io.Serializable;
import java.util.ArrayList;
import gui.*;
import static java.awt.image.ImageObserver.WIDTH;
import javax.swing.JOptionPane;


/**
 *
 * @author Simón & Pau
 */
public class Usuari implements Serializable {

    private String nom = new String();

    private String cognoms = new String();

    private String dni = new String();

    private String direccio = new String();

    private String ciutat = new String();

    private String userName = new String();

    private String password = new String();

    private int telefon, numTargeta, codiPostal;

    ArrayList<Lloguer> lloguers;

    /*
     *   Constructor
     */
    public Usuari() {

    }

    /*
     *   Funcions
     */
    /*
     *   Aquest mètode s'encarrega de registrar un Usuari.
     *
     *   @return bolean per a comprobar que s'ha fet bé.
     */
    static public void Registrar() {
        Registrarse regis = new Registrarse();

        if (Registrarse.jTextFieldUsername.getText().trim().length() == 0 || Registrarse.jPasswordField.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "Error:\n" + "Es obligatoria insertar al menos un usuario y una contraseña.", "Error 001", WIDTH, null);
        }

        Usuari usuari = new Usuari();

        //int longitud=regis.jTextFieldNombre.getText().trim().length(), l2;
        usuari.setNom(Registrarse.jTextFieldNombre.getText());
        usuari.setCognoms(Registrarse.jTextFieldApellidos.getText());
        usuari.setDni(Registrarse.jTextFieldDni.getText());
        try { //Aquest try intenta avisar a l'usuari que tant els campsn Codi Postal com
            //el del telefon han de ser només nombres.
            usuari.setCodiPostal(Integer.parseInt(Registrarse.jTextFieldCP.getText())); //Transformen el String en int
            usuari.setTelefon(Integer.parseInt(Registrarse.jTextFieldTelefono.getText())); //Transformen el String en int
            usuari.setCiutat(regis.jTextFieldCiudad.getText());
            usuari.setDireccio(regis.jTextFieldDireccion.getText());
            usuari.setUserName(Registrarse.jTextFieldUsername.getText());
            usuari.setPassword(Registrarse.jPasswordField.getText());

            videoclub.Videoclub.usuarios.add(usuari);

            System.out.println("Usuario creado correctamente");

        } catch (java.lang.NumberFormatException e) {
            
            JOptionPane.showMessageDialog(null, "Error:\n" + "Los campos \"Código Postal\" y \"Teléfono\" solo admiten números.", "Error 001", WIDTH, null);

        }

    }

    /*
     *   Aquest mètode permet al seu Usuari editar el seu perfil.
     *
     */
    public void Editar() {
        
        int i;
        
        for(i = 0; i<Videoclub.usuarios.size(); i++){
            Usuari usuario = new Usuari();
            usuario = Videoclub.usuarios.get(i);
            // Comparem les dades del usuari per a poder trobar les seves en l'ArrayList
            if (Videoclub.user.getUserName().equals(usuario.getUserName()) && Videoclub.user.getPassword().equals(usuario.getPassword())) {
                Usuario.ModificarNombre.getText();
            }          
        }
                
        
    }
    
    /*
     *   Aquest mètode permet mostrar les dades en pantalla de l'usuari per a poder editarles.
     *
     */
    public void MostrarDadesUsuari() {
        
        int i;
        
        for(i = 0; i<Videoclub.usuarios.size(); i++){
            Usuari usuario;
            usuario = Videoclub.usuarios.get(i);
            // Comparem les dades del usuari per a poder trobar les seves en l'ArrayList
            if (Videoclub.user.getUserName().equals(usuario.getUserName()) && Videoclub.user.getPassword().equals(usuario.getPassword())) {
                Usuario.ModificarNombre.setText(usuario.getNom());
                Usuario.ModificarApellidos.setText(usuario.getCognoms());
                Usuario.ModificarCP.setText(getCodiPostal() + "");
                Usuario.ModificarDni.setText(usuario.getDni());
                Usuario.ModificarTelefono.setText(usuario.getTelefon() + "");
                Usuario.ModificarCiudad.setText(usuario.getCiutat());
                Usuario.ModificarDireccion.setText(usuario.getCiutat());
            }          
        } 
    }

    /*
     *   Getters & Setters
     */
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCognoms() {
        return cognoms;
    }

    public void setCognoms(String cognoms) {
        this.cognoms = cognoms;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getDireccio() {
        return direccio;
    }

    public String getPassword() {
        return password;
    }

    public void setDireccio(String direccio) {
        this.direccio = direccio;
    }

    public String getCiutat() {
        return ciutat;
    }

    public void setCiutat(String ciutat) {
        this.ciutat = ciutat;
    }

    public int getTelefon() {
        return telefon;
    }

    public String getUserName() {
        return userName;
    }

    public void setTelefon(int telefon) {
        this.telefon = telefon;
    }

    public int getNumTargeta() {
        return numTargeta;
    }

    public void setNumTargeta(int numTargeta) {
        this.numTargeta = numTargeta;
    }

    public int getCodiPostal() {
        return codiPostal;
    }

    public void setCodiPostal(int codiPostal) {
        this.codiPostal = codiPostal;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
