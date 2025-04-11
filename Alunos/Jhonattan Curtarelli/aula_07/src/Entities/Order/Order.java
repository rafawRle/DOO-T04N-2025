package src.Entities.Order;


import src.Entities.Person.Customer;
import src.Entities.Person.Seller;
import src.Entities.Store;
import src.Enums.OrderStatus;
import src.Interfaces.IPresentate;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;

public class Order implements IPresentate
{
    public String id;
    public LocalDate createdAt;
    public LocalDate reservationExpiredAt;
    public Customer customer;
    public Seller seller;
    public Store store;
    public OrderStatus status;
    public ArrayList<Item> items = new ArrayList<Item>();

    public Order (LocalDate createdAt, LocalDate reservationExpiredAt, Customer customer, Seller seller, Store store)
    {
        this.createdAt = createdAt;
        this.reservationExpiredAt = reservationExpiredAt;
        this.customer = customer;
        this.seller = seller;
        this.store = store;
    }


    // método que calcula o total do pedido percorrendo todos os itens e pegando o valor
    public BigDecimal calculateTotal()
    {
        BigDecimal total = BigDecimal.ZERO;
        for (Item item : items)
        {
            total = total.add(item.value);
        }
        return total;
    }

    @Override
    public String presentate() {
        return "ID: " + this.id + " Data de Criação: " + this.createdAt + " Data de Validade: " + this.reservationExpiredAt
                + " Cliente: " + this.customer.presentate() + " Vendedor: " + this.seller.presentate() + " Loja: " + this.store.presentate()
                + " Itens: " + this.items.toString();

    }
}
