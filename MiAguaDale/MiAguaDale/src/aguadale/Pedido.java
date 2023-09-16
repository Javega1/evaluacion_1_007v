/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aguadale;

/**
 *
 * @author luisd
 */
public class Pedido {
    
    private int codigoPedido;
    private int numeroProductos;
    private char tipoProducto;
    
    public String infoPedidoCompleto(){
    
        String info = "Pedido = " + this.codigoPedido +
                "\n Numero de productos = " + this.numeroProductos +
                "\n Tipo de producto = " + this.tipoProducto ;
        
        return info;
    }
    
    // Método para calcular el monto a pagar
    public int calcularTotalPagar(int numeroProductos, char tipoProducto) {
        int costoPorProducto;
        int total;
        int totalFinal ;
        double descuento = 0.9;
        boolean aplicaDescuento = false;

        switch (tipoProducto) {
            case 'A':
                costoPorProducto = 1500;
                if(numeroProductos >= 15){
                    aplicaDescuento = true;
                }
                break;
            case 'B':
                costoPorProducto = 2000;
                if(numeroProductos >= 10){
                    aplicaDescuento = true;
                }
                break;
            case 'C':
                costoPorProducto = 3000;
                if(numeroProductos >= 5){
                    aplicaDescuento = true;
                }
                break;
            default:
                costoPorProducto = 0;
        }
        
        total = numeroProductos * costoPorProducto;
        
        if(aplicaDescuento){
            double totalFinalDecimal = total * descuento ;
            totalFinal = (int) totalFinalDecimal;
        }else{
         totalFinal = total;
        }
        
        return totalFinal;
    }
    
    // Constructor
    public Pedido(int codigoPedido, int numeroProductos, char tipoProducto) {
        this.codigoPedido = codigoPedido;
        this.numeroProductos = numeroProductos;
        this.tipoProducto = tipoProducto;
    }
 

    public int getCodigoPedido() {
        return codigoPedido;
    }

    public void setCodigoPedido(int codigoPedido) {
        this.codigoPedido = codigoPedido;
    }

    public int getNumeroProductos() {
        return numeroProductos;
    }

    public void setNumeroProductos(int numeroProductos) {
        this.numeroProductos = numeroProductos;
    }

    public char getTipoProducto() {
        return tipoProducto;
    }

    public void setTipoProducto(char tipoProducto) {
        this.tipoProducto = tipoProducto;
    }

}
