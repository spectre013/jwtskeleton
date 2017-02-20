package net.zoms.jwt.security.security;


import org.springframework.data.annotation.Id;
import javax.validation.constraints.NotNull;


public class Authority {

    @Id
    private Long id;

    @NotNull
    private AuthorityName name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public AuthorityName getName() {
        return name;
    }

    public void setName(AuthorityName name) {
        this.name = name;
    }

}