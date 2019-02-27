/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package is.lab.mapita.controlador;

import java.util.Date;
import javax.faces.bean.ManagedBean;
import is.lab.mapita.modelo.Usuario;
import is.lab.mapita.modelo.UsuarioDAO;
import java.util.List;
/**
 *
 * @author usuario
 */
public class EliminaUsuario {
    private String nombre;
    private String correo;
    private String contrasenia;
    private Date fechanacimiento;

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

    public Date getFechanacimiento() {
        return fechanacimiento;
    }

    public void setFechanacimiento(Date fechanacimiento) {
        this.fechanacimiento = fechanacimiento;
    }
    
    public void eliminaUsuario(Usuario u) {
        int id;
        if (u == null)
            return;
        id = u.getIdusuario();
        UsuarioDAO ud = new UsuarioDAO();
        ud.find(id);
        ud.delete(u);
        ud.update(u);
    }
}
