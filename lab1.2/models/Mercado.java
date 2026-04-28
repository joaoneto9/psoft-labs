package models;

import java.util.HashMap;
import java.util.Map;

public class Mercado {

    private Map<String, Client> clients;
    private Map<String, Venda> vendas;
    private Estoque estoque;

    public Mercado() {
        this.clients = new HashMap<>();
        this.vendas = new HashMap<>();
    }


    
}
