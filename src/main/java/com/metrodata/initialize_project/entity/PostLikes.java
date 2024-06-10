package com.metrodata.initialize_project.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tb_tr_post_likes")
public class PostLikes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PostLike_id")
    private Integer id;

        @Column(name = "up_count", nullable = false)
        private int upCount;

        @Column(name = "down_count", nullable = false)
        private int downCount;

        @OneToOne(mappedBy = "postLike", cascade = CascadeType.ALL)
        @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
        private Threads thread;
        
    }

