package com.example.demo.dao;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.ContactEntity;






@Repository
public interface ContactDtls extends JpaRepository<ContactEntity, Serializable> {



}
