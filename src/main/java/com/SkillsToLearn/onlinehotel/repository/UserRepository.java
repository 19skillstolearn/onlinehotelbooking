package com.SkillsToLearn.onlinehotel.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.SkillsToLearn.onlinehotel.formbean.UserFormBean;

@Repository
public interface UserRepository extends MongoRepository<UserFormBean, String> {
}

