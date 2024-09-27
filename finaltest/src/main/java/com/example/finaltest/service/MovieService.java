package com.example.finaltest.service;

import com.example.finaltest.dto.MovieRequest;

public interface MovieService {

    String save(MovieRequest request);

    String get(Long id);
}
