package CadastroClienteEmail.Model;

import java.util.Objects;
import java.util.UUID;

public class Cliente {
    private UUID id;
    private String name;
    private String email;
    private String phone;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    @Override
    public String toString(){
        return "Cliente{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(!( o instanceof Cliente cliente)) return false;
        return Objects.equals(id,cliente.id);
    }
    @Override
    public int hashCode(){
        return Objects.hash(id);
    }
}
