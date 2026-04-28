package models;

import java.util.HashMap;
import java.util.Map;

public class Venda {

    private int id;
    private Map<Integer, ItemVenda> itens;
    private Client client;
    private Pagamento pagamento;

    public Venda(int id) {
        this.id = id;
        this.itens = new HashMap<>();
    }

    public void addItem(Product p) {
        addItem(p, 1);
    }

    public void addItem(Product p, int quantity) {
        ItemVenda itemVenda = this.itens.get(p.getId());

        if (itemVenda == null) {
            this.itens.put(p.getId(), new ItemVenda(p, quantity));
        } else {
            itemVenda.increaseQuantity(quantity);
            this.itens.put(p.getId(), itemVenda);
        }
    }

    public void decItem(Product p) {
        decItem(p, 1);
    }

    public void decItem(Product p, int quantity) {
        ItemVenda itemVenda = this.itens.get(p.getId());

        if (itemVenda != null) {
            itemVenda.decreaseQuantity(quantity);
            this.itens.put(p.getId(), itemVenda);
        }
    }

    public void criarPagamento() {
        double valorTotal = this.itens.values().stream().mapToDouble(item -> item.subtotal()).sum();

        this.pagamento = new Pagamento(valorTotal, this.client.getCpf());
    }

    public void criarPagamento(String cpf) {
        double valorTotal = this.itens.values().stream().mapToDouble(item -> item.subtotal()).sum();

        this.pagamento = new Pagamento(valorTotal, cpf);
    }

}
