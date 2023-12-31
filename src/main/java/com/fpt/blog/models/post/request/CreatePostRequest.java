package com.fpt.blog.models.post.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.web.multipart.MultipartFile;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CreatePostRequest {

    private MultipartFile thumbnail;

    private String title;

    private long categoryId;

    private String tags;

    private String content;

    private boolean commentEnabled = false;

    private String description;

}
