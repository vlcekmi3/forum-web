package cz.cvut.forum.dto;

import javax.xml.bind.annotation.XmlTransient;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class UserDTO extends AbstractDTO {
    private String username;
    private String email;
    private String password;
    @XmlTransient
    private List<Long> messages;
    @XmlTransient
    private List<Long> posts;
    @XmlTransient
    private List<Long> topics;
    @XmlTransient
    private List<Long> roles;

    public UserDTO() {
    }

    public UserDTO(Long id, String userName, String email, List<Long> messages, List<Long> posts, List<Long> topics, List<Long> roles, Date created, Date updated) {
        this.id = id;
        this.email = email;
        this.username = userName;
        this.messages = messages;
        this.posts = posts;
        this.topics = topics;
        this.roles = roles;
//        this.created = created;
//        this.updated = updated;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String userName) {
        this.username = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Long> getMessages() {
        return messages;
    }

    public void setMessages(List<Long> messages) {
        this.messages = messages;
    }

    public List<Long> getPosts() {
        return posts;
    }

    public void setPosts(List<Long> posts) {
        this.posts = posts;
    }

    public List<Long> getTopics() {
        return topics;
    }

    public void setTopics(List<Long> topics) {
        this.topics = topics;
    }

    public List<Long> getRoles() {
        return roles;
    }

    public void setRoles(List<Long> roles) {
        this.roles = roles;
    }

    @XmlTransient
    public int getPostsCount() {
        return this.posts.size();
    }

}