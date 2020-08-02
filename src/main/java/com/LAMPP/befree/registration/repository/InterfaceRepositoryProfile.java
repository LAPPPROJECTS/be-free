package com.LAMPP.befree.registration.repository;

import com.LAMPP.befree.messaging.Message;
import com.LAMPP.befree.registration.model.Profile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface InterfaceRepositoryProfile extends JpaRepository<Profile, UUID> {

    public Profile getByLogin(String login);


}
