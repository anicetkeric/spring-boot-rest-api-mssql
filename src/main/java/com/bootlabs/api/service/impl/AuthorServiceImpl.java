package com.bootlabs.api.service.impl;


import com.bootlabs.api.entities.Author;
import com.bootlabs.api.repositories.AuthorRepository;
import com.bootlabs.api.service.AuthorService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Service Implementation for managing {@link Author}.
 *
 * @author @bootteam
 */
@Service
@Transactional
public class AuthorServiceImpl implements AuthorService {


    private final AuthorRepository repository;

    public AuthorServiceImpl(AuthorRepository repo) {
        this.repository = repo;
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public Author create(Author d) {
        return repository.save(d);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Author update(Author d) {
        return repository.saveAndFlush(d);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Author getOne(Long id) {
        return repository.findById(id).orElse(null);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Author> getAll() {
        return repository.findAll();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
