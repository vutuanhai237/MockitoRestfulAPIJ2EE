package com.tma.week3Practice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.tma.week3Practice.model.Score;

@Repository
public interface ScoreRepository extends CrudRepository<Score, Integer> {

	@Query("FROM Score score WHERE score.student_id = :#{#studentID}")
	List<Score> readScores(@Param("studentID") int studentID);
}
