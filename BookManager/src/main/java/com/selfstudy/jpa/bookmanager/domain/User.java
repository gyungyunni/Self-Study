package com.selfstudy.jpa.bookmanager.domain;

import lombok.*;
import org.springframework.lang.NonNull;

import javax.persistence.*;
import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@Builder
@Data
@Entity //pk 설정해줘야함
@EntityListeners(value = MyEntityListener.class)
public class User implements Auditable{
    @Id //pk설정
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Auto Increment 자동으로 증가
                                                        //해당 객체들은 어떻게 조회하고 저장할 수 있을까 -> repository 생성
    private Long id;

    @NonNull
    private String name;

    @NonNull
    private String email;

    @Enumerated(value = EnumType.STRING)
    private Gender gender;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

//    @PrePersist
//    public void prePersist(){
//        this.createdAt = LocalDateTime.now();
//        this.updatedAt = LocalDateTime.now();
//    }
//
//    @PreUpdate
//    public void preUpdate(){
//
//        this.updatedAt = LocalDateTime.now();
//    }

}