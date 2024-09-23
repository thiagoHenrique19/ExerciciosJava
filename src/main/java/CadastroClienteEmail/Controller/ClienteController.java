//package CadastroClienteEmail.Controller;
//
//import CadastroClienteEmail.Model.Cliente;
//import CadastroClientes.Model.ClienteRepository;
//
//import java.util.List;
//import java.util.UUID;
//
//public class ClienteController {
//
//    private ClienteRepository repository = new ClienteRepository();
//
//    public boolean createContact(String name, String email, String phone){
//        Cliente newCliente = new Cliente();
//        newCliente.setName(name);
//        newCliente.setEmail(email);
//        newCliente.setPhone(phone);
//        return repository.insert(newCliente);
//    }
//    public List<Cliente> loadAll(){
//        return repository.findAll();
//    }
//    public List<Cliente> searchClientes(String name){
//        return repository.findByName(name);
//    }
//    public boolean updateClientes(String id, String name, String email, String phone){
//        Cliente cliente = repository.findById(UUID.fromString(id));
//        if( cliente == null){
//            return false;
//        }
//        cliente.setName(name);
//        cliente.setEmail(email);
//        cliente.setPhone(phone);
//        return repository.update(cliente);
//    }
//    public boolean removeClientes(String id){
//        return repository.remove(UUID.fromString(id));
//    }
//}
