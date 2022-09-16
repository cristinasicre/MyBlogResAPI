package com.sicre.springblog.payload;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Data
public class CommentDto {

    private long id;

    //name should not be null or empty
    @NotEmpty(message = "Name should not be null or empty")
    private String name;

    //email should not be null or empty
    @NotEmpty(message = "Email should not be null or empty")
    @Email
    private String email;

    @NotEmpty
    @Size(min = 10, message = "Comment must be minimum 10 characters")
    private String body;

}
