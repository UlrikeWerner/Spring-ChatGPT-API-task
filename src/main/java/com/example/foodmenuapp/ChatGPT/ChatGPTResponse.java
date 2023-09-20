package com.example.foodmenuapp.ChatGPT;

import java.util.List;

public record ChatGPTResponse(
        List<ChatGPTChoice> choices
) {
}
