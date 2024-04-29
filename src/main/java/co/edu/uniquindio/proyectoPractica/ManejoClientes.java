package co.edu.uniquindio.proyectoPractica;

import java.util.ArrayList;
import java.util.List;

public class ManejoClientes {
    List<Cliente> listaCliente = new ArrayList<>();

    public List<Cliente> getListaCliente() {
        return listaCliente;
    }

    public void setListaCliente(List<Cliente> listaCliente) {
        this.listaCliente = listaCliente;
    }

    public boolean agregaCliente(Cliente cliente) {
        Cliente clienteEncontrado = buscarCliente(cliente.getId());
        if (clienteEncontrado == null) {
            getListaCliente().add(cliente);
            return true;
        }
        return false;

    }

    private Cliente buscarCliente(String id) {
        for(Cliente cliente: getListaCliente()){
            if(cliente.getId().equalsIgnoreCase(id)){
                return cliente;
            }
        }
        return null;
    }


}
