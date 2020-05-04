package com.github.foodbox_project.model.document;

import com.github.foodbox_project.model.AEntity;
import com.github.foodbox_project.model.user.User;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.time.LocalDateTime;

/**
 * Created by earthofmarble on Nov, 2019
 */

@Entity
@Table(name = "confirmed_documents")
@Getter
@Setter
public class ConfirmedDocument extends AEntity {

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "document_id")
    private Document document;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;
    @Column(name = "confirm_date")
    private LocalDateTime confirmationDate;

}
