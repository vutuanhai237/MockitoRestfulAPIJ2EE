package com.tma.week3Practice.service;

import java.util.List;

import com.tma.week3Practice.model.Score;

public interface IScoreService {

	public List<Score> readScores(int student_id);

	public String createScores(int student_id, Score score);

	public String check(Score score);
}
