package com.example.pgsqlspringboot.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.pgsqlspringboot.model.vehicleForm;

public interface vehicleRepo extends CrudRepository<vehicleForm,String>{

}
