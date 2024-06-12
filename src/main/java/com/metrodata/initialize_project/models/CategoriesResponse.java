package com.metrodata.initialize_project.models;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CategoriesResponse {
    private String message;
    private int code;
    private List<String> error = new ArrayList<>();
    

}
