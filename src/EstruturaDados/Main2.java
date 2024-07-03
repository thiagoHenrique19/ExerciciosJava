package EstruturaDados;

import java.util.LinkedList;

public class Main2 {
    public static void main(String[] args) {
//testar a implementacao ListOperation

        ListNode node1 = new ListNode("Node1");
        ListNode node2 = new ListNode("Node2");
        ListNode node3 = new ListNode("Node3");

        ListOperation listOp = new ListOperation(node1);

        listOp.add(node1,null);//adiciona node1 no inicio
        listOp.add(node2,node1);//aidicona o node2 apos node1
        listOp.add(node3,node2);//adiciona node3 apos node2

        System.out.println("Lista encadeada: ");
        listOp.print();

        listOp.remove(node2);//remove node2
        System.out.println("Apos remover node2: ");
        listOp.print();

        //testar a implementacao com linkedlist
        LinkedList<String> linkedList = new LinkedList<>();


        linkedList.add("Node1");//adiciona o node1
        linkedList.add("Node2");//adiciona o node2
        linkedList.add("Node3");//adiciona o node3

        System.out.println("\nLinkedList: ");
        linkedList.forEach(node -> System.out.print(node + "->"));

        linkedList.remove("Node2");//remover node2
        System.out.println("Apos remover o node2:");
        linkedList.forEach(node -> System.out.print(node + "->"));

    }
}
