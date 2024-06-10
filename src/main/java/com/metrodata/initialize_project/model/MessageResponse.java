package com.metrodata.initialize_project.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MessageResponse<T> {

    private String message;
    private int code;
    private List<String> error = new ArrayList<>();
    private T data;

}
