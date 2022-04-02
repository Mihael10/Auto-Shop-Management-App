package com.avtosalon.auto_shop_management.repository;

import com.avtosalon.auto_shop_management.entity.ModeliEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ModeliRepository extends JpaRepository<ModeliEntity, Integer> {



}
