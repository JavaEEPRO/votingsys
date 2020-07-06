package si.inspired.votingsys.persistence.model.abstractModel;

import si.inspired.votingsys.persistence.model.Role;
import si.inspired.votingsys.persistence.model.Vote;

import javax.persistence.*;
import java.util.Collection;

@MappedSuperclass
public class AbstractUserEntity extends AbstractNamedEntity{

    @Column(name = "email")
    private String email;

    @Column(name = "phoneNumber")
    private String phoneNumber;

    @Column(name = "password", length = 60)
    private String password;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "vs_users_votes", joinColumns = @JoinColumn(name = "user_id", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "vote_id", referencedColumnName = "id"))
    public Collection<Vote> votes;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "vs_users_roles", joinColumns = @JoinColumn(name = "user_id", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "role_id", referencedColumnName = "id"))
    private Collection<Role> roles;

    public String getEmail() {
        return email;
    }

    public void setEmail(final String email) {
        this.email = email;
    }

    public String getPhoneNumber() { return phoneNumber; }

    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }

    public String getPassword() {
        return password;
    }

    public void setPassword(final String password) {
        this.password = password;
    }

    public Collection<Vote> getVotes() {
        return votes;
    }

    public void setVotes(Collection<Vote> votes) {
        this.votes = votes;
    }

    public Collection<Role> getRoles() {
        return roles;
    }

    public void setRoles(final Collection<Role> roles) {
        this.roles = roles;
    }
}
