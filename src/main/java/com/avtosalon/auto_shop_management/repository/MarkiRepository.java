package com.avtosalon.auto_shop_management.repository;

import com.avtosalon.auto_shop_management.entity.MarkiEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

@Repository
public interface MarkiRepository extends JpaRepository<MarkiEntity, Integer> {


}
