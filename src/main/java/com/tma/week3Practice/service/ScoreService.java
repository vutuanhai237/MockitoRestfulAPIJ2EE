package com.tma.week3Practice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tma.week3Practice.model.Score;
import com.tma.week3Practice.repository.ScoreRepository;

@Service
public class ScoreService implements IScoreService {
	@Autowired
	private ScoreRepository scoreRepository;

	@Override
	public String check(Score score) {
		String message = "valid";
		if (score.getName().length() > 20) {
			message = "Score's name's too long";
		} else if (score.getPoint() > 10 || score.getPoint() < 0) {
			message = "Score is not valid";
		}
		return message;
	}

	@Override
	public List<Score> readScores(int student_id) {
		return scoreRepository.readScores(student_id);
	}

	@Override
	public String createScores(int student_id, Score score) {
		score.setStudent_id(student_id);
		String message = this.check(score);
		if (message == "valid") {
			scoreRepository.save(score);
		}
		return message;
	}

}
