package com.devlifeblog.demo.model;


import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Blog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(unique = true)
    private String blogName;

    @OneToOne
    @JoinColumn(name = "user_id")
    private BlogUser blogUser;

    @OneToMany(mappedBy = "blog", cascade = CascadeType.ALL)
    private List<Article> articles;

}
