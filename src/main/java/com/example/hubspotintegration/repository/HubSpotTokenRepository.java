package com.example.hubspotintegration.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.hubspotintegration.model.HubSpotToken;

@Repository
public interface HubSpotTokenRepository extends JpaRepository<HubSpotToken, Long> {

    HubSpotToken findFirstByOrderByCreatedAtDesc();
}
