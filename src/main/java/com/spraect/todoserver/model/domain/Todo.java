package com.spraect.todoserver.model.domain;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Todo {

    @Id
    @Column
    @NonNull
    private Long id;

    @Column(name = "user_id")
    @NonNull
    private Long userId;

    @Column
    private Character content;

    @Column
    @NonNull
    private Boolean completed;
}
