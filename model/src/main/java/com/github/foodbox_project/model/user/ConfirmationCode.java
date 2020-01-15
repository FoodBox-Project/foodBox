package com.github.foodbox_project.model.user;

import com.github.foodbox_project.model.AEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Created by earthofmarble on Nov, 2019
 */

@Entity
@Table(name = "confirmation_codes")
@Getter
@Setter
public class ConfirmationCode extends AEntity {

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "owner_id")
    private User owner;
    @Column(name = "code")
    private String code;
    @Column(name = "code_purpose")
    private String codePurpose;
    @Column(name = "sent_to")
    @Enumerated(EnumType.STRING)
    private SentOption sentTo;
}
