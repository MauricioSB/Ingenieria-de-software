/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;
import java.util.Date;
import javax.faces.bean.ManagedBean;
/**
 *
 * @author usuario
 */
@ManagedBean
public class AgregaUsuario {
    private String nombre;
    private String correo;
    private String contrasenia;
    private Date fechadenacimiento;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public Date getFechadenacimiento() {
        return fechadenacimiento;
    }

    public void setFechadenacimiento(Date fechadenacimiento) {
        this.fechadenacimiento = fechadenacimiento;
    }
    
    public void agregaUsuario() {
        User1 u = new User1();
        u.setNombre(nombre);
        u.setCorreo(correo);
        u.setContrasenia(contrasenia);
        u.setFechadenacimiento(fechadenacimiento);
        User1DAO udb = new UsuarioDAO();
        udb.save(u);
    }
    
}
