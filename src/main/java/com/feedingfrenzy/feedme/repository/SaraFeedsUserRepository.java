package com.feedingfrenzy.feedme.repository;

import com.feedingfrenzy.feedme.model.SaraFeedsUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * @author Wessel van Dommelen <w.r.van.dommelen@st.hanze.nl>
 */
public interface SaraFeedsUserRepository extends JpaRepository<SaraFeedsUser, Integer> {

    Optional<SaraFeedsUser> findByUsername(String username);
}
