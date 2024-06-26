package com.project.echoproject.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@Entity
public class SiteUser {

    @Id
    @Column(nullable = false)
    private String userId;
    @Column(nullable = false)
    private String userName;
    @Column(nullable = false)
    private String password;
    @Column(nullable = false)
    private String email;
    @Column(nullable = false)
    private String phoneNum;
    @Column(nullable = false)
    private String gender;

    private String imgUrl;

    private String address;
    @Column
    @Enumerated(EnumType.STRING)
    private UserRole role = UserRole.USER;


    private LocalDateTime createDate;
    private LocalDateTime modifyDate;

    private Integer reportCnt=0;
//    @Column(nullable = false)
//    private Integer couponId;

    private boolean couponUse=false;

    @OneToMany(mappedBy = "siteUser", cascade = CascadeType.REMOVE)
    private List<LikeBoard> likeBoards;

    @PrePersist
    protected void onCreate() {
        this.createDate = LocalDateTime.now();
    }

    @PreUpdate
    protected void onUpdate() {
        this.modifyDate = LocalDateTime.now();
    }

    private Long currentPoint=0L;

}

