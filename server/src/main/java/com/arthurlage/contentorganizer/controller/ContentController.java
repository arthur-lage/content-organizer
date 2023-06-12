package com.arthurlage.contentorganizer.controller;

import com.arthurlage.contentorganizer.model.Content;
import com.arthurlage.contentorganizer.service.ContentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/content")
public class ContentController {
    private ContentService contentService;

    public ContentController (ContentService contentService) {
        this.contentService = contentService;
    }

    public ResponseEntity<List<Content>> getAllContents () {
        List<Content> contentList = this.contentService.findAll();
        return ResponseEntity.ok(contentList);
    }
}
