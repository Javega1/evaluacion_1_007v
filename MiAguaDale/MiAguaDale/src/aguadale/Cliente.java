/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aguadale;


/**
 *
 * @author luisd
 */
public class Cliente {
    
    private int numeroCliente;
    private String nombre;
    private int edad;
    private String email;
    private String telefono;
    private char sexo;
    private String direccionEntrega;
    private Pedido pedidoRealizado;
    
    

    public String infoPedidoCompleto(){
    
        String info = "\n Número de Cliente = " + numeroCliente +
                "\n Nombre Cliente = " + nombre +
                "\n Edad Cliente = " + edad +
                "\n Email Cliente = " + email +
                "\n Telefono = " + telefono + 
                "\n Sexo= " + sexo +
                "\n Direccion De Entrega = " + direccionEntrega + 
                "\n Detalle Pedido Realizado : " + 
                "\n " + pedidoRealizado.infoPedidoCompleto() +
                 "\n ########################################";
        
        return info;
    }
    
    // Constructor
    public Cliente(int numeroCliente, String nombre, int edad, String email, String telefono,
                   char sexo, String direccionEntrega, Pedido pedidoRealizado) {
        this.numeroCliente = numeroCliente;
        this.nombre = nombre;
        this.edad = edad;
        this.email = email;
        this.telefono = telefono;
        this.sexo = sexo;
        this.direccionEntrega = direccionEntrega;
        this.pedidoRealizado = pedidoRealizado;
    }
    
    //Metodos getter y setter
    public int getNumeroCliente() {
        return numeroCliente;
    }

    public void setNumeroCliente(int numeroCliente) {
        this.numeroCliente = numeroCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getDireccionEntrega() {
        return direccionEntrega;
    }

    public void setDireccionEntrega(String direccionEntrega) {
        this.direccionEntrega = direccionEntrega;
    }

    public Pedido getPedidoRealizado() {
        return pedidoRealizado;
    }

    public void setPedidoRealizado(Pedido pedidoRealizado) {
        this.pedidoRealizado = pedidoRealizado;
    }
    
    
    
}
