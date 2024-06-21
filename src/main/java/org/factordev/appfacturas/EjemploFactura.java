package org.factordev.appfacturas;

import org.factordev.appfacturas.model.Cliente;
import org.factordev.appfacturas.model.Factura;
import org.factordev.appfacturas.model.ItemFactura;
import org.factordev.appfacturas.model.Producto;

import java.util.Scanner;

public class EjemploFactura {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setRut("55569");
        cliente.setNombre("Felipe");

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese descripcion de factura");
        String desc = sc.nextLine();
        Factura factura = new Factura(desc, cliente);

        Producto producto;
        String nombre;
        float precio;
        int cantidad;
        System.out.println();
        for(int i = 0; i<5; i++){
            producto = new Producto();

            System.out.print("ingrese producto n° " + producto.getCodigo() + ": ");
            nombre = sc.next();  // next sirve para recibir una sola palabra
            producto.setNombre(nombre);


            System.out.print("ingrese precio: ");
            precio = sc.nextFloat();
            producto.setPrecio(precio);

            System.out.print("ingrese cantidad ");
            cantidad = sc.nextInt();

            ItemFactura item = new ItemFactura(cantidad, producto);
            factura.addItem(item);

            System.out.println();
            sc.nextLine();
        }
        System.out.println(factura.generarDetalle());
    }
}
