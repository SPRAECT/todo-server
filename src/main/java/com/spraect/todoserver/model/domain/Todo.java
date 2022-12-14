package com.spraect.todoserver.model.domain;

import lombok.*;
import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Todo {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY) //DBì ìì
    @Column
    @NonNull
    private Long id;

    @Column(name = "user_id")
    @NonNull
    private Long userId;

    @Column
    private String content;

    @Column
    @NonNull
    private Boolean completed;
}
