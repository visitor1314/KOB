package com.kob.matchingsystem.service;

public interface MatchingServie {
    String addPlayer(Integer userId, Integer rating, Integer botId);
    String removePlayer(Integer userId);
}
