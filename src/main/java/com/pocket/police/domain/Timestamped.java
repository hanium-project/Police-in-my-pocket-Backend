package com.pocket.police.domain;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDate;
import java.time.LocalDateTime;

@MappedSuperclass // 상속했을 때, 컬럼으로 인식하게 함
@EntityListeners(AuditingEntityListener.class)
public class Timestamped {

    @CreatedDate // 생성 일자
    private LocalDateTime createdAt = LocalDateTime.now();


    @LastModifiedDate // 수정 일자
    private LocalDateTime modifiedAt = LocalDateTime.now();

}
