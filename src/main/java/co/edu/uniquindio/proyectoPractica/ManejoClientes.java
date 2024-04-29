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

    public void agregaCliente(Cliente cliente){
        getListaCliente().add(cliente);
    }

}
