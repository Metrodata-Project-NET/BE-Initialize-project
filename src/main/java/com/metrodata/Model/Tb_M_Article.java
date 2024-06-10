package com.metrodata.Model;
 
import java.util.Date;

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
    private enum Type {
        Artikel,
        Informasi,
        Promosi
    };
    private enum Status {
        Published,
        Draft,
        Deleted
    };
    private int is_slide_show;
    private int counter;
    private Date created_at;
    private Date updated_at;
}