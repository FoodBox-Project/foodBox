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
@Table(name = "phones")
@Getter
@Setter
public class PhoneNumber extends AEntity {

    @MapsId
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id")
    private User user;
    @Column(name = "phone_number")
    private String phoneNumber;
    @Column(name = "is_confirmed")
    private Boolean isConfirmed;
}
