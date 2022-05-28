package com.pocket.police.domain;

import org.springframework.data.jpa.repository.JpaRepository;

import javax.swing.text.html.parser.Entity;

public interface AccountRepository extends JpaRepository<Account, String> {
}
