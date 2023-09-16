/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aguadale;

/**
 *
 * @author profesorLuisDíaz
 */
public class AguaDale {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Crear un pedido para un cliente
        Pedido pedidoCliente1 = new Pedido(1, 10, 'B');
        // Crear un cliente y asociarle el pedido
        Cliente cliente1 = new Cliente(123, "Juan Perez", -1, "juan@example.com", "1234567890", 'M', "Calle A, Ciudad", pedidoCliente1);
        //Llamar a metodo que imprima la información completa del pedido
        String infoPedidoCompleto = cliente1.infoPedidoCompleto();
        System.out.println("######################################## \n " + "Info Pedido Completo: "+ infoPedidoCompleto );
        //Llamar a metodo que calcule el monto a pagar recibiendo como dato la cantidad de productos y el tipo de producto.
        int totalPedido1 = pedidoCliente1.calcularTotalPagar(pedidoCliente1.getNumeroProductos(), pedidoCliente1.getTipoProducto());
        System.out.println(" El total del pedido es: $ "+ totalPedido1 + "\n ########################################");
        
        
        // Crear un pedido para un cliente
        Pedido pedidoCliente2 = new Pedido(2, 5, 'C');
        // Crear un cliente y asociarle el pedido
        Cliente cliente2 = new Cliente(1234, "Maria Perez", 50, "maria@example.com", "12345858580", 'F', "Calle B", pedidoCliente2);
        //Llamar a metodo que imprima la información completa del pedido
        String infoPedidoCompleto2 = cliente2.infoPedidoCompleto();
        System.out.println("######################################## \n " + "Info Pedido Completo: "+ infoPedidoCompleto2 );
        //Llamar a metodo que calcule el monto a pagar recibiendo como dato la cantidad de productos y el tipo de producto.
        int totalPedido2 = pedidoCliente2.calcularTotalPagar(pedidoCliente2.getNumeroProductos(), pedidoCliente2.getTipoProducto());
        System.out.println(" El total del pedido es: $ "+ totalPedido2 + "\n ########################################");
        
        
        
        // Crear un pedido para un cliente
        Pedido pedidoCliente3 = new Pedido(3, 1, 'A');
        // Crear un cliente y asociarle el pedido
        Cliente cliente3 = new Cliente(12345, "Romina Perez", 60, "rom@example.com", "16665858580", 'F', "Calle C", pedidoCliente3);
        //Llamar a metodo que imprima la información completa del pedido
        String infoPedidoCompleto3 = cliente3.infoPedidoCompleto();
        System.out.println("######################################## \n " + "Info Pedido Completo: "+ infoPedidoCompleto3 );
        //Llamar a metodo que calcule el monto a pagar recibiendo como dato la cantidad de productos y el tipo de producto.
        int totalPedido3 = pedidoCliente3.calcularTotalPagar(pedidoCliente3.getNumeroProductos(), pedidoCliente3.getTipoProducto());
        System.out.println(" El total del pedido es: $ "+ totalPedido3 + "\n ########################################");
        
    }
    
}
