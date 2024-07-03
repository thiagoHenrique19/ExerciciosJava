package EstruturaDados;

public class ListOperation {

    private ListNode head;

    public ListOperation(ListNode head){
        this.head = null;
    }
    //adiciona o no n apos o no ant(no inicio se ant for null)
    public void add(ListNode n, ListNode ant){
        if (ant == null){
          n.prox = head;
          head = n;
        }else {
          n.prox = ant.prox;
          ant.prox = n;
        }
    }
    //remove o no n da lista
    public void remove(ListNode n){
      if (head == null)return;
      if (head == n){
    head = head.prox;
    return;
    }
    ListNode current = head;
      while (current.prox != null && current.prox != n){
          current = current.prox;
      }
    if (current.prox == n){
       current.prox = n.prox;
    }
  }
  //percorre a lista e mostra o valor do campo nome de cada no
    public void print(){
        ListNode current = head;
        while (current != null){
            System.out.print(current.nome + "->");
            current = current.prox;
        }
    }
}
