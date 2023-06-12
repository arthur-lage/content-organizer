package com.arthurlage.contentorganizer.repository;

import com.arthurlage.contentorganizer.model.Content;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ContentRepository extends JpaRepository<Content, UUID> {
}
