package com.tma.week3Practice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.tma.week3Practice.model.Score;
import com.tma.week3Practice.service.IScoreService;

@RestController
public class ScoreController {
	@Autowired
	private IScoreService scoreService;

	@GetMapping(path = "/scores")
	public @ResponseBody List<Score> findScoresByStudent(@RequestParam int studentID) {
		return scoreService.readScores(studentID);

	}

	@PostMapping(path = "/scores")
	public String createScore(@RequestParam int studentID, @RequestBody Score score) {
		return scoreService.createScores(studentID, score);
	}
}
