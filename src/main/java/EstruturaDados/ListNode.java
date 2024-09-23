package EstruturaDados;

import org.w3c.dom.NodeList;

import java.util.LinkedList;
import java.util.List;

public class ListNode {
    String nome;
    ListNode prox;

    public ListNode(String nome) {
        this.nome = nome;
        this.prox = null;
    }
}