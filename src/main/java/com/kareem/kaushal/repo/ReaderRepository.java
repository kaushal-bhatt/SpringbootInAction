package com.kareem.kaushal.repo;

import com.kareem.kaushal.model.Reader;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Optional;

public interface ReaderRepository extends JpaRepository<Reader, String> {

    Reader findByUsername(String username);
}
