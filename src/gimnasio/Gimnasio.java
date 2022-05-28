package gimnasio;

import Controlador.Crl_carrito;
import Controlador.Crl_cliente;
import Controlador.Crl_configuraciones;
import Controlador.Crl_nutricionista;
import Controlador.Crl_producto;
import Controlador.Crl_rutina;
import Controlador.Crl_turno;
import Controlador.Crl_usuario;
import Modelo.Carrito;
import Modelo.Cliente;
import Modelo.Configuraciones;
import Servicios.Crud_Pdf;
import Servicios.Crud_carrito;
import Servicios.Crud_cliente;
import Servicios.Crud_configuraciones;
import Servicios.Crud_dias;
import Servicios.Crud_fecha;
import Servicios.Crud_producto;
import Servicios.Crud_turno;
import Servicios.Crud_usuario;
import Modelo.Dia;
import Modelo.Fecha;
import Modelo.Pdf;
import Modelo.Producto;
import Modelo.Tabla_Pdf;
import Modelo.Turno;
import Modelo.Usuario;
import Vista.Frm_Ingreso;
import Vista.Frm_Pantalla_Principal;
import Vista.Frm_registro;
import Vista.Frm_usuario_info;
import Vista.Frm_venta;

public class Gimnasio {

    public static void main(String[] args) {
        
        Frm_usuario_info frm_usuario_info = new Frm_usuario_info();
        Frm_Ingreso frm_ingreso = new Frm_Ingreso();
        Frm_Pantalla_Principal frm_pantalla_principal = new Frm_Pantalla_Principal();
        Frm_registro frm_registro = new Frm_registro();
        Frm_venta frm_venta = new Frm_venta();
        Usuario usuario = new Usuario();
        Crud_usuario mod_usuario = new Crud_usuario();
        Cliente cliente = new Cliente();
        Crud_cliente mod_cliente = new Crud_cliente();
        Crud_dias mod_dias = new Crud_dias();
        Crud_fecha mod_fecha = new Crud_fecha();
        Fecha fecha = new Fecha();
        Crud_producto mod_producto = new Crud_producto();
        Producto producto = new Producto();
        Dia dia = new Dia();
        Configuraciones configuraciones = new Configuraciones();
        Crud_configuraciones mod_configuraciones = new Crud_configuraciones();
        Crud_Pdf crudPdf = new Crud_Pdf();
        Pdf modelo_pdf = new Pdf();
        Tabla_Pdf tabla_pdf = new Tabla_Pdf();
        Crud_turno crud_turno = new Crud_turno();
        Turno turno = new Turno();
        Carrito carrito = new Carrito();
        Crud_carrito crud_carrito= new Crud_carrito();
        
        //Frm_Pantalla_Principal frm_Pantalla_Principal, Crud_turno crud_turno, Turno turno)

        Crl_carrito crl_carrito = new Crl_carrito(frm_pantalla_principal,frm_venta,producto,mod_producto,crud_carrito,carrito);
        Crl_turno crl_turno = new  Crl_turno(frm_pantalla_principal,crud_turno,turno);
        Crl_rutina crl_rutina = new Crl_rutina(frm_pantalla_principal, crudPdf, modelo_pdf, tabla_pdf);
        Crl_configuraciones crl_configuraciones = new Crl_configuraciones(frm_pantalla_principal,frm_usuario_info,frm_registro,frm_ingreso,configuraciones,mod_configuraciones);
        Crl_nutricionista crl_nutricionista = new Crl_nutricionista(frm_pantalla_principal);
        Crl_producto crl_producto = new Crl_producto(frm_pantalla_principal, frm_venta ,producto, mod_producto);
        Crl_cliente crl_cliente = new Crl_cliente(frm_pantalla_principal, cliente, mod_cliente, mod_dias, mod_fecha, fecha, dia);
        Crl_usuario crl_usuario = new Crl_usuario(frm_ingreso, usuario, mod_usuario, frm_pantalla_principal, frm_registro, frm_usuario_info);

        crl_usuario.iniciar();

    }

}
