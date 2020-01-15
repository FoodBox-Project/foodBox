package com.github.foodbox_project.model.user;

import com.github.foodbox_project.model.AEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * Created by earthofmarble on Nov, 2019
 */

@Entity
@Table(name = "user_creds")
@Getter
@Setter
public class UserCredentials  extends AEntity {

    @MapsId
    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id")
    private Email email;
    @Column(name = "password")
    private String password;
    @MapsId
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id")
    private User user;
}
