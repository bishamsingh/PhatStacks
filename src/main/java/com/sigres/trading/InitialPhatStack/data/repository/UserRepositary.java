package com.sigres.trading.InitialPhatStack.data.repository;

/* Initial PhatStack skeleton 
 * Bisham Singh
 * June 13, 2019
 */


import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.sigres.trading.InitialPhatStack.data.entity.User;

@Repository
public interface UserRepositary extends PagingAndSortingRepository<User, Long> {
}
