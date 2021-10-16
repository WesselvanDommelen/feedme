package com.feedingfrenzy.feedme.service.implementation;

import com.feedingfrenzy.feedme.repository.SaraFeedsUserRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * @author Wessel van Dommelen <w.r.van.dommelen@st.hanze.nl>
 */

@Service
public class SaraFeedsUserDetailService implements UserDetailsService {

    private final SaraFeedsUserRepository saraFeedsUserRepository;

    public SaraFeedsUserDetailService(SaraFeedsUserRepository saraFeedsUserRepository) {
        this.saraFeedsUserRepository = saraFeedsUserRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return saraFeedsUserRepository.findByUsername(username).orElseThrow(
                () -> new UsernameNotFoundException("User " + username + " not found"));
    }
}
