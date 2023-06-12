package com.arthurlage.contentorganizer.service;

import com.arthurlage.contentorganizer.model.Content;
import com.arthurlage.contentorganizer.repository.ContentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContentService {
    private ContentRepository contentRepository;

    public ContentService (ContentRepository contentRepository) {
        this.contentRepository = contentRepository;
    }

    public List<Content> findAll () {
        return this.contentRepository.findAll();
    }
}
