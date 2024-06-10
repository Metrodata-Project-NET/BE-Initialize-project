package com.metrodata.Model;
 
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Tb_M_Article {
    private Long UUID;
    private String title;
    private String slug;
    private String body;
    private String banner;
    private String image;
}